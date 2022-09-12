public class Phones extends Eletronics{
    
    private String [] botoes;
    public Phones(String cor, String marca, boolean som, boolean onOff, String []botoes){
        super(cor, som, onOff, marca);
        this.botoes=botoes;
    }

    @Override
    public boolean tocar() {
        //se aparelho esta ligado e som esta ligado entao toca
        if(isOnOff()==true && isSom()==true){
            return true;
        }
        return false;
    }

    @Override
    public boolean ligarAparelho() {
        // metodo de ligar e desligar aparelho
        if (isOnOff()==false){
            setOnOff(true);
            return true;
        }
        setOnOff(false);
        return false;
    }

    public boolean fazerLigacao(){
        if (isOnOff()==true){ //se esta ligado
            //se tiver algum valor digitado pode ligar(true), se nao retorna false
            return botoes!=null;
        }else{
            return false;
        }
    }
}
