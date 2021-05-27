
package basico;

/**
 *
 * @author genarogg
 */
public class LeyDeAtraccionGravitacional {
    public static void main(String[] args) {
        double fuerza;
        final double FGRAVITACIONAL = 6.67e-11;
        double masaDeLaTierra = 5.97e24;
        double masaDelSol = 1.98e30;
        double distancia = 149600000;
        fuerza = (FGRAVITACIONAL * masaDeLaTierra * masaDelSol) / (distancia * distancia);
        
        System.out.println("la fuerza con la que se atraen el sol y la tierra en igual a " + fuerza);
    }        
}
