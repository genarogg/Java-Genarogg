package sobrecargadeconstructores;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Gabriel", 20);
        System.out.println("\nSe Imprimira la Primera Persona");
        System.out.println(p1);
        
        Empleado e1 = new Empleado("Dante", 33, 2.500);
        System.out.println("\nSe Imprimira el Primer Empleado");
        System.out.println(e1);
        
        
    }
    
}
