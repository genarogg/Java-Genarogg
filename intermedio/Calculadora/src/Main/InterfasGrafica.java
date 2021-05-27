package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InterfasGrafica {
    JFrame jF;
    
    JPanel js = new JPanel();
    
    JPanel jPPantalla;
    JTextArea jTPantallaDer;
    

    public InterfasGrafica(){
        Esqueleto();
        
    }
    
    public void Esqueleto(){
        jF = new JFrame();
        panelSuperiorIzq();
        
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        
        jF.setBounds(alto/2, ancho/7, 500, 500);
        
        jF.add(jTPantallaDer, BorderLayout.EAST);
        
        
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.pack();
    }
    
    public void panelSuperiorIzq(){
        jPPantalla = new JPanel();
        jTPantallaDer = new JTextArea();
        
        jTPantallaDer.setText("dddddddddddddddddd");
        
        //Tamaño y Fuente de la letra
        jTPantallaDer.setFont(new Font(null, 1, 24));
        jTPantallaIzq.setForeground(new Color(220,220,220));
        
        //anular la edicion del area de texto
        jTPantallaIzq.setEditable(false);
        
        //Layout de panel 
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        
        //añadir layout al panel
        jPPantalla.setLayout(flow);
        
        jPPantalla.add(jTPantalla);
    }
    public void panelSuperiorDer(){
        
    }
}
