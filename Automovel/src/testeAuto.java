public class testeAuto {
    public static void main(String[] args) {
        Automovel car1= new Automovel(400, 150, 80, 20, 1500, 19, 5, 0, 0, false);
        System.out.println("Gasolina:"+car1.getCurGas());
        car1.abastecer(10.0);
        // System.out.println("Velocidade"+car1.getVelAtual());
        // car1.setVelAtual(car1.getVelAtual()+5.0);
        // System.out.println("Velocidade"+car1.getVelAtual());
    }
}
