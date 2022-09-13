
/**
 * @author Josue Ramos Souza
 * @version 1.2
 * @since 09-13-2022
 */

import java.util.ArrayList;
public class Musica extends Conteudo{
    
    private String genero;
    private ArrayList<String> compositor;
    private ArrayList<String> interprete;
    public Musica(String titulo, int duracao, String genero){
        super(titulo, duracao);
        this.genero=genero;
        this.compositor= new ArrayList<>();
        this.interprete= new ArrayList<>();
    }

    /**
     * @param compo
     * @return ArrayList<String> - Lista de compositores
     */
    public ArrayList<String> addCompositor(String compo){
        compositor.add(compo);
        return this.compositor;
    }

    /**
     * @param inter
     * @return ArrayList<String> - Lista de interpretes
     */
    public ArrayList<String> addInterprete(String inter){
        interprete.add(inter);
        return this.interprete;
    }


    /*
     * Getters and Setters
     */
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public ArrayList<String> getCompositor() {
        return compositor;
    }

    public ArrayList<String> getInterprete() {
        return interprete;
    }

    /*
     * ToString
     */

    public String toString(){
        return "Nome da Musica: "+getTitulo()+"\nCompositores: "+getCompositor()+"\nGenero Musical: "+getGenero()+"\nInterpretes: "+getInterprete();
    }

}
