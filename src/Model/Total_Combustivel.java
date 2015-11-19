/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author debora
 */
public class Total_Combustivel {
    
    ArrayList<Combustivel> c = new ArrayList();
    

    public void Add (Combustivel combustivel){
        c.add(combustivel);
    }

    @Override
    public String toString() {
        return "Total_Combustivel{" + "c=" + c + '}';
    }
    
    
    
}
