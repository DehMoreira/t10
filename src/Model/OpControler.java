/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author debora
 */
public class OpControler {
    Combustivel combustivel = new Combustivel();
    Data data = new Data();
    Posto posto = new Posto();
    TotalCombustivel tc = new TotalCombustivel();
    TotalPostos tp = new TotalPostos();
    
    public void Cadastro (String cnpj, String razao_social, String nome_fantasia, String bandeira, String imagem, String endereco, String bairro, String cep) {      
                Posto aux = new Posto();
                aux.setCnpj(cnpj);
                tp.LeArquivo();
                if(tp.BuscaPosto(aux.getCnpj())== null){
                    Posto p = new Posto();                   
                    p.setCnpj(cnpj);
                    p.setRazao_social(razao_social);
                    p.setNome_fantasia(nome_fantasia);
                    p.setBandeira(bandeira);
                    p.setImagem(imagem);
                    p.setEndereco(endereco);
                    p.setBairro(bairro);
                    int n = Integer.parseInt(cep);
                    p.setCep(n); 
                    tp.Add(p);
                    tp.SalvaArquivo(p);
                    JOptionPane.showMessageDialog(null, "Posto Cadastrado com sucesso");
                } 
                
                else
                    JOptionPane.showMessageDialog(null, "CNPJ do posto já cadastrado");
}


    
}
