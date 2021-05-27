package mundopc;

public class Computadora {
    private int idComputadora;
    private static int contadorDeComputadoras;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    private Computadora() {
        contadorDeComputadoras++;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        idComputadora = contadorDeComputadoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }
    public static int getContadorDeComputadoras() {
        return contadorDeComputadoras;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora = " + idComputadora + ", nombre = " + nombre + ", monitor=" + monitor + ", teclado = " + teclado + ", raton = " + raton + '}';
    }
    
    
}
