package Figura2D;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestaFigPlana2 {
    public static void main(String[] args) {
        ArrayList<Figura2D> lista = new ArrayList<>();
        //LOOP
        for (int j=0;j<10;j++){
            //valores possiveis para o select
            Object[] possibleValues = { "Circulo", "Triangulo", "Retangulo" }; 
            //valores selecionados
            Object selectedValue = JOptionPane.showInputDialog(null,"Escolha a Figura", "Figura2D",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
            
            //CONDICIONAL
            if(selectedValue=="Triangulo"){
                Ponto2D [] v1 = new Ponto2D[3]; //cria um vetor de Ponto2D
                for (int i=0;i<3;i++){
                    String x= JOptionPane.showInputDialog(null, "Informe o X do vertice "+i+1);
                    double x1=Double.parseDouble(x);
                    String y= JOptionPane.showInputDialog(null, "Informe o Y do vertice "+i+1);
                    double y1=Double.parseDouble(y);
                    v1[i]= new Ponto2D(x1, y1);
                }
                lista.add(new Triangulo(v1[0], v1[1], v1[2]));

            }else if(selectedValue=="Circulo"){
                String x= JOptionPane.showInputDialog(null, "Informe o X do centro do circulo:");
                double x1=Double.parseDouble(x);
                String y= JOptionPane.showInputDialog(null, "Informe o Y do centro do circulo: ");
                double y1=Double.parseDouble(y);
                String r= JOptionPane.showInputDialog(null, "Informe o raio do circulo: ");
                double raio=Double.parseDouble(r);
                Ponto2D cg = new Ponto2D(x1, y1);
                lista.add(new Circulo(cg,raio));

            }else if(selectedValue=="Retangulo"){
                Ponto2D[] ver=new Ponto2D[2];
                for(int i=0;i<2;i++){
                    String x= JOptionPane.showInputDialog(null, "Informe o X do vertice "+i+1);
                    double x1=Double.parseDouble(x);
                    String y= JOptionPane.showInputDialog(null, "Informe o Y do vertice "+i+1);
                    double y1=Double.parseDouble(y);
                    ver[i]= new Ponto2D(x1, y1);
                }
                lista.add(new Retangulo(ver[0],ver[1]));
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao escolher! Não foi selecionado nenhuma das opções");
            }// FIM_CONDICIONAL
        }// FIM_LOOP

        //EXIBE SAIDA
        System.out.print("\n\n\n");
        System.out.println("Tipo        Perimetro   Area    Centro");
        System.out.println("------------------------------------------");
        for (Figura2D fig:lista){
            System.out.print(fig.getClass().getSimpleName());
            System.out.printf("         %.0f    ",fig.calculaPerimetro());
            System.out.printf("   %.0f        ",fig.calculaArea());
            System.out.printf("%.0f, %.0f \n",fig.getCentroG().getX(),fig.getCentroG().getY());
        }

    }// FIM_MAIN
}
