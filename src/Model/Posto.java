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
    
     private String cnpj;
     private String razao_social;
     private String nome_fantasia;
     private String bandeira;
     private String imagem;
     private String endereco;
     private String bairro;
     private int cep;
     
     
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
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
    

    @Override
    public String toString() {
        return "Cnpj: " + cnpj + "   Razao Social: " + razao_social + "   Nome Fantasia: " + nome_fantasia + "   Bandeira: " + bandeira + "   Endereco: " + endereco + "   Bairro: " + bairro + "   Cep: " + cep;
    }

    

}
