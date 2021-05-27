package genericos;

import java.util.ArrayList;

public class Genericos {

    public static void main(String[] args) {
        ArrayList <Colegio> coles = new ArrayList<Colegio>();
        
        OperacionesIMB op = new OperacionesIMB();
        Colegio c1 = new Colegio();
        c1.setNomnbre("Mi colegio");
        op.insertarElemento(coles, c1);
        op.imprimirElemento(coles);
        
        ArrayList <Alumno> alumnos = new ArrayList<Alumno>();
        OperacionesIMB ops = new OperacionesIMB();
        
        Alumno a1 = new Alumno();
        a1.setCurso("Primero de Matematicas");
        
        Alumno a2 = new Alumno();
        a2.setCurso("Tercero de matematicas");
        
        ops.insertarElemento(alumnos, a1);
        ops.insertarElemento(alumnos, a2);
        ops.imprimirElemento(alumnos);
        
    }
    
}
