/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriav2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author freya
 */
public class Sesion {
    ArrayList<Libro> catalogo;
    
    public Sesion() {
    }

    public Sesion(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public ArrayList <Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList <Libro> catalogo) {
        this.catalogo = catalogo;
    }
        public void guardarCatalogo() throws FileNotFoundException, IOException{
        System.out.println("Escribo un nombre de archivo destino");
        
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        
        FileOutputStream escritor=new FileOutputStream(filename);
        ObjectOutputStream salida=new ObjectOutputStream(escritor);
        
        salida.writeObject(catalogo);
        salida.close();    
    }
    
    public ArrayList<Libro> cargarCatalogo() throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("Escribo un nombre de archivo origen");
        
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        
        FileInputStream lector=new FileInputStream(filename);
        ObjectInputStream entrada=new ObjectInputStream(lector);
        
        ArrayList<Libro> lista=(ArrayList<Libro>) entrada.readObject();
        
        return lista;
    }   
}
