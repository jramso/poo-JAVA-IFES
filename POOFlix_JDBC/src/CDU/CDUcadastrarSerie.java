package CDU;

import domain.*;
import UI.FormSerie;

public class CDUcadastrarSerie extends CDU {
    private Serie serie;
    private FormSerie formSerie;

    public CDUcadastrarSerie(FormSerie formSerie) {
        this.formSerie = formSerie;
        this.formSerie.setcdu(this);
    }

    public void exec() {
        formSerie.exibe();
    }

    public void salvarSerie() {
        String id = formSerie.getid();
        String titulo = formSerie.gettitulo();
        int idade = Integer.valueOf(formSerie.getidademin());

        serie = new Serie(Integer.parseInt(id), titulo, idade);

        serie.salvarSerie();
        System.out.println("Salvando no banco de dados.." + serie);
    }
}