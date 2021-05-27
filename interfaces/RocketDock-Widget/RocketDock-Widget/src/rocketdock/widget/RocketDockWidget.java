package rocketdock.widget;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;



/**
 *
 * @author Genarogg
 */
public class RocketDockWidget {
    private JDialog jD;
    private JLabel jLFondo;
    
    private JLabel jLFacebook;
    private JLabel jLYoutube;
    private JLabel jLtwitter;
    private JLabel jLVisualStudio;
    private JLabel jLCalculadora;
    private JLabel jLWord;
    
    private int yMouse;
    private int xMouse;
    public RocketDockWidget(){
        
        
        jD = new JDialog();
        jLFondo = new JLabel();
        
        
        
        //Botones 
        jLFacebook = new JLabel();
        jLYoutube = new JLabel();
        jLtwitter = new JLabel();
        jLVisualStudio = new JLabel();
        jLCalculadora = new JLabel();
        jLWord = new JLabel();
        
        
        //Tamaño y posicion de los botones{
        
        int separacionDeLosIconos = 588 / 8 ;
        jLFacebook.setBounds(separacionDeLosIconos, 12, 50, 50);
        jLFacebook.setIcon(new ImageIcon(getClass().getResource("/Img/facebook_off.png")));
        
        jLYoutube.setBounds(separacionDeLosIconos * 2, 12, 50, 50);
        jLYoutube.setIcon(new ImageIcon(getClass().getResource("/Img/youtube_off.png")));
        
        jLtwitter.setBounds(separacionDeLosIconos * 3, 12, 50, 50);
        jLtwitter.setIcon(new ImageIcon(getClass().getResource("/Img/twitter_off.png")));
        
        jLVisualStudio.setBounds(separacionDeLosIconos * 4, 12, 50, 50);
        jLVisualStudio.setIcon(new ImageIcon(getClass().getResource("/Img/visualstudio_off.png")));
        
        jLCalculadora.setBounds(separacionDeLosIconos * 5, 12, 50, 50);
        jLCalculadora.setIcon(new ImageIcon(getClass().getResource("/Img/calculator_off.png")));
        
        jLWord.setBounds(separacionDeLosIconos * 6, 12, 50, 50);
        jLWord.setIcon(new ImageIcon(getClass().getResource("/Img/word_off.png")));
        
         
        
        
        
        
        
        //Interfaz del backgrounds
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        
        jLFondo.setBounds(0, 0, 578, 72);
        jD.setBounds(ancho / 2 - 289, 1, 578, 72);
        int anchoDePantalla = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 289;
        //jD.setLocation(anchoDePantalla, 3);
        //jD.setSize( 578, 72);
        jLFondo.setIcon(new ImageIcon(getClass().getResource("/Img/background.png")));
        
        eventos();
        
        jD.add(jLFacebook);
        jD.add(jLYoutube);
        jD.add(jLtwitter);
        jD.add(jLVisualStudio);
        jD.add(jLCalculadora);
        jD.add(jLWord);
        
        jD.add(jLFondo);
        
        
        jD.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jD.setUndecorated(true);
        //jD.setAlwaysOnTop(true);
        jD.setResizable(false);
        jD.setVisible(true);
        
    }
    //Comportamiento de los botones
    private void jLFacebookMouseClicked(MouseEvent e){
        try{
            Desktop.getDesktop().browse(URI.create("www.facebook.com"));
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
    }
    
    private void jLFacebookMouseReleased(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getClass().getResource("/img/facebook_off.png"));
        jLFacebook.setIcon(ico);
    }
    
