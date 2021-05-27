package elcolegio;

/**
 *
 * @author freya
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private double DNI;

    public Persona() {
    }

    public Persona(String nombre, String apellido, double DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getDNI() {
        return DNI;
    }

    public void setDNI(double DNI) {
        this.DNI = DNI;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre +  " Apellido: " + apellido + "DNI: " + DNI;
    }
    
    public void imprime(){
        System.out.println("Nombre: " + nombre +  " Apellido: " + apellido + "DNI: " + DNI);
    }
}
