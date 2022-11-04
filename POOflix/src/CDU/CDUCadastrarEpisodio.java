package POOflix.src.CDU;
import POOflix.src.domain.Episodio;

public class CadastrarEpisodio {
 
    
    private Episodio episodio;
    private Episodio formEpisodio;

    public CDUcadastrarEpisodio(FormEpisodio formEpisodio){
        this.formEpisodio = FormEpisodio;
        this.formEpisodio.setcdu(this);
    }

    public void salvarEpisodio(String id, String idserie, String titulo,String temporada, String resumo){
        episodio=new Episodio(Integer.parseInt(id), Integer.parseInt(temporada),titulo);
        episodio.setResumo(resumo);
    }
}
