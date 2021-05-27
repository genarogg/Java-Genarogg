/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author freya
 */
public class Busqueda {
    public int BusquedaSecNoOrd(int elemento, int [] a){
        int i = 0;
        boolean encontrado = false;

        while((i < a.length) || (encontrado == false)){
            if(a[i] == elemento){
                encontrado = true;
                return a[i];
            }
            i++;
        }
        return -1;
    }
    
    public int busquedaBinaria(int elemento, int[] a){
        int inf = 0;
        int sup = a.length - 1;
        boolean encontrado = false;
        
        while((encontrado == false) && (sup >= inf)){
            int central = (inf + sup) / 2;
            if(a[central] == elemento){
                encontrado = true;
                return a[central];
            }
            else if(elemento > a[central]){
                inf = central - 1;
            }
            else{
                sup = central - 1;
            }
        }
        return -1;
    }
}
