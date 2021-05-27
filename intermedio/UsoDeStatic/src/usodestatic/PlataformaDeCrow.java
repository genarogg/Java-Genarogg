package usodestatic;

public class PlataformaDeCrow {
    private String nombre;
    private double dineroPropio;
    private static double dineroTotal;
    
    public PlataformaDeCrow(String nombre){
        this.nombre = nombre;
    }
    public static double getDineroTotal() {
        return dineroTotal;
    }

    public static void setDineroTotal(double aDineroTotal) {
        dineroTotal = aDineroTotal;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDineroPropio() {
        return dineroPropio;
    }

    public void setDineroPropio(double dineroPropio) {
        this.dineroPropio = dineroPropio;
    }
    public void asignarDinero(double cantidadDinero){
        dineroTotal = dineroTotal - cantidadDinero;
        this.dineroPropio = cantidadDinero;
    }
    
    public static void recogerDinero(double dinero){
        PlataformaDeCrow.dineroTotal += dinero;
    }
    
    public static void imprimirDineroTotal(){
        System.out.println("el dinero del que se dispone es de " + dineroTotal);
    }
    
}
