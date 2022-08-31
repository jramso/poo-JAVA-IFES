/*
 * Classe responsavel por moldar um automovel
 * 
 * @author Josué Ramos Souza {20202BSI0292}
 */

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
    private String message;

    public Automovel(double comprimento, double altura, double maxCarg,double maxGas,double peso,double curGas,int maxPsg,int curPsg,double velAtual,boolean ligado){
        this.comprimento=comprimento;
        this.altura=altura;
        this.peso=peso;
        this.maxCarg=maxCarg;
        this.maxPsg=maxPsg;
        this.curPsg=curPsg;
        this.maxGas=maxGas;
        this.curGas=curGas;
        this.velAtual=velAtual;
        this.ligado=ligado;
        this.message="";
    }

    
    
    /*
     ************** METODOS *************************
     */
    public double acelerar(double vel){
        if (getLigado()==true && getCurPsg()>0){
            reabastece();
            if(vel>=getVelAtual()){
                setVelAtual(vel);
                setMessage("Acelerando:"+this.velAtual);
            }else{
                freiar(vel);
            }
        }else if(getCurPsg()==0){
            setMessage("O carro precisa de um motorista!");
        }
        return getVelAtual();
    }


    public double freiar(double vel){
        if(getLigado()==true){
            reabastece();
            if(vel<getVelAtual()){
                setVelAtual(vel);
                setMessage("Freiando: "+this.velAtual+"Km/h");
            }
        }
        return getVelAtual();
    }

    public void parar(){
        freiar(0);
        setMessage("Carro parado: "+this.velAtual+"km/h");
    }

    public void alertPeso(){
        if(maxCarg<(this.curPsg*80+this.curGas)){
            setMessage("O carro está com sobre-peso, o peso máximo é "+this.maxCarg+"Kg");
        }else{
            setMessage("Peso atual "+(this.curPsg*80+this.curGas)+"Kg, O peso máximo é "+this.maxCarg+"Kg");
        }
    }
    
    public void abastecer(double gasol){ //pode ser void
        if(getCurGas()+gasol<=getMaxGas()){
            if(this.velAtual>0){
                setMessage("O veiculo ainda esta em movimento");
            }
            setCurGas(curGas+gasol);
            alertPeso();
            setMessage("tanque abastecido gasolina atual: "+this.curGas+"L");
        }else{
            setMessage("a quantidade corrente no tanque não deve ultrapassar a capacidade máxima do tanque");
        }
    }
    
    public void embarque(int newPsg){
        if(getCurPsg()+newPsg<=getMaxPsg()){
            if(this.velAtual>0){
                setMessage("O veiculo ainda esta em movimento, impossivel embarcar!");
            }else{
                setCurPsg(curPsg+newPsg);
                reabastece();
                alertPeso();
            }
        }else{
            setMessage ("impossivel comportar mais "+newPsg+" passageiros");
        }
    }

    public void desembarque(int dropPsg){
        if(this.velAtual==0.0 && this.curPsg>=dropPsg){
            setCurPsg(this.curPsg-dropPsg);
            veicStatus();
        }else{
            setMessage("O veiculo ainda esta em movimento");
        }
    }

    public void reabastece(){
        if(this.curGas<=(this.maxGas/4.0)){
            setMessage("a gasolina esta abaixo do recomendado favor reabastecer("+getCurGas()+"L /"+getMaxGas()+"L)");
        }
    }

    public void veicStatus(){
        setMessage("Peso atual do veiculo:{"+this.peso+"}\nVel Atual:{"+this.velAtual+"}\n Passageiros no veiculo:{"+this.curPsg+"}\n Gasolina atual:{"+this.curGas+"}\n Veiculo ligado:{"+this.ligado+"}\n");
    }

    
    /*
    * GETTERS AND SETTERS
    * 
    */
    public String getMessage(){
        return message;
    }
    
    public void setMessage(String message){
        this.message = message;
    }
    public double getComprimento() {
        return comprimento;
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

    public double getMaxCarg() {
        return maxCarg;
    }

    public double getMaxGas() {
        return maxGas;
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
        reabastece();
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /*
     *  Log toString()
     */
    public String toString(){
        return "Comprimento: {"+getComprimento()+"}\nAltura: {"+getAltura()+"}\nPeso: {"+getPeso()+"}\nMax. Carga:{"+getMaxCarg()+"}\nMax. Passageiros: {"+getMaxPsg()+"}\nPassageiros atualmente no veiculo:{"+getCurPsg()+"}";
    }
}
