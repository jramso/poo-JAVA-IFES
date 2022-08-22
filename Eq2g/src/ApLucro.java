public class ApLucro {
    public static void main(String[] args) {
        Eq2g fab = new Eq2g(-1, 12, -20);
        if (fab.calcula(fab.raizA())>fab.calcula(fab.raizB())){
            System.out.println("O total de bones a serem vendidos por pacote sao:"+fab.raizA());
        }else{
            System.out.println("O total de bones a serem vendidos por pacote sao:"+fab.raizB());
        }
    }
}
