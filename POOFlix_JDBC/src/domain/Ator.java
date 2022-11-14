package domain;

import java.io.Serializable;

public class Ator implements Serializable {

    private int id;
    private String nome;
    private int nacionalidade;

    /*
     * public Ator(int id,String nome){
     * this.id=id;
     * this.nome=nome;
     * }
     */
    public Ator() {

    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getNacionalidade() {
        return nacionalidade;
    }

    // Setters
    public void setNacionalidade(int nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

}