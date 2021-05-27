package almacenempresasoft;

import java.util.ArrayList;

/**
 *
 * @author freya
 */
public class AlmacenDeGestion {
    private Producto [] almacen;
    
    public AlmacenDeGestion(){
        
    }
    public AlmacenDeGestion(Producto[] almacen) {
        this.almacen = almacen;
    }
    
    
    public Producto[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Producto[] almacen) {
        this.almacen = almacen;
    }
    
    
    
    public void OrdenarAlmacenPorValor(){
        Producto aux=new Producto();
        for(int i=0;i<almacen.length-1;i++){
            for(int j=0;j<almacen.length-i-1;j++){
                if(almacen[j].getValor()>almacen[j+1].getValor()){
                    aux=almacen[j];
                    almacen[j]=almacen[j+1];
                    almacen[j+1]=aux;
                }               
            }
        }
    }
    public Producto buscarProducto(String id){
        Producto p=new Producto();
        for(int i=0;i<almacen.length-1;i++){
            if(almacen[i].getIDproducto().compareTo(id)==0){
              p = almacen[i];  
            }
        }
        return p;
    }
    
    public void ordenarAlmacenPeso(){
        Producto aux=new Producto();
        for(int i=0;i<almacen.length-1;i++){
            for(int j=0;j<almacen.length-i-1;j++){
                if(almacen[j].getPeso()>almacen[j+1].getValor()){
                    aux=almacen[j];
                    almacen[j]=almacen[j+1];
                    almacen[j+1]=aux;
                }               
            }
        }
    }
    
    
    
    
    
    public void ordenamientoBurbuja(){
        Producto tem = new Producto();
        
        for(int i = 0; i < almacen.length - 1; i++){
            for(int j = 0 ; j < almacen.length - i - 1; j++){
                if(almacen[j].getValor() > almacen[j+1].getValor()){
                    tem = almacen[j];
                    almacen[j] = almacen[j+1];
                    almacen[j+1] = tem;
                }
            }
        }
    }
    
    public Producto busquedaBinaria(String id){
        Producto p = new Producto();
        for(int i = 0; i < almacen.length - 1; i++){
            if(almacen[i].getIDproducto().compareTo(id) == 0){
                p = almacen[i];
            }
        }
        return p;
    }
    
    public Producto BusquedaProductoBinaria(String id){
        int inf = 0;
        int sup = almacen.length - 1;
        boolean  encontrado = false;
        
        while((encontrado == false) && (sup >= inf )){
            int central = (inf + sup) / 2;
            if(almacen[central].getIDproducto() == id){
                encontrado = true;
            return almacen[central];
            }
            else if(id.compareTo(almacen[central].getIDproducto()) > 0){
                inf = central + 1;
            }
            else{
                sup = central - 1;
            }
        }
        return null;
    }
  
    public void imprimirListaProductos(){
        for(int i=0; i<almacen.length; i++){
            System.out.println(almacen[i].toString());
        }
    }
  
    public Producto[] prepararPedidosTC(int n){
        this.OrdenarAlmacenPorValor();
        ArrayList <Producto> lStock = new ArrayList<Producto>();
        int i = almacen.length - 1;
        int j = 0;
        
        while((i >= 0) && (j < n)){
            if(almacen[i].getClase().compareTo("A") == 0){
                lStock.add(almacen[i]);
                almacen[i].setAsignado(true);
                j++;
            }
            i--;
        }
        Producto[] resultado = new Producto[lStock.size()];
        lStock.toArray(resultado);
        return resultado;
    }
    
    public Producto[] prepararPedidosSM(int n){
        this.OrdenarAlmacenPorValor();
        ArrayList <Producto> lStock = new ArrayList<Producto>();
        int i = almacen.length - 1;
        int j = 0;
        
        while((i >= 0) && (j < n)){
            if(almacen[i].isAsignado() == false){
                lStock.add(almacen[i]);
                almacen[i].setAsignado(true);
                j++;
            }
            i--;
        }
        Producto[] resultado = new Producto[lStock.size()];
        lStock.toArray(resultado);
        return resultado;
    }
}
