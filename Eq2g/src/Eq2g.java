public class Eq2g {
    private int a;
    private int b;
    private int c;

    public Eq2g(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public double Delta() {
        double delta = Math.pow(getB(),2)-(4*getA()*getC());
        return delta;
    }

    public int contRaiz(){
        if (Delta()>0){
            return 2;
        } else if(Delta()==0){
            return 1 ;
        }
        return 0;
    }

    public double raizA(){
        double num = (b*-1)+(Math.sqrt(Delta()));
        double den= 2*getA();
        double raizPos=num/den;
        return raizPos;
    }
    public double raizB(){
        double num = (-1*b)-(Math.sqrt(Delta()));
        double den= 2*getA();
        double raizPos=num/den;
        return raizPos;
    }

    public String toString(){
        return "Coef A:"+this.a+" Coef B:"+this.b+" Coef C:"+this.c;
    }

    
    
}

