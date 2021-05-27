package GuardarPorSerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author freya
 */
public class Main implements Serializable{
    public static void main(String[]args)throws IOException, ClassNotFoundException{
        Persona p1 = new Persona("Genaro", "Gonzalez");
        
        FileOutputStream archivo = new FileOutputStream("./src/GuardarPorSerializable/objeto.gg");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        salida.writeObject(p1);
        salida.close();
        
        FileInputStream archivo2 = new FileInputStream("objeto.gg");
        ObjectInputStream entrada = new ObjectInputStream(archivo2);
        Persona recuperada = new Persona();
        recuperada = (Persona) entrada.readObject();
        System.out.println(recuperada.getNombre());
        entrada.close();
        
    }
}
