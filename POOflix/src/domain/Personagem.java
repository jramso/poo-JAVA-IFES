package domain;
import java.util.LinkedList;
public class Personagem {
    
    private int id;
    private String nome;
    private LinkedList<Performance> perfomances;


    public Personagem (int id, String nome){
        this.id=id;
        this.nome=nome;
    }

    
	public void adperformance(Performance p){
        perfomances.add(p);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
