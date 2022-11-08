package VeicLinha;
public class VagaoPessoa extends VeicLinha{
    private int qtdPessoa;
    public VagaoPessoa(double peso2, double largura2, double altura2, double comprimento2, double pesoMax2, int qtdP) throws Exception {
        super(peso2, largura2, altura2, comprimento2, pesoMax2, qtdP*80);
        if(qtdP<0){
            throw new Exception("Qtd pessoas nao pode ser negativo");
        }else{

            qtdPessoa=qtdP;
        }
    }

    public String toString() {
        return super.toString()+"\nQtd. Pessoas{"+qtdPessoa+"}";
    }
    
    
}
