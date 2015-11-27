/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.OpControler;



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
        System.out.println(cnpj);
        model.Cadastro (cnpj, razao_social, nome_fantasia, bandeira, imagem, endereco, bairro, cep);
            
    }


    
}
