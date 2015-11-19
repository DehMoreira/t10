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
    private int cnpj;
    private String razao_sozial;
    private String nome_fantasia;
    private Endereco end;
    private String bandeira;
    private String imagem;
    private Combustivel comb;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_sozial() {
        return razao_sozial;
    }

    public void setRazao_sozial(String razao_sozial) {
        this.razao_sozial = razao_sozial;
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

    public Combustivel getComb() {
        return comb;
    }

    public void setComb(Combustivel comb) {
        this.comb = comb;
    }
    

}
