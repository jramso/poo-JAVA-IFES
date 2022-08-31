import javax.swing.JOptionPane;

public class TestaAutomovel {
    public static void main(String[] args) {
        Automovel car1= new Automovel(400, 150, 410, 20, 1500, 19, 5, 0, 0, false);
        JOptionPane.showMessageDialog(null,car1.toString());
        car1.embarque(1);//entrando motorista
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.setLigado(true); //Ligando o carro
        System.out.println("Ligando ");
        car1.acelerar(40);//acelerando carro
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.embarque(2);//embarcando 2 pessoas
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.parar();
        car1.embarque(2);//embarcando 2 pessoas
        car1.veicStatus();
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.desembarque(1);//saindo 1 pessoa se possivel
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.parar();//parando carro
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.desembarque(1); //descendo 1 pessoa
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.acelerar(25); //acelerando
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.embarque(5); //tentando entrar 5 pessoas
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.abastecer(15); //tentando abastecer 15 litros
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.setCurGas(3); //tentando abastecer 15 litros
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.embarque(3); //tentando entrar 3 pessoas
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.setCurGas(2); // gastando gasolina ate 10 litros
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.parar();
        car1.abastecer(5); // abastecendo 5 litros
        JOptionPane.showMessageDialog(null, car1.getMessage());
        car1.desembarque(car1.getCurPsg());
        if(car1.getCurPsg()==0 && car1.getLigado()==true){
            JOptionPane.showMessageDialog(null,"Carro Ligado","Aviso", JOptionPane.WARNING_MESSAGE, null)
        }
        car1.setLigado(false);
        JOptionPane.showMessageDialog(null,"Carro Desligado");
        
        JOptionPane.showMessageDialog(null,car1.toString());
        // System.out.println("Velocidade"+car1.getVelAtual());
        // car1.setVelAtual(car1.getVelAtual()+5.0);
        // System.out.println("Velocidade"+car1.getVelAtual());
    }
}
