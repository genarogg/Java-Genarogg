package genericos;

/**
 *
 * @author freya
 */
public class Delegado extends Alumno{
    private double valoracion;

    public Delegado(String nombre, String apellido, double DNI) {
        super(nombre, apellido, DNI);
    }

    public Delegado(String nombre, String apellido, double DNI, String Curso, double notaMedia) {
        super(nombre, apellido, DNI, Curso, notaMedia);
    }

    public Delegado(String nombre, String apellido, double DNI, double valoracion) {
        super(nombre, apellido, DNI);
        this.valoracion = valoracion;
    }

    public Delegado(String nombre, String apellido, double DNI, String Curso, double notaMedia, double valoracion) {
        super(nombre, apellido, DNI, Curso, notaMedia);
        this.valoracion = valoracion;
    }
    
    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + "Valoracion: " + valoracion;
    }   
    
}
