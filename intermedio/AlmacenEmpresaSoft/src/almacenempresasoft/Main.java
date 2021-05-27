package almacenempresasoft;
/**
 *
 * @author freya
 */
public class Main {

    public static void main(String[] args) {
        Producto [] lp = GeneradorDeProductos.generalProductos(10);
        AlmacenDeGestion  ag = new AlmacenDeGestion(lp);
        Producto [] s1 = ag.prepararPedidosTC(5);
        Producto [] s2 = ag.prepararPedidosSM(3);
        TiendaPrimeraMano t1 = new TiendaPrimeraMano("EmpresaGenaroGG", s1);
        TiendaSegundaMano t2 = new TiendaSegundaMano("EmpresaGenaro2", s2);
        ag.imprimirListaProductos();
        t1.imprimirEstadisticas();
        t2.imprimirEstadisticas();
    }
    
}
