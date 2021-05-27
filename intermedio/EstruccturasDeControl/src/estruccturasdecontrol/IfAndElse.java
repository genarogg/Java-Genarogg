package estruccturasdecontrol;

/**
 *
 * @author freya
 */
public class IfAndElse {
    public static void main(String[] args) {
        boolean verdadero = true;
        boolean falso = false;
        
        if(verdadero == falso){
            System.out.println("Estas equivocado");
        }
        else if(verdadero != falso){
            System.out.println("El resultado es verdadero");
        }
        else{
            System.out.println("Aqui jamas entrara");
        }
        
    }
}
