package sobrecargadeconstructores;

public class Persona {
    private String nombre;
    private int idPersona;
    private int edad;
    static int contadorDeInstancias;
    
    private Persona(){
        contadorDeInstancias++;
    }
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.idPersona = contadorDeInstancias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getContadorDeInstancias(){
        return contadorDeInstancias;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", idPersona = " + idPersona + ", edad = " + edad + '}';
    }
    
    
}
