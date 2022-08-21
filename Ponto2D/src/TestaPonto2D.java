public class TestaPonto2D {
    public static void main(String[] args) {
        Ponto2D a = new Ponto2D(5, 3);
        Ponto2D b = new Ponto2D(7, 4);

        System.out.println("Distancia entre o PontoA ("+a.getX()+","+a.getY()+ ") e PontoB ("+b.getX()+","+b.getY()+"): "+String.format("%.2f",a.distancia(b)));
        System.out.println("O PontoA e o PontoB sao iguais? "+String.format(a.igual(b)?"Sim":"Não"));
        System.out.println("PontoA :"+a.toString());
        System.out.println("PontoB :"+b.toString());

        // System.out.println("Distancia entre pontoA e pontoB "+a.toString());
    }
}
