package CDU;

import UI.*;
import UI.FormEpisodio;
import UI.FormSerie;

public class CDUMain extends CDU {
    private FormMain formMain;

    public CDUMain(FormMain formMain) {
        this.formMain = formMain;
        this.formMain.setcdu(this);
    }

    public void exec() {
        formMain.exibe();
    }

    public void processaOpcao(String opcao) {
        switch (opcao) {
            case "1":
                execCadSerie();
                break; // Serie
            case "2":
                execCadEpisodio();
                break; // Episodio
            case "3":
                execCadPers();
                break; // personagem
            case "4":
                execCadAtor();
                break; // Ator
        }
    }

    public void execCadSerie() {
        FormSerie telaSerie = new FormSerie();
        CDUcadastrarSerie casoUsoSerie = new CDUcadastrarSerie(telaSerie);
        casoUsoSerie.exec();
    }

    public void execCadEpisodio() {
        FormEpisodio telaEpisodio = new FormEpisodio();
        CDUcadastrarEpis casoUsoEpis = new CDUcadastrarEpis(telaEpisodio);
        casoUsoEpis.exec();
    }

    public void execCadPers() {
        FormPersonagem telaPers = new FormPersonagem();
        CDUcadastrarPers casoUsoPers = new CDUcadastrarPers(telaPers);
        casoUsoPers.exec();
    }

    public void execCadAtor() {
        FormAtor telaAtor = new FormAtor();
        CDUcadastrarAtor casoUsoAtor = new CDUcadastrarAtor(telaAtor);
        casoUsoAtor.exec();
    }

}
