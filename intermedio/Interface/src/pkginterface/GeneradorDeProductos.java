/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author freya
 */
public class GeneradorDeProductos {
    public static ArrayList<Producto> generalProductos(int n){
        Random r = new Random();
        ArrayList<Producto> lprod = new ArrayList<Producto>();
        
        for(int i = 0; i < n; i++){
            Producto p = new Producto();
            p.setId(Integer.toString((int)(Math.random() * 1000000)));
            p.setValor(r.nextDouble() * 1000);
            lprod.add(p);

        }
        return lprod;
    }
}
