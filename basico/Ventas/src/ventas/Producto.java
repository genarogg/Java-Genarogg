package ventas;

public class Producto {
    private String nombre;
    private double precio;
    private static int contadorDeProductos;
    private int idProducto;
    
    private Producto(){
        contadorDeProductos++;
    }

    public Producto(String nombre, double precio) {
        this();
        idProducto = contadorDeProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public static int getContadorDeProductos(){
        return contadorDeProductos;
    }
    public int getIdProductos(){
        return this.idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + ", idProducto = " + idProducto  + "nombre = " + nombre +", precio = " + precio + '}';
    }
    
}
