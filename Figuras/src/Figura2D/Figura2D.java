package Figura2D;
/** Classe que forma uma figura plana a partir de um "ponto no plano cartesiano".
 * @author Josue Ramos Souza
 * @version 1.1
 *
 */

//importando a classe de Ponto
import Ponto2D.Ponto2D;
public class Figura2D{
    //figura base Quadrado
    private Ponto2D centroG;
    private double area;
    private double perimetro;

    public Figura2D(){
        this.centroG=new Ponto2D(0, 0);
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

    public Ponto2D calculaCG(double base, double altura){ // WRONG!!!!!!!!!!!
        centroG=new Ponto2D(centroG.getX()+(base/2), centroG.getY()+(altura/2));
        return this.centroG;
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

    public Ponto2D getCentroG() {
        return centroG;
    }
    public void setCentroG(Ponto2D centroG) {
        this.centroG = centroG;
    }


}
