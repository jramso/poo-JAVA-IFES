package Figura2D;


public class Triangulo extends Figura2D{
    
    Ponto2D v1;
    Ponto2D v2;
    Ponto2D v3;
    float lado1;
    float lado2;
    float lado3;

    public Triangulo(Ponto2D ver1,Ponto2D ver2,Ponto2D ver3){
        super();
        v1=ver1;
        v2=ver2;
        v3=ver3;
        double x=(v1.getX()+v2.getX()+v3.getX())/3;
        double y=(v1.getY()+v2.getY()+v3.getY())/3;
        setCentroG(new Ponto2D(x, y));
        this.lado1=v1.distancia(v2);
        this.lado2=v2.distancia(v3);
        this.lado3=v1.distancia(v3);
        try{
            if((this.lado1+this.lado2)<this.lado3){
                throw new ArithmeticException();
            }else if((this.lado2+this.lado3)>this.lado1){
                throw new ArithmeticException();
            }
            System.out.println("passou");
        }catch(Exception e){

        }finally{

        }
    }

    @Override 
    public double calculaPerimetro() {
        //soma dos lados
        return v1.distancia(v2)+v1.distancia(v3)+v2.distancia(v3);
    }

    @Override
    public double calculaArea() {
        //formula de Heron
        double s=calculaPerimetro()/2;
        return Math.sqrt(s*((s-v1.distancia(v2))*(s-v1.distancia(v3))*(s-v2.distancia(v3))));
    }


    

    public boolean triaRetangulo(){
        //a precisao double dava erro por ser muito grande

        if (lado1>lado2 && lado1>lado3){
            return (lado1*lado1)==(lado2*lado2)+(lado3*lado3);
        }else if(lado2>lado3 && lado2>lado1){
            return (lado2*lado2)==(lado1*lado1)+(lado3*lado3);
        }else{
            return (lado3*lado3)==(lado2*lado2)+(lado1*lado1);
        }

    }

    public String toString(){
        return "Vertices:\nV1:"+v1.toString()+"\nV2:"+v2.toString()+"\nV3:"+v3.toString()+"\nCentro de gravidade:{"+getCentroG()+"}\nArea:{"+calculaArea()+"}\nPerimetro:{"+calculaPerimetro()+"}\nÉ Triangulo retangulo:{"+triaRetangulo()+"}\n\n";
    }


}
