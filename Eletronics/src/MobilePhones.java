public class MobilePhones extends Phones{
    
    private boolean camera;
    public MobilePhones(String cor, String marca, boolean som, boolean onOff, String []botoes, boolean camera){
        super(cor, marca, som, onOff, botoes);
        this.camera=camera;
    }

    public boolean foto(){
        if (isOnOff()==true && this.camera==true){
            return true;
        }
        return false;
    }
}
