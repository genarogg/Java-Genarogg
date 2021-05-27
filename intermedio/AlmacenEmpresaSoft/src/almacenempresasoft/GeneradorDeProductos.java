/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenempresasoft;

import java.util.Random;

/**
 *
 * @author freya
 */
public class GeneradorDeProductos {
    public static Producto[] generalProductos(int n){
        Random r = new Random();
        String[] listaClases = {"A","B", "C"};
        Producto[] resultado = new Producto[n];
        
        for(int i = 0; i < n; i++){
            Producto p = new Producto();
            p.setIDproducto(Integer.toString((int)(Math.random() * 1000000)));
            p.setValor(r.nextDouble() * 1000);
            p.setPeso(r.nextDouble() * 10);
            p.setAsignado(false);
            p.setClase(listaClases[r.nextInt(listaClases.length)]);
            resultado[i] = p;
        }
        return resultado;
    }
}
