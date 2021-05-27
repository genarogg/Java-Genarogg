package manejoif.pkgelse;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class ManejoIfElse {
    public static void main(String[] args) {
        String es = "Es ";
        
        String fechaS = JOptionPane.showInputDialog(null, "introduce el mes ");
        int fecha = parseInt(fechaS);
        
        if(fecha == 12 || fecha == 1 || fecha == 2){
            JOptionPane.showMessageDialog(null, es + "Invierno");
        }
        else if(fecha == 3 || fecha == 4 || fecha == 5){
            JOptionPane.showMessageDialog(null, es +  "Primavera");
        }
        else if(fecha == 6 || fecha == 7 || fecha == 8){
            JOptionPane.showMessageDialog(null, es +  "Verano");        
        }
        else if(fecha == 9 || fecha == 10 || fecha == 11){
            JOptionPane.showMessageDialog(null, es +  "Otoño");
        }
        else{
            JOptionPane.showMessageDialog(null, "solo puedes introducir valores entre el 1 al 12");
        }
    }
    
}
