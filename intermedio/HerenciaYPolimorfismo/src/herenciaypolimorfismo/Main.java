/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaypolimorfismo;

/**
 *
 * @author freya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Genaro", "Gonzalez","25.075.591");
        Manager manager1 = new Manager("Gabriel", "Gonzalez", "28.050.905", 90);
        Entrenador entrenador1 = new Entrenador("Octavio", "Gonzalez", "23.444.333", 30);
        Futbolista futbolista1 = new Futbolista("Francisco", "Gonzalez", "22.444.333", "12", 35.0);
        
        System.out.println("Persona1 = " + persona1);
        System.out.println("Manager1 = " + manager1);
        System.out.println("Entrenador1 = " + entrenador1);
        System.out.println("Futbolista1 = " + futbolista1);
    }
    
}
