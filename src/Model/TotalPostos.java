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
    
    
    
    
    public void SalvaArquivo (Posto posto){
        File dir = new File(".");
        File arq = new File(dir, "postos.json");
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
            scanner = new Scanner(new FileReader("postos.json"))
                    .useDelimiter("\\||\\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TotalPostos.class.getName()).log(Level.SEVERE, null, ex);
             }
        
        while (scanner.hasNext()) {
            String cnpj = scanner.next();
            String razao_social = scanner.next();
            String nome_fantasia = scanner.next();
            String bandeira = scanner.next();
            String imagem = scanner.next();
            String endereco = scanner.next();
            String cep = scanner.next();
            String aux = scanner.next();
            String bairro = aux.substring(0, aux.length() - 1);


                      
            int i = Integer.parseInt(cep);
            
            Posto posto = new Posto();
            posto.setCnpj(cnpj);
            posto.setRazao_social(razao_social);
            posto.setNome_fantasia(nome_fantasia);
            posto.setBandeira(bandeira);
            posto.setImagem(imagem);
            posto.setEndereco(endereco);
            posto.setBairro(bairro);
            posto.setCep(i);
            
            Add(posto);
        }
    }
}