    private void jLFacebookMousePressed(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getResource("/Img/facebook_on.png"));
        jLFacebook.setIcon(ico);
    }
    
    private void jLYoutubeMouseClicked(MouseEvent e){
        try{
            Desktop.getDesktop().browse(URI.create("www.youtube.com"));
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
    }
    
    private void jLYoutubeMouseReleased(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getClass().getResource("/img/youtube_off.png"));
        jLYoutube.setIcon(ico);
    }
    
    private void jLYoutubeMousePressed(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getResource("/Img/youtube_on.png"));
        jLYoutube.setIcon(ico);
    }
    
    private void jLtwitterMouseClicked(MouseEvent e){
        try{
            Desktop.getDesktop().browse(URI.create("www.twitter.com"));
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
    }
    
    private void jLtwitterMouseReleased(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getClass().getResource("/Img/twitter_off.png"));
        jLtwitter.setIcon(ico);
    }
    
    private void jLtwitterMousePressed(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getResource("/Img/twitter_on.png"));
        jLtwitter.setIcon(ico);
    }
    
    private void jLVisualStudioMouseClicked(MouseEvent e){
        
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("C:\\Users\\Genarogg\\AppData\\Local\\Programs\\Microsoft VS Code\\code.exe");
            p.waitFor();
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
        catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
    }
    
    private void jLVisualStudioMouseReleased(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getClass().getResource("/Img/visualstudio_off.png"));
        jLVisualStudio.setIcon(ico);
    }
    
    private void jLVisualStudioMousePressed(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getResource("/Img/visualstudio_on.png"));
        jLVisualStudio.setIcon(ico);
    }
    
    private void jLCalculadoraMouseClicked(MouseEvent e){
        
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
        catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
    }
    
    private void jLCalculadoraMouseReleased(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getClass().getResource("/Img/calculator_off.png"));
        jLCalculadora.setIcon(ico);
    }
    
    private void jLCalculadoraMousePressed(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getResource("/Img/calculator_on.png"));
        jLCalculadora.setIcon(ico);
    }
    
    private void jLWordMouseClicked(MouseEvent e){
        
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("C:\\Program Files\\Microsoft Office\\office16\\WIWORD.exe");
            p.waitFor();
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
        catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "RocketDockgg", 0);
        }
    }
    
    private void jLWordMouseReleased(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getClass().getResource("/Img/word_off.png"));
        jLWord.setIcon(ico);
    }
    
    private void jLWordMousePressed(MouseEvent e){
        ImageIcon ico = new ImageIcon(getClass().getResource("/Img/word_on.png"));
        jLWord.setIcon(ico);
    }
    
    private void jLFondoMouseDragged(MouseEvent e){
        int x = e.getXOnScreen();
        int y = e.getYOnScreen();
        jD.setLocation(x - xMouse, y - yMouse);
    }
    
    private void jLFondoMousePressed(MouseEvent e){
        xMouse = e.getX();
        yMouse = e.getY();
    }
    
    //Añadir eventos
    public void eventos(){
        jLFacebook.addMouseListener(new MouseAdapter(){
           
            public void mouseClicked(MouseEvent e){
                jLFacebookMouseClicked(e);
            }
            
            public void mouseReleased(MouseEvent e){
                jLFacebookMouseReleased(e);
            }
            
            public void mousePressed(MouseEvent e){
                jLFacebookMousePressed(e);
            }
        });
        jLYoutube.addMouseListener(new MouseAdapter(){
           
            public void mouseClicked(MouseEvent e){
                jLYoutubeMouseClicked(e);
            }
            
            public void mouseReleased(MouseEvent e){
                jLYoutubeMouseReleased(e);
            }
            
            public void mousePressed(MouseEvent e){
                jLYoutubeMousePressed(e);
            }
        });
        jLtwitter.addMouseListener(new MouseAdapter(){
           
            public void mouseClicked(MouseEvent e){
                jLtwitterMouseClicked(e);
            }
            
            public void mouseReleased(MouseEvent e){
                jLtwitterMouseReleased(e);
            }
            
            public void mousePressed(MouseEvent e){
                jLtwitterMousePressed(e);
            }
        });
        jLVisualStudio.addMouseListener(new MouseAdapter(){
           
            public void mouseClicked(MouseEvent e){
                jLVisualStudioMouseClicked(e);
            }
            
            public void mouseReleased(MouseEvent e){
                jLVisualStudioMouseReleased(e);
            }
            
            public void mousePressed(MouseEvent e){
                jLVisualStudioMousePressed(e);
            }
        });
        jLCalculadora.addMouseListener(new MouseAdapter(){
           
            public void mouseClicked(MouseEvent e){
                jLCalculadoraMouseClicked(e);
            }
            
            public void mouseReleased(MouseEvent e){
                jLCalculadoraMouseReleased(e);
            }
            
            public void mousePressed(MouseEvent e){
                jLCalculadoraMousePressed(e);
            }
        });
        jLWord.addMouseListener(new MouseAdapter(){
           
            public void mouseClicked(MouseEvent e){
                jLWordMouseClicked(e);
            }
            
            public void mouseReleased(MouseEvent e){
                jLWordMouseReleased(e);
            }
            
            public void mousePressed(MouseEvent e){
                jLWordMousePressed(e);
            }
        });
        
        jD.addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLFondoMouseDragged(evt);
                
            }
            
        });
        jD.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                jLFondoMousePressed(e);
                
            }
        });
        
        
    }
            
            
            
            
            
            
            
            
            
            
            

    
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
        }
        catch(UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
            
        }
        
        new RocketDockWidget();
    }
    
}
