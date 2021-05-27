package herenciaypolimorfismo;

/**
 *
 * @author freya
 */
public class Manager extends Persona {
    private int popularidad;

    public Manager() {
    }

    public Manager(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
    }

    public Manager(int popularidad) {
        this.popularidad = popularidad;
    }

    public Manager( String nombre, String apellido, String DNI, int popularidad) {
        super(nombre, apellido, DNI);
        this.popularidad = popularidad;
    }

    
    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "popularidad: " + popularidad;
    }

   
}
