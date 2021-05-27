package dibujarcasita;

import java.awt.Polygon;

public class Poligono {
    private int nPuntos;
    private int [] coordenadasY;
    private int [] coordenadasX;

    public Poligono() {
    }

    public Poligono(int nPuntos, int[] coordenadasY, int[] coordenadasX) {
        this.nPuntos = nPuntos;
        this.coordenadasY = coordenadasY;
        this.coordenadasX = coordenadasX;
    }

    public Polygon prepararPoligono(){
        return new Polygon(this.getCoordenadasX(), this.getCoordenadasY(), this.getnPuntos());
    }

    public int getnPuntos() {
        return nPuntos;
    }

    public void setnPuntos(int nPuntos) {
        this.nPuntos = nPuntos;
    }

    public int[] getCoordenadasY() {
        return coordenadasY;
    }

    public void setCoordenadasY(int[] coordenadasY) {
        this.coordenadasY = coordenadasY;
    }

    public int[] getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(int[] coordenadasX) {
        this.coordenadasX = coordenadasX;
    }
}
    
