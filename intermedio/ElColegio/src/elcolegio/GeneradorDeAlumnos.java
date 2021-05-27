/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elcolegio;

import java.util.Random;

/**
 *
 * @author freya
 */
public class GeneradorDeAlumnos {
    public static Alumno[] generarAlumnos(int n){
        String[] lnombres={"Jose","Juan","Jacinto","Jaime","Javier","Ana","Rebeca","Diana","Antonia"};
        String[] lapellido={"Diaz","Garcia","Smith","Valefor","Whasintong","Cubero","Can","Floid","Garfun"};
        String[] lcursos={"Primero","Segundo","Tercero","Cuarto"};
        Alumno[] conjuntoalumnos = new Alumno[n];

            for(int i=0;i<n;i++){
               Random r = new Random();
               int inombre =r.nextInt(lnombres.length);
               int iapellido =r.nextInt(lapellido.length);
               
               double dni=Double.parseDouble(Integer.toString((int)(Math.random()*1000000)));
               double notamedia=r.nextDouble()*10;
               int icurso=r.nextInt(4);
               
               Alumno nuevoalumno=new Alumno(lnombres[inombre], lapellido[iapellido], dni, lcursos[icurso], notamedia);
               if(i==0){
                   Delegado d1=new Delegado(lnombres[inombre], lapellido[iapellido], dni, lcursos[icurso],5.0);
                   conjuntoalumnos[i]=d1;
               }else{
                  conjuntoalumnos[i]=nuevoalumno; 
               }
               
            }
            return conjuntoalumnos;
    }
        
}
