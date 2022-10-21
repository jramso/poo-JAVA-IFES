package POOflix.src.domain;
public class Ator{

    private int id;
    private String nome;
    private int nacionalidade;

    public Ator(int id,String nome){
        this.id=id;
        this.nome=nome;
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