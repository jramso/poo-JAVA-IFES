import java.util.ArrayList;

public class Playlist {
    

    private String nome;
    private int horas;
    private int minutos;
    private int segundo;
    ArrayList<Conteudo> pList;
    ArrayList<Musica> musicas;
    ArrayList<AudioLivro> book;
    ArrayList<Podcast> pod;
    
    public Playlist(String nomePL){
        this.nome=nomePL;
        this.horas=0;
        this.minutos=0;
        this.segundo=0;
        this.pList = new ArrayList<>();
        this.musicas=new ArrayList<>();
        this.book=new ArrayList<>();
        this.pod=new ArrayList<>();
    }

    public ArrayList<Conteudo> addPlaylist(Musica ctd){
        musicas.add(ctd);
        pList.add(ctd);
        return pList;
    }
    
    public ArrayList<Conteudo> addPlaylist(AudioLivro ctd){
        book.add(ctd);
        pList.add(ctd);
        return pList;
    }
    
    public ArrayList<Conteudo> addPlaylist(Podcast ctd){
        pod.add(ctd);
        pList.add(ctd);
        return pList;
    }
    


    public void calcTempo(){
        int sec=0;
        for(Conteudo cont:pList){
            sec=sec+cont.getDuracao();
        }
        int min=0;
        int hor=0;
        while(sec>=60){
            min++;
            if (min>0){
                sec=sec-60;
                if(min>=60){
                    hor++;
                    if(hor>0){
                        min=min-60;
                    }
                }
            }
        }
        setHoras(hor);
        setMinutos(min);
        setSegundo(sec);
    }


    // public ArrayList<Conteudo> listaMsc(){
    //     ArrayList<Conteudo> MusLst = new ArrayList<>();
    //     for(Conteudo mus:pList){
    //         if(mus.getClass().getSimpleName()=="Musica"){
    //             MusLst.add(mus);
    //         }
    //     }
    //     return MusLst;
    // }

    /**
     * @return String - duracao da playlist
     */
    public String duracaoPL(){
        calcTempo();
        if(this.horas>0){
            return getHoras()+"h "+getMinutos()+"min "+getSegundo()+"s";
        }
        return getMinutos()+"min "+getSegundo()+"s";
    }
    /*
     * Getters and Setters
     */

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getHoras() {
        return horas;
    }


    public void setHoras(int horas) {
        this.horas = horas;
    }


    public int getMinutos() {
        return minutos;
    }


    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }


    public int getSegundo() {
        return segundo;
    }


    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }


    public ArrayList<Conteudo> getPlist() {
        return pList;
    }


    public void setPlist(ArrayList<Conteudo> List) {
        this.pList = List;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public ArrayList<AudioLivro> getBook() {
        return book;
    }

    public ArrayList<Podcast> getPod() {
        return pod;
    }


}
