package POOflix.src.CDU;

public class CDUMain{
    private FormMain formMain;

    public CDUMain(FormMain formMain){
        this.formMain = formMain;
        this.formMain.setcdu(this);
    }

    public void exec(){
        formMain.exibe();
    }

    public void execCadSerie(){
        FormSerie telaSerie= new FormSerie();
        CDUcadastrarSerie cduSerie = new CDUcadastrarSerie(telaSerie);
        cduSerie.exec();
    }

    public void execCadSerie(){

    }

    public void processaOpcao(String opcao){
        switch(opcao){
            case "1": 
                execCadSerie();
                break;
            case "2":
                execCadEpisodio();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    };


}