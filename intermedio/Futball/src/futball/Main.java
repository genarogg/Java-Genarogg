package futball;

/**
 *
 * @author genarogg
 */
public class Main {

    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista("Heraldo", "Acosta", "2423", "11", 4);
        
        System.out.println("el futbolista se llama " + futbolista.getNombre() + 
                ", su apellido es " + futbolista.getApellido() + ", su DNI es " 
                + futbolista.getDni() + ", su posicion " + futbolista.getPosicion()
                + " y su valor es " + futbolista.getValor());
    }
    
}
