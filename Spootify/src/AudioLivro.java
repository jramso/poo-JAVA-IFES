import java.util.ArrayList;

public class AudioLivro extends Conteudo{
    
    private ArrayList<String> autor;
    private String editora;
    private String narrador;
    private String sinopse;
    public AudioLivro(String titulo,int duracao,String editora, String narrador,String sinopse, ArrayList<String> autores){
        super(titulo, duracao);
        this.editora=editora;
        this.narrador=narrador;
        this.sinopse=sinopse;
        this.autor=autores;
    }
    public ArrayList<String> getAutor() {
        return autor;
    }
    public void setAutor(ArrayList<String> autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getNarrador() {
        return narrador;
    }
    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

}
