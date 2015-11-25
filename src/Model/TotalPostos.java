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
import javax.swing.JOptionPane;

/**
 *
 * @author debora
 */
public class TotalPostos {
       
        ArrayList<Posto> p = new ArrayList();

    public void Add(Posto posto) {
      p.add(posto);
    }
      
    public Posto BuscaPosto (String cnpj) {
      LeArquivo();
      Posto achou = null;
      for (int i = 0; i < p.size(); i++) {
         if (cnpj.equals(p.get(i).getCnpj())) {
            achou = p.get(i);
         }
               }
      return achou;
      }
    
    //Teste - dlt depois
    public String Mostra () {
      String result = "";
      for (int i = 0; i < p.size(); i++) {
          System.out.println(i + ":");
         result += p.get(i).toString() + '\n';
      }
      return ("".equals(result)) ? ("Ainda não foi cadastrado nenhum posto!") : (result);
    } 
    
    
    
    
    public void SalvaArquivo (Posto posto){
        File dir = new File(".");
        File arq = new File(dir, "postos.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(arq, true);
        } catch (IOException ex) {
            Logger.getLogger(TotalPostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(posto.getCnpj() + "|" + posto.getRazao_social() + "|" + posto.getNome_fantasia() + "|" + posto.getBandeira() + "|" + posto.getImagem() + "|" + posto.getEndereco() + "|" + posto.getCep() + "|" + posto.getBairro() );
            printWriter.flush();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Posto cadastrado com sucesso");
        }
    }
    
    public void LeArquivo() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("postos.txt"))
                    .useDelimiter("\\||\\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TotalPostos.class.getName()).log(Level.SEVERE, null, ex);
             }
        
        while (scanner.hasNext()) {
            String cnpj = scanner.next();
            System.out.println(cnpj);
            String razao_social = scanner.next();
            System.out.println(razao_social);
            String nome_fantasia = scanner.next();
            System.out.println(nome_fantasia);
            String bandeira = scanner.next();
            System.out.println(bandeira);
            String endereco = scanner.next();
            System.out.println(endereco);
            String cep = scanner.next();
            System.out.println(cep);
            String bairro = cep.substring(0, cep.length() - 1);
            System.out.println(bairro);
            
            //int i = Integer.parseInt(cep);
            int i= 1;
            
            Posto posto = new Posto();
            posto.setCnpj(cnpj);
            posto.setRazao_social(razao_social);
            posto.setNome_fantasia(nome_fantasia);
            posto.setBandeira(bandeira);
            posto.setEndereco(endereco);
            posto.setBairro(bairro);
            posto.setCep(i);
            
            Add(posto);
        }
    }
}

