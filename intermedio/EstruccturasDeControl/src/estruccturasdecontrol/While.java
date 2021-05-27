
package estruccturasdecontrol;

/**
 *
 * @author freya
 */
public class While {
    public static void main(String[] args) {
        boolean verdadero = true;
        int i = 1;
        while(verdadero){
            if(i == 10){
                verdadero = false;
            }
            System.out.println("el valor es " + (i++));
        }
    }
}
