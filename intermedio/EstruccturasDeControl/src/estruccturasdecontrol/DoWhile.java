package estruccturasdecontrol;

/**
 *
 * @author freya
 */
public class DoWhile {
    public static void main(String[] args) {
        boolean verdadero = true;
        int i = 0;
        
        do{
            System.out.println("el valor es " + (i++));
            if(i >= 10){
                verdadero = false;
            }
        }while(verdadero);
    }
}
