package Figura2D;

public class TestFigPlana1 {
    public static void main(String[] args) {
        // retangulo
        Ponto2D v1 = new Ponto2D(1, 5);
        Ponto2D v4 = new Ponto2D(8, 1);
        Ponto2D ponto = new Ponto2D(4,2);
        
        Retangulo ret = new Retangulo(v1, v4);
        System.out.println("RETANGULO");
        System.out.println(ret);
        System.out.print("É um quadrado? "); System.out.print(ret.quadrado()?"sim\n":"não\n");
        System.out.print("o ponto: "+ponto.toString()+" Pertence ao retangulo? "); System.out.printf(ret.pertence(ponto)?"sim":"nao");
        System.out.print("\n\n");
        // triangulo
        try{
            System.out.println("TRIANGULO");
            Triangulo tri = new Triangulo(new Ponto2D(0, 0), new Ponto2D(0, 0), new Ponto2D(8, 0));
            System.out.println(tri);

        }catch(Exception e){
            System.out.println(e);
        }
      
        System.out.print("\n\n");
        
        // circulo
        System.out.println("CIRCULO");
        Circulo cir = new Circulo(ponto, 3);
        System.out.println(cir);

    }
}
