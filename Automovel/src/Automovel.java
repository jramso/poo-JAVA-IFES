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
    }

    
    
    /*
     ************** METODOS *************************
     */
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

    public void parar(){
        acelerar(0);
    }

    public void alertPeso(){
        if(maxCarg<(this.curPsg*80+this.curGas)){
            JOptionPane.showMessageDialog(null, "O carro está com sobre-peso, o peso máximo é"+this.maxCarg);
        }else{
            JOptionPane.showMessageDialog(null, "O carro nao esta com sober-peso, O peso máximo é"+this.maxCarg);
        }
    }
    
    public double abastecer(double gasol){ //pode ser void
        if(getCurGas()+gasol<=getMaxGas()){
            setCurGas(curGas+gasol);
            alertPeso();
            return getCurGas();
        }else{
            JOptionPane.showMessageDialog(null, "a quantidade corrente no tanque não deve ultrapassar a capacidade máxima do tanque");
            return getCurGas();
        }
    }
    
    public void embarque(int newPsg){
        if(getCurPsg()+newPsg<=getMaxPsg()){
            setCurPsg(curPsg);
            alertPeso();
        }
    }

    public void desembarque(int dropPsg){
        if(this.velAtual==0.0 && this.curPsg>=dropPsg){
            setCurPsg(curPsg-dropPsg);
        }else{
            JOptionPane.showMessageDialog(null, "Pular do veiculo em movimento? que Deus salve a sua alma");
        }
    }
    
    /*
     * GETTERS AND SETTERS
     * 
     */
    
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
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
