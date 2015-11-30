/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.net.MalformedURLException;
import javax.swing.JOptionPane;


/**
 *
 * @author debora
 */
public class OpControler {
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

    public void Cadastro_preco(String cnpj, int dia, int mes, String ano, String combustivel, String preco){
            Posto aux = new Posto();
            aux.setCnpj(cnpj);
            tp.LeArquivo();
            if(tp.BuscaPosto(aux.getCnpj())!= null){
                int a = Integer.parseInt(ano);
                float p = Float.parseFloat(preco);
                Data data = new Data();
                data.setDia(dia);
                data.setMes(mes);
                data.setAno(a);
                Combustivel comb = new Combustivel();
                comb.setPosto(aux);
                comb.setPreco(p);
                comb.setTipo(combustivel);
                comb.setData_preco(data);
                tc.Add(comb);
                tc.SalvaArquivo(comb);
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            }
            else
                JOptionPane.showMessageDialog(null, "CNPJ do posto não foi encontrado");
    }
    
    public void MostraPosto(String cnpj) throws MalformedURLException {
           tp.LeArquivo();
           //tc.LeArquivo();
        if(tp.BuscaPosto(cnpj)!= null){

           tp.GeraPainel(cnpj);
        }
        else 
            JOptionPane.showMessageDialog(null, "CNPJ do posto não está cadastrado");
    }
    
    public void MostraPostoBairro(String bairro) {
        tp.LeArquivo();
        if(tp.BuscaPostoBairro(bairro)!= null){
            JOptionPane.showMessageDialog(null, "Postos cadastrados no bairro: " + bairro + "\n" + tp.BuscaPostoBairro(bairro));
        
        }
        else
                JOptionPane.showMessageDialog(null, "Não há postos deste bairro cadastrados");
    }

}
       
    

