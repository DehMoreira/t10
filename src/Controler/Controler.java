/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.OpControler;
import java.net.MalformedURLException;




/**
 *
 * @author debora
 */
public class Controler {

    /**
     * @param args the command line arguments
     */
    //ViewPostos view = new ViewPostos();
    OpControler model = new OpControler();
    
    
    public void Cadastro(String cnpj, String razao_social, String nome_fantasia, String bandeira, String imagem, String endereco, String bairro, String cep){
        model.Cadastro (cnpj, razao_social, nome_fantasia, bandeira, imagem, endereco, bairro, cep);           
    }
    
    public void CadastroP(String cnpj, int dia, int mes, String ano, String combustivel, String preco){
        model.Cadastro_preco(cnpj, dia, mes, ano, combustivel, preco);
    }
    
    public void Mostra (String bairro) throws MalformedURLException{
        model.MostraPostoBairro(bairro);
    }
    
    public void Mostra2 (String cnpj) throws MalformedURLException{
        model.MostraPosto(cnpj);
    }
    
    public void Altera (String cnpj, String razao_social, String nome_fantasia, String bandeira, String imagem, String endereco, String bairro, String cep){
        model.AlteraCadastro(cnpj, razao_social, nome_fantasia, bandeira, imagem, endereco, bairro, cep);
    }
    
}
