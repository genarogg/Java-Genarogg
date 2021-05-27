/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruccturasdecontrol;

/**
 *
 * @author freya
 */
public class EstructuraSwitch {
    public static void main(String[] args) {
        int dia = 5;
        
        switch(dia){
            case 1:{
                System.out.println("Dia de la semana: Lunes");
                break;
            }
            case 2:{
                System.out.println("Dia de la semana: Martes");
                break;
            }
            case 3:{
                System.out.println("Dia de la semana: Miercoles");
                break;
            }case 4:{
                System.out.println("Dia de la semana: Jueves");
                break;
            }case 5:{
                System.out.println("Dia de la semana: Viernes");
                break;
            }
            case 6:{
                System.out.println("Dia de la semana: Sabado");
                break;
            }
            case 7:{
                System.out.println("Dia de la semana: Domingo");
                break;
            }
            default:{
                System.out.println("No es un dia de la semana");
            }
            
            
        }
    }
            
    
}
