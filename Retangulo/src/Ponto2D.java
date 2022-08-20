public class Ponto2D {

    private int x;
    private int y;
    /* Constructor */
    public Ponto2D(int x, int y){
        this.x=x;
        this.y=y;
    }

    /* METODOS */
    public Double distancia(Ponto2D pontoB){
        /* calcular distancia entre 2 pontos (Math devolve double)*/
        /* ­↓↓↓↓↓ Fomula distancia entre 2 pontos ↓↓↓
        dist = ((x-xB)²+(y-yB)²))**1/2 */
        return Math.sqrt(Math.pow(x-pontoB.getX(),2)+Math.pow(y-pontoB.getY(), 2));
    }
    public boolean igual(Ponto2D pontoB){
        return x==pontoB.getX() && y==pontoB.getY();
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public String toString(){
        return "X= "+getX()+" Y= "+getY();
    }
}
