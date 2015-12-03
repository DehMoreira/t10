/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.FlowLayout;
import java.awt.MediaTracker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


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
    
    
    public JFrame GeraPainel (String cnpj) throws MalformedURLException {
            Posto achou = null;
            LeArquivo();
            for (int i = 0; i < p.size(); i++) {
            if (cnpj.equals(p.get(i).getCnpj())) {
                JFrame frame = new JFrame(); 
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(580, 580);
                JPanel painel = new JPanel();
                painel.setLayout(new FlowLayout()); 
                achou = p.get(i);
                
                JLabel j = new JLabel();
                j.setText("CNPJ: " + achou.getCnpj());
                j.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
                painel.add(j);
                JLabel j1 = new JLabel();
                j1.setText("Razão Socia: " + achou.getRazao_social());
                j1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
                painel.add(j1);
                JLabel j2 = new JLabel();
                j2.setText("Nome Fantasia: " + achou.getNome_fantasia());
                j2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
                painel.add(j2);
                JLabel j3 = new JLabel();
                j3.setText("Bandeira: " + achou.getBandeira());
                j3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
                painel.add(j3);
                JLabel j4 = new JLabel();
                j4.setText("Endereço: " + achou.getEndereco());
                j4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
                painel.add(j4); 
                JLabel j5 = new JLabel();
                j5.setText("Bairro: " + achou.getBairro());
                j5.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
                painel.add(j5);
                JLabel j6 = new JLabel();
                j6.setText("CEP: " + achou.getCep());
                j6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
                painel.add(j6);       
                JLabel jLabel = new JLabel();
                jLabel.setText("Imagem:  ");
                jLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
                painel.add(jLabel);
                JLabel lblImg = new JLabel(); 
                URL urlImg = new URL(achou.getImagem());
                ImageIcon imgIcon = new ImageIcon(urlImg);
                while(imgIcon.getImageLoadStatus() == MediaTracker.LOADING); 
                lblImg.setIcon(imgIcon);
                painel.add(lblImg);
                frame.getContentPane().add(painel);
                frame.setVisible(true);
                return frame;                 
         }
               }

            return null;
      }

    
    
   public Posto Aux (String bairro) {
      Posto achou = null;
      for (int i = 0; i < p.size(); i++) {
         if (bairro.equals(p.get(i).getBairro())) {
            achou = p.get(i);
         }
               }
      return achou;
      }
    
    
    public String MostraBairro(String bairro) {
      String result = "";
      for (int i = 0; i < p.size(); i++) {
        if (bairro.equals(p.get(i).getBairro()))
         result += p.get(i).toString() + '\n';
      }
      return ("".equals(result)) ? ("Não foram encontrados postos!") : (result);
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

