package POOflix.src.CDU;

import POOflix.src.UI.*;
import POOflix.src.domain.*;

public class CDUcadastrarEpis extends CDU {
    private Episodio episodio = null;
    private FormEpisodio formEpisodio;

    public void exec() {
        formEpisodio.exibe();
    }

    public CDUcadastrarEpis(FormEpisodio formEpisodio){
        this.formEpisodio = formEpisodio;
        this.formEpisodio.setcdu(this);
    }

    public String getNomeSerie(int idserie) {
        // Serie serie = bd.getSerie(idserie); EM OBRAS.
        // return serie.gettitulo();
        return "Black Mirror";
    }

    public void salvarEpisodio() {
        String id = formEpisodio.getid();
        String numEP = formEpisodio.getnumEP();
        String idserie = formEpisodio.getidserie();
        String temporada = formEpisodio.gettemporada();
        String titulo = formEpisodio.gettitulo();
        String resumo = formEpisodio.getresumo();

        episodio = new Episodio(Integer.parseInt(id),Integer.parseInt(numEP),Integer.parseInt(temporada),titulo,resumo);   

        //bd.salvarEpisodio(episodio);
        System.out.println("Salvando no banco de dados.." + episodio);
    }
}