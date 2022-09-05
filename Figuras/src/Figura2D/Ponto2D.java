package Figura2D;

public class Ponto2D {

    private double x;
    private double y;
    /* Constructor */
    public Ponto2D(double x, double y){
        this.x=x;
        this.y=y;
    }

    /* METODOS */
    public float distancia(Ponto2D pontoB){
        /* calcular distancia entre 2 pontos (Math devolve double)*/
        /* ­↓↓↓↓↓ Fomula distancia entre 2 pontos ↓↓↓
        dist = ((x-xB)²+(y-yB)²))**1/2 */
        return (float) Math.sqrt(Math.pow(x-pontoB.getX(),2)+Math.pow(y-pontoB.getY(), 2));
    }
    public boolean igual(Ponto2D pontoB){
        return x==pontoB.getX() && y==pontoB.getY();
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public String toString(){
        return "{X="+getX()+" Y="+getY()+"}";
    }
}
