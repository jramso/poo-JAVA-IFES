package domain;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ator")
public class Ator{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column(name="nome")
    private String nome;
	@Column(name="nacionalidade")
    private int nacionalidade;

    /*public Ator(int id,String nome){
        this.id=id;
        this.nome=nome;
    }*/
    public Ator(){
    	
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
    //Setters
    public void setNacionalidade(int nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

}