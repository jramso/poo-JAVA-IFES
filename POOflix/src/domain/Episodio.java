package POOflix.src.domain;

public class Episodio{

    private int id;
    private String titulo;
    private String resumo;
    private int temporada;
    public Episodio(int id, int temp, String title){
        this.id=id;
        this.temporada=temp;
        this.titulo=title;
    }

    public int getId(){
        return this.id;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getTemporada() {
        return temporada;
    }

}