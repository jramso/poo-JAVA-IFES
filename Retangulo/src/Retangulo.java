
public class Retangulo {
    private Ponto2D vS1; // vertice superior 1   1  2
    private Ponto2D vS2; // vertice superior 2   3  4
    private Ponto2D vI3; // inferior 3
    private Ponto2D vI4; // inferior 4

    public Retangulo(Ponto2D vS1, Ponto2D vI4){
        this.vS1=vS1;
        this.vI4=vI4;
        this.vS2= new Ponto2D(vI4.getX(), vS1.getY());
        this.vI3= new Ponto2D(vS1.getX(),vI4.getY());
    }
    public Ponto2D getVS1() {
        return vS1;
    }
    public Ponto2D getvS2() {
        return vS2;
    }
    public Ponto2D getV3() {
        return vI3;
    }
    public Ponto2D getvI4() {
        return vI4;
    }
    public float area(){
        return vS1.distancia(vS2) * vS1.distancia(vI3);
    }
    public float perimetro(){
        return 2*(vS1.distancia(vS2) + vS1.distancia(vI3));
    }
    public boolean pertence(Ponto2D ponto){
        return ponto.getY()<=vS1.getY() && ponto.getY()>=vI3.getY() && ponto.getX()>=vI3.getX() && ponto.getX()<=vS2.getX();
    }
    
    public String toString(){
        return "V1:"+this.vS1.toString()+" V2:"+this.vS2.toString()+" V3:"+this.vI3.toString()+" V4:"+this.vI4.toString();
    }

}
