
public abstract class Eletronics {
    private String cor;
    private boolean som;
    private boolean onOff;
    private String marca;

    public Eletronics(String cor, boolean som,boolean onOff,String marca){
        this.cor=cor;
        this.som=som;
        this.onOff=onOff;
        this.marca=marca;
    }

    public abstract boolean tocar();

    public abstract boolean ligarAparelho();

    public boolean isSom() {
        return som;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public String getMarca() {
        return marca;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public String getCor() {
        return cor;
    }
}
