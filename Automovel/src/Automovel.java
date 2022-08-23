import javax.swing.JOptionPane;
public class Automovel {
    //Variaveis fixas

    private double comprimento; // comprimento do automovel
    private double altura;  // altura do auto
    private double maxCarg; // maximo de carga em kg que o auto leva
    private double maxGas; // maximo de gasolina em L
    private int maxPsg; // maximo de pessoas / passageiros

    //Variaveis relativas
    private double peso; // peso do carro
    private int curPsg; // qtd atual de passageiros
    private double curGas; // qtd atual de gasolina
    private boolean ligado; // auto On/Off 
    private double velAtual; //velocidade atual do auto

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

    public double parar(){
        return acelerar(0);
    }

    public Boolean alertPeso(){
        return true;
    }
    
    public double abastecer(double gasol){ //pode ser void
        if(getCurGas()+gasol<=getMaxGas()){
            setCurGas(curGas+gasol);
            return getCurGas();
        }else{
            JOptionPane.showMessageDialog(null, "a quantidade corrente no tanque não deve ultrapassar a capacidade máxima do tanque");
            return getCurGas();
        }
    }
    
    public void embarque(int newPsg){
        if(getCurPsg()+newPsg<=getMaxPsg()){
            setCurPsg(curPsg);
        }
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
