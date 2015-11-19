/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Combustivel;
import Model.Crud_Postos;
import Model.Data;
import Model.Endereco;
import Model.Posto;
import Model.Total_Combustivel;


/**
 *
 * @author debora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Combustivel combustivel = new Combustivel();
        Endereco end = new Endereco();
        Posto posto = new Posto();
        Crud_Postos cp = new Crud_Postos();
        Total_Combustivel tc = new Total_Combustivel();
        Data data = new Data();
        
        
        data.setDia(10);
        data.setMes(07);
        data.setAno(2015);
        
        combustivel.setData_preco(data);
        combustivel.setPreco((float) 2.50);
        combustivel.setTipo("gasolina");
        
        tc.Add(combustivel);
        
        end.setBairro("JK");
        end.setCep(97035560);
        end.setEndereco("aaaaaaaa");
        
        posto.setCnpj(101010);
        posto.setBandeira("aaaa");
        posto.setComb(tc);
        posto.setEnd(end);
        posto.setImagem("aaaaaaa");
        posto.setNome_fantasia("santa marta");
        posto.setRazao_social("aaaa");
        
        
        System.out.println(posto);
        
        
        // TODO code application logic here
    }
    
}
