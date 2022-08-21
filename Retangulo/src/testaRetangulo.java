public class testaRetangulo {
    public static void main(String[] args) {
        Ponto2D v1 = new Ponto2D(3, 5);
        Ponto2D v4 = new Ponto2D(8, 1);
        Ponto2D ponto = new Ponto2D(4,2);

        Retangulo ret = new Retangulo(v1, v4);
        System.out.println("Ret:"+ret.toString());
        System.out.println("Ret. Area:"+ret.area());
        System.out.println("Ret. Perimetro:"+ret.perimetro());
        System.out.print("Pertence ao retangulo? ");
        System.out.printf(ret.pertence(ponto)?"sim":"nao");
    }
}
