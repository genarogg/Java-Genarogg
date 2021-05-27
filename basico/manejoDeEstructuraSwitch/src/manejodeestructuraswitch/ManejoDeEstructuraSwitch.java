package manejodeestructuraswitch;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class ManejoDeEstructuraSwitch {

    public static void main(String[] args) {
        String es = "Es ";
        String fechaS = JOptionPane.showInputDialog(null,"Introduce el mes ");
        int fecha = parseInt(fechaS);
        
        switch(fecha){
            case 12: case 1: case 2:
                JOptionPane.showMessageDialog(null, es + "Primavera");
                break;
                
            case 3: case 4: case 5:
                JOptionPane.showMessageDialog(null, es + "Invierno");
                break;    
            case 6: case 7: case 8:
                JOptionPane.showMessageDialog(null, es + "Verano");
                break;
                
            case 9: case 10: case 11:
                JOptionPane.showMessageDialog(null, es + "Otoño");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Solo puedes introducir numeros del 1 al 12");
        }
    }
    
}
