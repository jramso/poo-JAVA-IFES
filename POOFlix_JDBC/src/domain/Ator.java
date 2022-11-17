package domain;

import java.io.Serializable;

import connection.annotation.*;

//@Entidade
//@Tabela(tabela = "Ator")
public class Ator implements Serializable {

    //@Coluna(col = "id", pk = true)
    private int id;
    //@Coluna(col = "nome")
    private String nome;
    //@Coluna(col = "nacionalidade")
    private String nacionalidade;

    public Ator(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Ator() {
        // Using hibernate Library
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    // Setters
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

}