package POOflix.src.domain;

public class Serie {
    private int id;
    private String titulo;
    private int idade;

    public Serie(int id, String titulo, Integer idade){
        this.id=id;
        this.titulo=titulo;
        this.idade=idade;
    }

    //public Serie();

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIdade() {
        return idade;
    }

}
