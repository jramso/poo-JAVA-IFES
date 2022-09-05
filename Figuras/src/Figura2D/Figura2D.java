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

    public double calculaArea(){
        return 0;
    }

    /** Metodo para retornar o perimetro de uma figura plana 
     * @return double - perimetro */
    
    public double calculaPerimetro(){
        return 0;
    }

    public Ponto2D calculaCG(){ // WRONG!!!!!!!!!!!
        return this.centroG;
    }

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
