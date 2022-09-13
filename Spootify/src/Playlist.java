import java.util.ArrayList;

public class Playlist {
    

    private String nome;
    private int horas;
    private int minutos;
    private int segundo;
    ArrayList<Conteudo> pList;
    
    public Playlist(String nomePL){
        this.nome=nomePL;
        this.horas=0;
        this.minutos=0;
        this.segundo=0;
        this.pList = new ArrayList<>();
    }

    public ArrayList<Conteudo> addPlaylist(Conteudo ctd){
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


    public ArrayList<Conteudo> listaMsc(){
        ArrayList<Conteudo> MusLst = new ArrayList<>();
        for(Conteudo mus:pList){
            if(mus.getClass().getSimpleName()=="Musica"){
                MusLst.add(mus);
            }
        }
        return MusLst;
    }


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


}
