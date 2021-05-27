/*
 * Queremos hacer un sistema de venta de billetes para el metro que abarque el trayecto
 * Desde MegaCity a PuebloVillage sin transbordos
 * Los empleados de la estacion  se hacen cargo de la venta de estos billetes desde su taquilla
 * Un tren esta formado por la locomotora que se ocupa de llevar 6 vagones (2 vagosnes clase Premiun y 4 turista)
 * En cada vagon hay 40 plazas 20 de ventanilla y 20 de pasillo
 * Cada plaza tiene un numero de identificacion y las exteriores seran de ventanilla y las interios de pasillo.
 * Existen 2 clases de billetes: Premiun (los primeros 2 vagones) y turista (del vagon 4 al 6 incluidos)
 * El billete Premium vale 20 euros mientras que el turista vale 6.95
 * Cada billete tiene un id unico
 * Hay un encargado de seguridad que debe poder disponer de los horarios de los trenes para evitar accidentes.
 * Desde la linea de metro se debe disponer de todo la informacion de los trenes
 * La taquilla de venta deisponer de informacion de la linea de metro
 * La linea de metro se encarga de procesar la informacion referente a las reservas
 */
package elmetrov2;


public class Main {
    public static void main(String[] args){
        LineaDeMetro lm = new LineaDeMetro();
        
        Plaza p[] = new Plaza[40];
        for(int i=0; i < p.length; i++){
            Plaza pl = new Plaza();
            pl.setIdPlaza(i);
            pl.setEstado(false);
            p[i] = pl;
        }
        
        Vagon v[] = new Vagon[6];
        for(int i=0; i< v.length; i++){
            Vagon va=new Vagon();
            va.setIdVagon(i);
            va.setPlazas(p);
            v[i]=va;
        }
        
        Tren t[] = new Tren[1];
        for(int i=0;i<t.length;i++){
              Tren t1=new Tren();
              t1.setHorario("Mañana");
              t1.setVagones(v);
              t[i]=t1;
        }
        
        lm.setTrenes(t);
        Taquilla ve = new Taquilla();
        ve.setLm(lm);
        ve.venderBillete();
    }
}
