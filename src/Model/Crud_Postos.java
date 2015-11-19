/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author debora
 */
public class Crud_Postos {
       
        ArrayList<Posto> p = new ArrayList();
           
        public void GravaArq(Posto p){
        try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("postos.txt", true));
                    bw.write(p.cnpj + "_" + p.razao_social + "_" + p.end + "_" + p.bandeira + "_" + p.imagem + "_" + p.comb );
                    bw.newLine();
                    bw.close();
                } catch (IOException e) {}
    }
    
}
