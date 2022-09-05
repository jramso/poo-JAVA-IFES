package Figura2D;

public class testaTriangulo {
    public static void main(String[] args) {
        Triangulo tri = new Triangulo(new Ponto2D(0, 0), new Ponto2D(0, 5), new Ponto2D(8, 0));
        System.out.println(tri.toString());
    }
}
