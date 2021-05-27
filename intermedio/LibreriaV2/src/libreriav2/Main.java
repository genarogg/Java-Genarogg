package libreriav2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author freya
 */
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Libreria libreria=new Libreria();
        libreria.setNombre("Mi libreria");
        
        GeneradorDeLibros gl = new GeneradorDeLibros();
        libreria.setLibros(gl.generarLibros(15));
        
        String opcion="";
        
        while(opcion.compareTo("8") != 0){
            mostrarMenu();
            Scanner sc=new Scanner(System.in);
            opcion=sc.nextLine();
            
            switch(opcion){
                case "1": { Sesion s =new Sesion();
                            libreria.setLibros(s.cargarCatalogo());
                            break;}
                
                case "2":   { Sesion s =new Sesion();
                            s.setCatalogo(libreria.getLibros());
                            s.guardarCatalogo();
                            break;} 
                
                case "3": {System.out.println("Escribe el ISBN del libro");
                            String isbn=sc.nextLine();
                            System.out.println("Escribe el titulo del libro");
                            String titulo=sc.nextLine();
                            System.out.println("Escribe el autor del libro");
                            String autor=sc.nextLine();
                            System.out.println("Escribe el precio del libro");
                            double precio=Double.parseDouble(sc.nextLine());
                            libreria.anadirLibro(isbn, titulo, autor, precio);
                             break;}
                
                case "4":  {System.out.println("Escribe el ISBN del libro");
                            String isbn=sc.nextLine();
                            libreria.borrarLibro(isbn);
                            break;}
                
                case "5":   {System.out.println("Escribe el autor del libro");
                            String autor=sc.nextLine();
                            libreria.filtrarPorAutor(autor);
                            break;} 
                
                case "6":    {System.out.println("Escribe el precio maximo");
                            double precio=Double.valueOf(sc.nextLine());
                            libreria.filtrarPorPrecio(precio);
                            break;}
                
                case "7":    {libreria.imprimirCatalogo();
                                break;}
                
                case "8":   {System.out.println("hasta Luego!!");
                                break;}
                    
                default:{System.out.println("opcion incorrecta");
                            break;}
            }
        }  
    }
    
    public static void mostrarMenu(){
      System.out.println("---------------------Menu--------------------");
      System.out.println("1.Cargar Catalogo");
      System.out.println("2.Guardar Catalogo");
      System.out.println("3.Añadir nuevo libro");
      System.out.println("4.Borrar libro del catalogo (ISBN)");
      System.out.println("5.Filtrar por autor");
      System.out.println("6.Filrar por precio");
      System.out.println("7.Imprimir Catalogo");
      System.out.println("8.Salir");
  }    
}
