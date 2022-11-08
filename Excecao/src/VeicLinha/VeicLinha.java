package VeicLinha;

public abstract class VeicLinha {
 
    private double peso;
    private double largura;
    private double altura;
    private double comprimento;
    private double pesoMax;
    private double carga;

    public VeicLinha(double peso2, double largura2, double altura2, double comprimento2, double pesoMax2, double carga){
        peso=peso2;
        largura=largura2;
        altura=altura2;
        comprimento=comprimento2;
        pesoMax=pesoMax2;
        this.carga=carga;
    };

    public  double calcularPesoTotal(){
        return this.peso+this.carga;
    }

    public double getCarga() {
        return carga;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double getPesoMax() {
        return pesoMax;
    }
    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public String toString(){
        return "Peso:{"+peso+"}\nLargura:{"+largura+"}\nAltura:{"+altura+"}\nComprimento:{"+comprimento+"}\nPeso Maximo:{"+pesoMax+"}";
    }
}
