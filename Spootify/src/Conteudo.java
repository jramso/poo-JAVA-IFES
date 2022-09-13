public abstract class Conteudo {
    private String titulo;
    private int duracao;

    public Conteudo(String titulo,int duracao){
        this.titulo=titulo;
        this.duracao=duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
}
