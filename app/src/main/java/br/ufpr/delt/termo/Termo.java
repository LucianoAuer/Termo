package br.ufpr.delt.termo;

public class Termo {
    private String termo;
    private String palavra;
    public Termo(String palavra, String termo) {
        this.palavra = palavra;
        this.termo = termo;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }
    public String getPalavra() {
        return palavra;
    }
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public String toString() {
        return palavra;
    }
}
