/**
 * @author Josue Ramos Souza
 * @version 1.3
 * @since 09-13-2022
 */

public abstract class Conteudo {
    private String titulo;
    private int duracao;

    public Conteudo(String titulo,int duracao){
        this.titulo=titulo;
        this.duracao=duracao;
    }

    

    /*
     * Getters and Setters
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Titulo:"+getTitulo()+"\nDuracao(em segundos):"+getDuracao();
    }
    
}
