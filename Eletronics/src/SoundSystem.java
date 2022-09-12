public class SoundSystem extends Eletronics{
    private int vol;
    public SoundSystem(String cor, boolean som,boolean onOff,String marca, int volume){
        super(cor, som, onOff, marca);
        this.vol=volume;
    }

    public int alteraVol(int newVol){
        if(isOnOff()==true && isSom()==true){
            this.vol=newVol;
            return vol;
        }
        return vol;
    }

    public boolean mute(){
        if(isOnOff()==true && isSom()==true){
            setSom(false);
            alteraVol(0);
            return true;
        }
        return false;
    }

    public boolean tocar(){
        if(isOnOff()==true && isSom()==true && this.vol>0){
            return true;
        }
        return false;
    }

    public boolean ligarAparelho() {
        // metodo de ligar e desligar aparelho
        if (isOnOff()==false){
            setOnOff(true);
            return true;
        }
        setOnOff(false);
        return false;
    }
}
