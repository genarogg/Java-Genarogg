package ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorDeOrdenes;
    private int contadorDeProductos;
    private static final int maxProductos = 10;
    
    public Orden(){
        this.idOrden = ++contadorDeOrdenes;
        productos = new Producto[maxProductos];
    }
    public void agregarProducto(Producto producto){
        if (contadorDeProductos < maxProductos) {
            productos[contadorDeProductos++] = producto;
        }
        else{
            System.out.println("se ha superado el maximo de productos " + maxProductos);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < contadorDeProductos; i++){
        total += productos[i].getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Orden #:" + idOrden);
        System.out.println("Total de la orden #" + idOrden + ": $" + calcularTotal());
        System.out.println("Productos de la orden #" + idOrden + ":");
        for(int i = 0; i < contadorDeProductos; i++){
            System.out.println(productos[i]);
        }
    }
}
