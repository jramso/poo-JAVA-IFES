public class TestaEq2g {
    public static void main(String[] args){
        Eq2g a = new Eq2g(3, 5, 2);

        
        System.out.println(a.getA()+"x²+"+a.getB()+"x+"+a.getC()+"=0");
        System.out.println(a.toString());
        System.out.printf("Delta: %.2f\n",a.Delta());
        System.out.println("Quantidade de raizes: "+a.contRaiz());
        System.out.printf("Raiz 1: %.2f\n",a.raizA());
        System.out.printf("Raiz 2: %.2f\n",a.raizB());

    }
}