package genericos;

import java.io.PrintWriter;
import java.io.Serializable;
import java.text.DecimalFormat;

/**
 *
 * @author freya
 */
public class Libro implements Serializable {
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;    

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void imprime(){
        DecimalFormat decimales=new DecimalFormat("00.00");
        System.out.println("ISBN: "+this.getIsbn()+" Titulo: "+this.getTitulo()+" Autor: "+this.getAutor()+" precio: "+decimales.format(this.getPrecio())+" €");
    }
    
    public void imprime(PrintWriter salida){
        DecimalFormat decimales=new DecimalFormat("00.00");
        salida.println("ISBN: "+this.getIsbn()+" Titulo: "+this.getTitulo()+" Autor: "+this.getAutor()+" precio: "+decimales.format(this.getPrecio())+" €");
    }
    
}

