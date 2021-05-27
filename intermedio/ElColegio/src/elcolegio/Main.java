package elcolegio;

/**
 *
 * @author freya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] conjuntoDeAlumnos = GeneradorDeAlumnos.generarAlumnos(20);
        
        Profesor p1 = new Profesor("juan", "Ortiz", 001110, "Matematicas");
        
        Aula a1 = new Aula ("Aula 101", p1, conjuntoDeAlumnos);
        a1.imprimirListadoDeAulas();
        
        Profesor p2 = new Profesor("Jhon", "Smith", 001220, "Ingles");
        Aula a2 = new Aula ("Aula 102", p2 ,GeneradorDeAlumnos.generarAlumnos(20));
        a2.imprimirListadoDeAulas();
        
        Profesor p3 = new Profesor("Nubia", "Holibo", 023220, "Fisica");
        Aula a3 = new Aula ("Aula 103", p3 ,GeneradorDeAlumnos.generarAlumnos(20));
        a3.imprimirListadoDeAulas();
        
        Aula[] almacenarAulas = new Aula [3];
        almacenarAulas [0] = a1;
        almacenarAulas [1] = a2;
        almacenarAulas [2] = a3;
        
        Director d1 = new Director("Don", "Delinguer", 121212, 9.0);
        
        Colegio c1 = new Colegio(d1,"Colegio Jimenez",almacenarAulas);
        
        c1.imprimirEstadisticas();
        
        /*
        Alumno a1 = new Alumno("Genaro", "Gonzalez", 25, "Programacion", 9.4);
        Alumno [] almacenamientoDeLosAlumnos = new Alumno[1];
        almacenamientoDeLosAlumnos[0] = a1;
        
        Profesor profesor2 = new Profesor("Dante", "Sparta", 35.333,"Programacion");
        
        Aula aula = new Aula("43", profesor2, almacenamientoDeLosAlumnos);
        
        aula.imprimirListadoDeAulas();
        */
    }
}
