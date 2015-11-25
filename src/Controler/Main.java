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
import Model.TotalCombustivel;


/**
 *
 * @author debora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    TotalPostos tp = new TotalPostos();
    TotalCombustivel tc = new TotalCombustivel();
    Combustivel combustivel = new Combustivel();
        Posto posto = new Posto();
        Data data = new Data();
        
    tp.LeArquivo();
    
    posto=tp.BuscaPosto("1a");
    data.setDia(03);
    data.setMes(07);
    data.setAno(1995);
  
    
    combustivel.setPosto(posto);
    combustivel.setData_preco(data);
    combustivel.setTipo("gasolina");
    combustivel.setPreco((float) 2.5);

    
    tc.Add(combustivel);
    tc.SalvaArquivo(combustivel);
        

       
        
        
        // TODO code application logic here
    }
    
}
