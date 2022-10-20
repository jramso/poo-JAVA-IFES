package Figura2D;


public class Triangulo extends Figura2D{
    
    Ponto2D v1;
    Ponto2D v2;
    Ponto2D v3;
    float lado1;
    float lado2;
    float lado3;
    
    public Triangulo(Ponto2D ver1,Ponto2D ver2,Ponto2D ver3) throws Exception{
        super();
        try{
            if(((ver1.distancia(ver2)+ver1.distancia(ver3)>ver2.distancia(ver3))&&
            (ver2.distancia(ver3)+ver2.distancia(ver1)>ver1.distancia(ver3))&&
            (ver3.distancia(ver2)+ver3.distancia(ver1)>ver1.distancia(ver2)))==false){
                throw new Exception(ver1+", "+ver2+", "+ver3+" Não formam um triangulo.");
            }          
            v1=ver1;
            v2=ver2;
            v3=ver3;
            double x=(v1.getX()+v2.getX()+v3.getX())/3;
            double y=(v1.getY()+v2.getY()+v3.getY())/3;
            setCentroG(new Ponto2D(x, y));

        }catch(Exception e){
            System.out.println(e);
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

        float lado1=v1.distancia(v2);
        float lado2=v2.distancia(v3);
        float lado3=v1.distancia(v3);
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
