public class Podcast extends Conteudo{
    
    private String apresentador;
    private String tema;
    private String descricao;
    public Podcast(String titulo,int duracao, String apresentador, String tema, String desc){
        super(titulo, duracao);
        this.apresentador=apresentador;
        this.tema=tema;
        this.descricao=desc;
    }
    public String getApresentador() {
        return apresentador;
    }
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
