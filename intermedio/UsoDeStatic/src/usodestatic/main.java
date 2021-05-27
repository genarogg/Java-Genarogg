package usodestatic;

/**
 *
 * @author genarogg
 */
public class main {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("genaro", 300);
        Usuario u2 = new Usuario("gabriel", 499);
        
        Usuario.getNumeroDeUsuarios();
        
        
        PlataformaDeCrow p1 = new PlataformaDeCrow("Save the whales");
        PlataformaDeCrow p2 = new PlataformaDeCrow("Save the sun");
        
        u1.donarTodoDinero();
        u2.donarTodoDinero();
        
        PlataformaDeCrow.imprimirDineroTotal();
        
        p1.asignarDinero(300);
        p2.asignarDinero(300);
        
        PlataformaDeCrow.imprimirDineroTotal();
    }
    
}
