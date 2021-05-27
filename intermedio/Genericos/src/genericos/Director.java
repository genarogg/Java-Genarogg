package genericos;

/**
 *
 * @author freya
 */
public class Director extends Persona {
    private double valoracion;

    public Director() {
    }

    public Director(String nombre, String apellido, double DNI) {
        super(nombre, apellido, DNI);
    }

    public Director(double valoracion) {
        this.valoracion = valoracion;
    }

    public Director( String nombre, String apellido, double DNI, double valoracion) {
        super(nombre, apellido, DNI);
        this.valoracion = valoracion;
    }

    
    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
    
}
