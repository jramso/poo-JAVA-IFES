package Figura2D;
public class testaRetangulo {
    public static void main(String[] args) {
        Ponto2D v1 = new Ponto2D(3, 5);
        Ponto2D v4 = new Ponto2D(8, 1);
        Ponto2D ponto = new Ponto2D(4,2);

        Retangulo ret = new Retangulo(v1, v4);
        System.out.println(ret.toString());
        System.out.println("Base: {"+ret.getBase()+"}");
        System.out.println("Altura: {"+ret.getAltura()+"}");
        System.out.print("É um quadrado? ");
        System.out.print(ret.quadrado()?"sim\n":"não\n");
        System.out.print("o ponto: "+ponto.toString()+" Pertence ao retangulo? ");
        System.out.printf(ret.pertence(ponto)?"sim":"nao");
    }
}
