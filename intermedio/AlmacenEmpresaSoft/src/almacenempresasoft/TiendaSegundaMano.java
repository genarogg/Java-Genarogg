package almacenempresasoft;

/**
 *
 * @author freya
 */
public class TiendaSegundaMano {
    private String nombre;
    private Producto [] Stock;

    public TiendaSegundaMano() {
    }

    public TiendaSegundaMano(String nombre, Producto[] Stock) {
        this.nombre = nombre;
        this.Stock = Stock;
        this.aplicarDescuentoSegundaMano();
    }

    public Producto[] getStock() {
        return Stock;
    }

    public void setStock(Producto[] Stock) {
        this.Stock = Stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirEstadisticas(){
        System.out.println("------------------------------------------");
        System.out.println("Lista de productos de la tienda de segunda mano");
        double beneficio = 0;
        Producto producto = new Producto();
        for(int i = 0; i < Stock.length; i++){
            Stock[i].imprime();
            beneficio += Stock[i].getValor();
        }
        System.out.println("El beneficio de la tienda del centro es: " + beneficio);
        System.out.println("-------------------------------------------");
        
    } 
    
    public void aplicarDescuentoSegundaMano(){
        for(int i = 0; i < Stock.length - 1; i++){
            if(Stock[i].getClase().compareTo("B") == 0){
                Stock[i].setValor(Stock[i].getValor() * 0.75);
            }
            if(Stock[i].getClase().compareTo("C") == 0){
                Stock[i].setValor(Stock[i].getValor() * 0.50);
            }
        }
    }
}
