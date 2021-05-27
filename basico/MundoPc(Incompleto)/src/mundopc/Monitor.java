package mundopc;

public class Monitor {

    
    private int idMonitor;
    private static int contadorDeMonitores;
    private String marca;
    private double tamaño;

    private Monitor() {
        contadorDeMonitores++;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
        idMonitor = contadorDeMonitores;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }
    public static int getContadorDeMonitores() {
        return contadorDeMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor = " + idMonitor + ", marca = " + marca + ", tamaño =" + tamaño + '}';
    }
    
    
    
}