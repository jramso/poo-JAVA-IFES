package Figura2D;

public class Retangulo extends Figura2D{
    private Ponto2D vS1; // vertice superior 1   //1  2
    private Ponto2D vS2; // vertice superior 2   //3  4
    private Ponto2D vI3; // inferior 3
    private Ponto2D vI4; // inferior 4
    private double base;
    private double altura;

    public Retangulo(Ponto2D vS1,Ponto2D vI4) throws Exception{
        super();
        this.vS1=vS1;
        this.vI4=vI4;
        this.vS2= new Ponto2D(vI4.getX(), vS1.getY());
        this.vI3= new Ponto2D(vS1.getX(),vI4.getY());
        this.base=vI3.distancia(vI4);
        this.altura=vI3.distancia(vS1);
        if((base*altura)==0){
            throw new Exception("Area = 0");
        }
        setCentroG(new Ponto2D((base/2), (altura/2)));
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

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public double calculaPerimetro() {
        return (2*base)+(2*altura);
    }


    public boolean quadrado(){
        return vS1.distancia(vI3)==vS1.distancia(vS2);
    }

    public boolean pertence(Ponto2D ponto){
        return ponto.getY()<=vS1.getY() && ponto.getY()>=vI3.getY() && ponto.getX()>=vI3.getX() && ponto.getX()<=vS2.getX();
    }
    
    public String toString(){
        return "Vertices:\nV1:"+this.vS1.toString()+"\nV2:"+this.vS2.toString()+"\nV3:"+this.vI3.toString()+"\nV4:"+this.vI4.toString()+"\nCentro de gravidade:"+getCentroG()+"\nArea:{"+calculaArea()+"}\nPerimetro:{"+calculaPerimetro()+"}\n\n";
    }

}
