/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Combustivel;
import Model.TotalPostos;
import Model.Data;
import Model.Posto;


/**
 *
 * @author debora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Posto posto = new Posto();
        posto.setBairro("1");
        posto.setBandeira("1");
        posto.setCep(1);
        posto.setCnpj("1");
        posto.setEndereco("1");
        posto.setImagem("1");
        posto.setNome_fantasia("1");
        posto.setRazao_social("1");
        
        Posto posto2 = new Posto();
        posto2.setBairro("2");
        posto2.setBandeira("2");
        posto2.setCep(2);
        posto2.setCnpj("2");
        posto2.setEndereco("2");
        posto2.setImagem("2");
        posto2.setNome_fantasia("2");
        posto2.setRazao_social("2");
        
        Posto posto3 = new Posto();
        posto3.setBairro("3");
        posto3.setBandeira("3");
        posto3.setCep(3);
        posto3.setCnpj("3");
        posto3.setEndereco("3");
        posto3.setImagem("3");
        posto3.setNome_fantasia("3");
        posto3.setRazao_social("3");
        
        TotalPostos tp = new TotalPostos();
 
        tp.Add(posto);
        tp.Add(posto2);
        tp.Add(posto3);
        
        tp.SalvaArquivo(posto);
        tp.SalvaArquivo(posto2);
        tp.SalvaArquivo(posto3);
        
        // TODO code application logic here
    }
    
}
