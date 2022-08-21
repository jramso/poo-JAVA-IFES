
public class Automovel {
    //Variaveis fixas

    private double comprimento; // cm
    private double altura;  // cm
    private double maxCarg; // Kg
    private double maxGas; // L
    private int maxPsg; // Nat. 

    //Variaveis relativas
    private double peso; //Kg
    private int curPsg; // Nat.
    private double curGas; // L == KG
    private boolean ligado; // On/Off
    private double velAtual;

    public Automovel(Double velAtual,Double comprimento, Double altura, Double maxCarg,Double maxGas,Double peso,Double curGas,int maxPsg,int curPsg,boolean ligado){
        this.comprimento=comprimento;
        this.altura=altura;
        this.maxCarg=maxCarg;
        this.maxGas=maxGas;
        this.curGas=curGas;
        this.peso=peso;
        this.maxPsg=maxPsg;
        this.curPsg=curPsg;
        this.ligado=ligado;
        this.velAtual=velAtual;
        velAtual=0.0;
    }

    
    
    
    public double acelerar(double vel){
        if (getLigado()==true){
            if(vel>=getVelAtual()){
                setVelAtual(vel);
                System.out.println("acelerando...");
            }else{
                freiar(vel);
            }
        }
        return getVelAtual();
    }
    public double freiar(double vel){
        if(getLigado()==true){
            if(vel<getVelAtual()){
                setVelAtual(vel);
                System.out.println("freiando");
            }
        }
        return getVelAtual();
    }

    public Boolean alertPeso(){
        return true;
    }
    
    public double abastecer(){
        return 0.0;
    }
    
    public int embarque(){
        return 0;
    }
    public int desembarque(){
        return 0;
    }
    
    
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getVelAtual() {
        return velAtual;
    }
    public void setVelAtual(double velAtual) {
        this.velAtual = velAtual;
    }
    public int getMaxPsg() {
        return maxPsg;
    }
    public boolean getLigado(){
        return ligado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getMaxCarg() {
        return maxCarg;
    }

    public void setMaxCarg(double maxCarg) {
        this.maxCarg = maxCarg;
    }

    public double getMaxGas() {
        return maxGas;
    }

    public void setMaxGas(double maxGas) {
        this.maxGas = maxGas;
    }

    public void setMaxPsg(int maxPsg) {
        this.maxPsg = maxPsg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCurPsg() {
        return curPsg;
    }

    public void setCurPsg(int curPsg) {
        this.curPsg = curPsg;
    }

    public double getCurGas() {
        return curGas;
    }

    public void setCurGas(double curGas) {
        this.curGas = curGas;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
