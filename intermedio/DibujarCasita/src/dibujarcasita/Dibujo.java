package dibujarcasita;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo extends JPanel {
    public Dibujo(){
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        Poligono poligono1 = new Poligono();
        int [] coordenadasX1 = {150, 220, 220, 150};
        int [] coordenadasY1 = {300, 300, 230, 230};
        
        poligono1.setnPuntos(4);
        poligono1.setCoordenadasX(coordenadasX1);
        poligono1.setCoordenadasY(coordenadasY1);
        g.setColor(Color.RED);
        g.fillPolygon(poligono1.prepararPoligono());
        
        
        Poligono poligono2 = new Poligono();
        int [] coordenadasX2 = {130, 185, 240};
        int [] coordenadasY2 = {230, 180, 230};
        
        poligono2.setnPuntos(3);
        poligono2.setCoordenadasX(coordenadasX2);
        poligono2.setCoordenadasY(coordenadasY2);
        g.setColor(Color.orange);
        g.fillPolygon(poligono2.prepararPoligono());
        
        Ovalo ovalo = new Ovalo(300, 50, 50, 50);
        g.setColor(Color.BLUE);
        g.fillOval(ovalo.getCoordenadaX(), ovalo.getCoordenadaY(), ovalo.getAncho(), ovalo.getAlto());
        
        Recta recta = new Recta();
        recta.setpInicial(new Punto(0,300));
        recta.setpFinal(new Punto (400, 300));
        g.setColor(Color.green);
        g.drawLine(recta.getpInicial().getPuntoX(),recta.getpInicial().getPuntoY(), recta.getpFinal().getPuntoX(), recta.getpFinal().getPuntoY());
  
        
        
        
        
        
    }
        
    
}
