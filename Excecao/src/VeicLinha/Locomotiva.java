package VeicLinha;
import java.util.ArrayList;

public class Locomotiva extends VeicLinha{
    
    private int numMatric;
    private double potMax;
    private double desloc;
    ArrayList<VeicLinha> vagoes;
    public Locomotiva(double peso,double largura,double altura, double comprimento, double pesoMax, double press, int matric, double maxPot,double desloc,double carg) throws Exception{
        super(peso,largura,altura,comprimento,pesoMax,carg);
        if(numMatric<0||potMax<0||desloc<0){
            throw new Exception(":Valores de Locomotiva nao podem ser negativos");
        }
        numMatric=matric;
        potMax=maxPot;
        this.desloc=desloc;
        this.vagoes=new ArrayList<>();
    }

    public double calcularPesoTotal(){
        double carga=0;
        for (VeicLinha  vag: vagoes) {
            try {
                carga=carga+vag.calcularPesoTotal();
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return super.getPeso()+carga;
    }

    public ArrayList<VeicLinha> cadastraVagao(VeicLinha vagao) throws Exception{
        if(vagao instanceof VagaoPessoa || vagao instanceof VagaoTanque){
            vagoes.add(vagao);
        }else{
            throw new Exception("tipo de Vagao invalido");
        }
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
