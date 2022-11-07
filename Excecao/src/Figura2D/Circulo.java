package Figura2D;

public class Circulo extends Figura2D {
    private double raio;
    public Circulo(Ponto2D centro,double raio)throws Exception{
        super();
        if(raio<0){
            throw new Exception("Valor do raio:"+raio+" invalido por ser negativo");
        }
        this.raio=raio;
        setCentroG(centro);
    }

    @Override
    public double calculaArea() {
        return 3.141592*raio*raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2*3.141592*raio;
    }

    @Override
    public String toString() {
        return  "Centro:"+getCentroG()+"\nRaio:{"+this.raio+"}";
    }
}
