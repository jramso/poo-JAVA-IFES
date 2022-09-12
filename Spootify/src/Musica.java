import java.util.ArrayList;

public class Musica extends Conteudo{
    
    private String genero;
    private ArrayList<String> compositor;
    private ArrayList<String> interprete;
    public Musica(String titulo, int duracao, String genero, ArrayList<String> compositor, ArrayList<String> interprete){
        super(titulo, duracao);
        this.genero=genero;
        this.compositor=compositor;
        this.interprete=interprete;
    }


    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public ArrayList<String> getCompositor() {
        return compositor;
    }
    public void setCompositor(ArrayList<String> compositor) {
        this.compositor = compositor;
    }
    public ArrayList<String> getInterprete() {
        return interprete;
    }
    public void setInterprete(ArrayList<String> interprete) {
        this.interprete = interprete;
    }

}
