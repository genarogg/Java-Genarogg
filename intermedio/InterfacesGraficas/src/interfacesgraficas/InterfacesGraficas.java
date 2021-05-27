package interfacesgraficas;



import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfacesGraficas {
    
    public InterfacesGraficas(){
        JFrame jF = new JFrame();
        JLabel jL1 = new JLabel();
        JTextField jTF1 = new JTextField();
        JButton jB1 = new JButton();
        JScrollPane jSP = new JScrollPane();
        JTextArea jTA1 = new JTextArea();
        
        jL1.setText("Introduce tu nombre: ");
        jB1.setText("saludar");
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        
        jL1.setBounds(25, 25, 150, 20);
        jTF1.setBounds(151, 24, 80, 20);
        jB1.setBounds(240, 24, 80, 20);
        jTA1.setBounds(25, 50, 294, 150);
        
        jF.setBounds(ancho/3 + 15, alto/4, 353, 250);
        
        
        jF.add(jL1);
        jF.add(jTF1);
        jF.add(jB1);
        jTA1.add(jSP);
        jF.add(jTA1);
        
        ActionListener listeners = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jTA1.setText("Bienvenido " + jTF1.getText() + " a la interfas grafica " + jTA1.getText());
                
            }
            
        };
        
        jB1.addActionListener(listeners);
        
        jF.setLayout(null);
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        new InterfacesGraficas();
    }
    
}
