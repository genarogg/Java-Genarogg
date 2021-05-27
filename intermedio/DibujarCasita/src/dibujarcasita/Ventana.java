package dibujarcasita;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ventana {
        public Ventana(){
        
        JFrame  jF= new JFrame("Casita");
        Dibujo panelDelDibujo = new Dibujo();
        
        jF.add(panelDelDibujo);
        

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int altoPantalla = pantalla.height;
        int anchoPantalla = pantalla.width;

        jF.setBounds(anchoPantalla/3,altoPantalla/4,400,400);
        
        
        
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    
    
    
}
