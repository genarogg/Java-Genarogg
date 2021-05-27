package herenciaypolimorfismo;

/**
 *
 * @author freya
 */
public class Entrenador extends Persona {
    private int duracion;

    public Entrenador() {
    }

    public Entrenador(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
    }

    public Entrenador(int duracion) {
        this.duracion = duracion;
    }

    public Entrenador(String nombre, String apellido, String DNI, int duracion) {
        super(nombre, apellido, DNI);
        this.duracion = duracion;
    }
    
    
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "duracion: " + duracion;
    }
    
}
