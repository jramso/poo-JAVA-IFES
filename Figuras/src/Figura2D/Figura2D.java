package Figura2D;
/** Classe que forma uma figura plana a partir de um "ponto no plano cartesiano".
 * @author Josue Ramos Souza
 * @version 1.1
 *
 */

//importando a classe 
import Ponto2D.Ponto2D;
public class Figura2D extends Ponto2D{
    //figura base Quadrado
    private double area;
    private double perimetro;
    public Figura2D(Ponto2D origem){
        super(origem.getX(),origem.getY());
        this.area=0;
        this.perimetro=0;
    }

    /** Metodo para retornar a area de uma figura plana 
     * @return double - area; */

    public double calculaArea(double base, double altura){
        area=base*altura;
        return this.area;
    }

    /** Metodo para retornar o perimetro de uma figura plana 
     * @return double - perimetro */
    
    public double calculaPerimetro(double ladoA,double ladoB){
        perimetro = (ladoA+ladoB)*2;
        return this.perimetro;
    }

    /** 
     * Metodos Getters and Setters
     */
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


}
