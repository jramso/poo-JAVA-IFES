package VeicLinha;

public class VagaoTanque extends VeicLinha {
    
    private double pressaoMax;
    public VagaoTanque(double peso,double largura,double altura, double comprimento, double pesoMax, double press, double carga2)throws Exception{
        super(peso,largura,altura,comprimento,pesoMax,carga2);
        if(press<0){
            throw new Exception(":pressaoMax nao pode ser negativa");
        }
        pressaoMax=press;
    }

    public double getPressaoMax() {
        return pressaoMax;
    }
    

    public String toString(){
        return super.toString()+"\npressao:{"+pressaoMax+"}";
    }

}
