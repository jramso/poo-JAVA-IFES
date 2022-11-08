package Spootify;

/**
 * @author Josue Ramos Souza
 * @version 1.1
 * @since 09-13-2022
 */
import java.util.ArrayList;

public class AudioLivro extends Conteudo{
    
    private ArrayList<String> autor;
    private String editora;
    private String narrador;
    private String sinopse;
    public AudioLivro(String titulo,int duracao,String editora, String narrador,String sinopse)throws Exception{
        super(titulo,duracao);
        if(editora=="" || narrador=="" || sinopse==""){
            throw new Exception("dados de audioLivro nao podem ser vazios");
        }else{
            this.editora=editora;
            this.narrador=narrador;
            this.sinopse=sinopse;
            this.autor=new ArrayList<>();
        }
    }

    /**
     * @param aut
     * @return ArrayList<String> - Lista de autores
     */
    public ArrayList<String> addAutor(String aut){
        autor.add(aut);
        return this.autor;
    }


    /*
     * Getters and Setters
     */
    public ArrayList<String> getAutor() {
        return autor;
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

    public String toString() {
        return super.toString()+"\nEditora: "+getEditora()+"\nNarrador: "+getNarrador()+"\nSinopse:"+getSinopse();
    }

}
