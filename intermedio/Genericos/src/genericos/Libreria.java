package genericos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author freya
 */
public class Libreria {
    ArrayList<Libro> libros;
    String nombre;

    public Libreria() {
    }

    public Libreria(ArrayList<Libro> libros, String nombre) {
        this.libros = libros;
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void anadirLibro(String isbn, String titulo, String autor, double precio){
        Libro l = new Libro(isbn, titulo, autor, precio);
        libros.add(l);
    }    
    
    public void imprimirCatalogo() throws IOException{
        System.out.println("Desea guardar el catalogo en un fichero de texto?");
        
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        
        if(respuesta.compareToIgnoreCase("s") == 0){
            System.out.println("Escribe el nombre del archivo destino");
            String filename = sc.nextLine();
            
            FileWriter escritor = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(escritor);
            
            Iterator <Libro> it = libros.iterator();
            
            while(it.hasNext()){
                Libro l = it.next();
                l.imprime(pw);
            }
            pw.close();
        }
        Iterator <Libro> it = libros.iterator();
            
            while(it.hasNext()){
                Libro l = it.next();
                l.imprime();
            }
    }
    
    public Libro borrarLibro(String isbn){
        boolean encontrado = false;
        Iterator <Libro> it = libros.iterator();
        
        while(it.hasNext() && (encontrado == false)){
            Libro l = it.next();
            
            if(l.getIsbn().compareTo(isbn) == 0){
                encontrado = true;
                return l;
            }
        }
        return null;
    }
    
    public ArrayList<Libro> filtrarPorAutor(String autor) throws IOException{
        ArrayList <Libro> subLista = new ArrayList<Libro>();
        Iterator <Libro> it = libros.iterator();
        
        while(it.hasNext()){
            Libro l = it.next();
            
            if(l.getAutor().compareToIgnoreCase(autor) == 0){
                subLista.add(l);
            }
        }
        
        System.out.println("Desea guardar el catalogo en un fichero de texto?");
       
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        
        if(respuesta.compareToIgnoreCase("s") == 0){
            System.out.println("Escribe el nombre del archivo destino");
            String filename = sc.nextLine();
            
            FileWriter escritor = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(escritor);
            
            Iterator <Libro> it2 = subLista.iterator();
            
            while(it2.hasNext()){
                Libro l = it2.next();
                l.imprime(pw);
            }
            pw.close();
        }
        Iterator <Libro> it3 = subLista.iterator();
            
            while(it3.hasNext()){
                Libro l = it3.next();
                l.imprime();
            }
        return subLista;
    }
    
    public ArrayList<Libro> filtrarPorPrecio(double precioMax) throws IOException{
        ArrayList <Libro> subLista = new ArrayList<Libro>();
        Iterator <Libro> it = libros.iterator();
        
        while(it.hasNext()){
            Libro l = it.next();
            if(l.getPrecio() <= precioMax ){
                subLista.add(l);
            }
        }
        System.out.println("Desea guardar el catalogo en un fichero de texto?");
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        
        if(respuesta.compareToIgnoreCase("s") == 0){
            System.out.println("Escribe el nombre del archivo destino");
            String filename = sc.nextLine();
            
            FileWriter escritor = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(escritor);
            
            Iterator <Libro> it2 = subLista.iterator();
            
            while(it2.hasNext()){
                Libro l = it2.next();
                l.imprime(pw);
            }
            pw.close();
        }
        Iterator <Libro> it3 = subLista.iterator();
            
            while(it3.hasNext()){
                Libro l = it3.next();
                l.imprime();
            }
        return subLista;       
    }
    
}
