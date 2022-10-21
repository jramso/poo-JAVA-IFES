import java.util.ArrayList;

public class Locomotiva extends VeicLinha{
    
    private int numMatric;
    private double potMax;
    private double desloc;
    ArrayList<VeicLinha> vagoes;
    public Locomotiva(double peso,double largura,double altura, double comprimento, double pesoMax, double press, int matric, double maxPot,double desloc,double carg){
        super(peso,largura,altura,comprimento,pesoMax,carg);
        numMatric=matric;
        potMax=maxPot;
        this.desloc=desloc;
        this.vagoes=new ArrayList<>();
    }

    @Override
    public double calcularPesoTotal() {
        double carga=0;
        for (VeicLinha  vag: vagoes) {
            carga=carga+vag.calcularPesoTotal();
        }
        return super.getPeso()+carga;
    }

    public ArrayList<VeicLinha> cadastraVagao(VeicLinha vagao){
        vagoes.add(vagao);
        return vagoes;
    }
    
    public ArrayList<VeicLinha> removeVagao(VeicLinha vagao){

        if(vagoes.contains(vagao)){
            vagoes.remove(vagao);
            System.out.println("Removido com sucesso");
            return vagoes;
        }
        System.out.println("Vagao não encontrado!");
        return vagoes;
    }

    @Override
    public String toString() {
        return "Matricula Locomotiva:{"+this.numMatric+"}\nPotencia:{"+this.potMax+"}\nPeso suportado:{"+this.desloc+"}\n"+super.toString();
    }
}
