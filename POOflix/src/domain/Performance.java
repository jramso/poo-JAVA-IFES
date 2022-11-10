package POOflix.src.domain;

public class Performance {
    private Episodio episodio;
    private Personagem personagem;
    private Ator ator;

    public Performance(Episodio idep, Personagem idepers, Ator ator){
        this.episodio=idep;
        this.personagem=idepers;
        this.ator=ator;

    }
    
    public Episodio getidep(){
        return episodio;
    }

    public Personagem getidperson(){
        return personagem;
    }

    public Ator getator(){
        return ator;
    }
    


}
