public class AppComboio {
    public static void main(String[] args) throws Exception {
        VagaoTanque A=new VagaoTanque(1000,3.5,200,150,10000, 50, 7000);
        VagaoPessoa B=new VagaoPessoa(1000,3, 210, 300, 10000, 20);

        System.out.println(A);
        System.out.println("Peso total:"+A.calcularPesoTotal());
        System.out.println("---------------------------------");
        System.out.println(B);
        System.out.println("Peso total:"+B.calcularPesoTotal());
    }
}
