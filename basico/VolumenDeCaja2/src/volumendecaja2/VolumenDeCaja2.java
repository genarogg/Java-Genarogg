package volumendecaja2;

public class VolumenDeCaja2 {

    private double alto;
    private double ancho;
    private double profundidad;
    double volumen;
    
    public VolumenDeCaja2(){
        
    }
    public VolumenDeCaja2(double alto, double ancho, double profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    
    public double obtenerVolumen(){
        volumen = alto * ancho * profundidad;
        return volumen;
    }
    public double obtenerVolumen(double alto, double ancho, double profundidad){
        volumen = alto * ancho * profundidad;
        return volumen;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    @Override
    public String toString(){
        return "el volumen de la caja es: " + (alto * ancho * profundidad);
    }
    
    public static void main(String[] args) {
        VolumenDeCaja2 caja1 = new VolumenDeCaja2();
        System.out.println(caja1.obtenerVolumen(32, 12, 44));
    }    
}
