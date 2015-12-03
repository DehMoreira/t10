/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author debora
 */
public class TotalCombustivel {
    
         ArrayList<Combustivel> c = new ArrayList();
         
    public void Add(Combustivel comb) {
      c.add(comb);
    }
 
    
   public String MostraHistorico(String cnpj) {
      LeArquivo();
      String result = "";
      for (int i = 0; i < c.size(); i++) {
       if (cnpj.equals(c.get(i).getPosto().getCnpj()))
         result += c.get(i).toString() + '\n';
      }
      return ("".equals(result)) ? ("Não foram encontrados historicos de preços!") : (result);
   }
    
    public void SalvaArquivo(Combustivel comb){
        File dir = new File(".");
        File arq = new File(dir, "historicocomb.json");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(arq, true);
        } catch (IOException ex) {
            Logger.getLogger(TotalCombustivel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println (comb.getPosto().getCnpj() + "|" + comb.getData_preco().getDia() + "|" + comb.getData_preco().getMes() + "|" + comb.getData_preco().getAno() + "|" + comb.getTipo() +  "|" + comb.getPreco());
            printWriter.flush();
        } catch (Exception e) {
            
        }
    }
    
    public void LeArquivo(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("historicocomb.json"))
                    .useDelimiter("\\||\\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TotalCombustivel.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (scanner.hasNext()) {

            String cnpjPosto = scanner.next();
            String dia = scanner.next();
            String mes = scanner.next();
            String ano = scanner.next();
            String tipo = scanner.next();
            String aux= scanner.next();
            String preco = aux.substring(0, aux.length() - 1);
            
            TotalPostos tp = new TotalPostos();
            Posto posto = new Posto();
            
            tp.LeArquivo();
            posto=tp.BuscaPosto(cnpjPosto);
                       
            int d = Integer.parseInt(dia);
            int m = Integer.parseInt(mes);
            int a = Integer.parseInt(ano);
            float p = Float.parseFloat(preco);
            
            Data data = new Data();
            data.setDia(d);
            data.setMes(m);
            data.setAno(a);
            
            Combustivel combustivel = new Combustivel();
            combustivel.setPosto(posto);
            combustivel.setData_preco(data);
            combustivel.setPreco(p);
            combustivel.setTipo(tipo);
            
            c.add(combustivel);
            
                     
            
        }
    }

    
}
