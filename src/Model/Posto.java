/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author debora
 */
public class Posto {
    //CNPJ, Razão Social, Nome Fantasia, Bandeira (marca da distribuidora), Endereço, Bairro, CEP e Imagem
     int cnpj;
     String razao_social;
     String nome_fantasia;
     Endereco end;
     String bandeira;
     String imagem;
     Total_Combustivel comb;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_sozial) {
        this.razao_social = razao_sozial;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Total_Combustivel getComb() {
        return comb;
    }

    public void setComb(Total_Combustivel comb) {
        this.comb = comb;
    }

    @Override
    public String toString() {
        return "Posto{" + "cnpj=" + cnpj + ", razao_social=" + razao_social + ", nome_fantasia=" + nome_fantasia + ", end=" + end + ", bandeira=" + bandeira + ", imagem=" + imagem + ", comb=" + comb + '}';
    }
    
    

}
