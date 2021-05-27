package genericos;

/**
 *
 * @author freya
 */
public class Profesor extends Persona {
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, double DNI) {
        super(nombre, apellido, DNI);
    }

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(String nombre, String apellido, double DNI, String especialidad) {
        super(nombre, apellido, DNI);
        this.especialidad = especialidad;
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Estecialidad: " + especialidad;
    }
    
}
