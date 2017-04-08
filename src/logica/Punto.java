
package logica;
/**
 * Clase que manejara todos los puntos en comun de las demas clases
 * @author Michael Cardenas 
 * @authort Edgar Kreicj
 */
public class Punto {
    
    /**
     * punto en la coordenada x
     */
    private double x;
    
    /**
     * punto en la coordenada y
     */
    private double y;

    /**
     * metodo constructor que inicializa los atributos de la clase
     * @param x
     * @param y 
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * 
     * metodo que regresa el valor de x
     * @return x
     */
    public double getX() {
        return x;
    }
    /**
     * metodo que recibe el valor de x
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * metodo que regresa el valor de y
     * @return y;
     */
    public double getY() {
        return y;
    }
    /**
     * metodo que recibe el valor de y;
     * @param y 
     */
    public void setY(double y) {
        this.y = y;
    } 
}

