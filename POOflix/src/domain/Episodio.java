package POOflix.src.domain;

public class Episodio{

    private int id;
    private int numEP;
    private String titulo;
    private String resumo;
    private int temporada;
    public Episodio(int id, int numEP,int temp, String title,String resumo){
        this.id=id;
        this.numEP=numEP;
        this.temporada=temp;
        this.titulo=title;
    }

    public int getNumEP() {
        return numEP;
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