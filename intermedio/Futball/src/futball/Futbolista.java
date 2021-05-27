package futball;

public class Futbolista {
    private String nombre;
    private String apellido;
    private String dni;
    private String posicion;
    private double valor; 
    
    public Futbolista(){
        
    }
    
    public Futbolista(String nombre, String apellido, String dni, String posicion, double valor){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.posicion = posicion;
        this.valor = valor;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
