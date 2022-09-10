package Figura2D;
/** Classe que forma uma figura plana a partir de um "ponto no plano cartesiano".
 * @author Josue Ramos Souza
 * @version 1.1
 *
 */

public abstract class Figura2D{
    //figura base Quadrado
    private Ponto2D centroG;

    public Figura2D(){
        this.centroG=new Ponto2D(0, 0);
    }

    /** Metodo para retornar a area de uma figura plana 
     * @return double - area; */

    public abstract double calculaArea();

    /** Metodo para retornar o perimetro de uma figura plana 
     * @return double - perimetro */
    
    public abstract double calculaPerimetro();

    /** 
     * Metodos Getters and Setters
     */

    public Ponto2D getCentroG() {
        return centroG;
    }
    public void setCentroG(Ponto2D centroG) {
        this.centroG = centroG;
    }


}
