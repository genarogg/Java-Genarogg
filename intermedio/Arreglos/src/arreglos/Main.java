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
public class Main {
    public static void main(String[] args) {
        OrdenamientoBurbuja o1 = new OrdenamientoBurbuja();
    
        int [] a = {5,33,23,45,11,555,674,3,2,7,6,90};
        
        o1.algoritmoBurboja(a);
        
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " | ");
        }
    
    }
    
}
