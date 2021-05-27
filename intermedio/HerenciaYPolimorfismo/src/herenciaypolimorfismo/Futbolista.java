package herenciaypolimorfismo;

/**
 *
 * @author freya
 */
public class Futbolista extends Persona{
    private String posicion;
    private double valor;

    public Futbolista() {
    }

    public Futbolista(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
    }

    public Futbolista(String posicion, double valor) {
        this.posicion = posicion;
        this.valor = valor;
    }

    public Futbolista( String nombre, String apellido, String DNI, String posicion, double valor) {
        super(nombre, apellido, DNI);
        this.posicion = posicion;
        this.valor = valor;
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

    @Override
    public String toString() {
        return super.toString() + ", " + "posicion: " + posicion + ", valor: " + valor;
    }
    
}
