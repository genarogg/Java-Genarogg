package dibujarcasita;

public class Ovalo {
    private int coordenadaX;
    private int coordenadaY;
    private int ancho;
    private int alto;

    public Ovalo() {
    }

    public Ovalo(int coordenadaX, int coordenadaY, int ancho, int alto) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
}
