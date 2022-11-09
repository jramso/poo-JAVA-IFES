package POOflix.src.CDU;
import POOflix.src.domain.Episodio;
import POOflix.src.UI.FormEpisodio;

public class CDUCadastrarEpisodio {
 
    
    private Episodio episodio;
    private Episodio formEpisodio;

    public CDUCadastrarEpisodio(FormEpisodio formEpisodio){
        this.formEpisodio = FormEpisodio;
        this.formEpisodio.setcdu(this);
    }

    public void salvarEpisodio(String id, String idserie, String titulo,String temporada, String resumo){
        episodio=new Episodio(Integer.parseInt(id), Integer.parseInt(temporada),titulo);
        episodio.setResumo(resumo);
    }
}
