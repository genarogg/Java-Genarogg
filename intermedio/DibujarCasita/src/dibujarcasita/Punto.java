package dibujarcasita;

/**
 *
 * @author genarogg
 */
public class Punto {
    private int puntoY;
    private int puntoX;
    
    public Punto(){
        
    }
    public Punto(int puntoX, int puntoY) {
        this.puntoY = puntoY;
        this.puntoX = puntoX;
    }

    public int getPuntoY() {
        return puntoY;
    }

    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }

    public int getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }
}
