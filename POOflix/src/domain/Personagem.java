package POOflix.src.domain;

public class Personagem {
    
    private int id;
    private String nome;

    Personagem (int id, String nome){
        this.id=id;
        this.nome=nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
