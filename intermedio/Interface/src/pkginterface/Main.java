package pkginterface;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author freya
 */
public class Main {
    public static void main(String[] args) {
       Producto p1 = new Producto();
       
       ArrayList <Producto> lprod = GeneradorDeProductos.generalProductos(10);
       
       Iterator <Producto> it = lprod.iterator();
       
       int i = 0;
       
       while(it.hasNext()){
           if(i == 4){
               it.remove();
           }
           else{
               it.next().imprime();
               System.out.println("posicion " + i);
           }
           i++;
       }
    }
    
}
