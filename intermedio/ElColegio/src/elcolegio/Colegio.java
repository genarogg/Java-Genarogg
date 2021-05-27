package elcolegio;

/**
 *
 * @author freya
 */
public class Colegio {
    private Director director;
    private String nomnbre;
    private Aula [] aula;

    public Colegio(){
        
    }
    
    public Colegio(Director director, String nomnbre, Aula[] aula) {
        this.director = director;
        this.nomnbre = nomnbre;
        this.aula = aula;
    }

    public Aula[] getAula() {
        return aula;
    }

    public void setAula(Aula[] aula) {
        this.aula = aula;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }
    
    public double getNotaMedia(){
        double sumaTotal = 0.0;
        for(int i = 0; i < aula.length; i++){
            sumaTotal += aula[i].getNotaMediaPorAula();
        }
        return (sumaTotal / aula.length) + (this.getDirector().getValoracion() * 0.3);
        
    }
    
    public Alumno getMejorNotaDelColegio(){
        Alumno mejor = new Alumno();
        double mejorNota = 0.0;
        
        for(int i = 0; i < aula.length; i++){
            
            if(aula[i].getMejorAlumno().getNotaMedia() > mejorNota){
                mejor = aula[i].getMejorAlumno();
                mejorNota = mejor.getNotaMedia();
            }
        }
        return mejor;
    }
    
    public void imprimirEstadisticas(){
        System.out.println("Resumen de las estadisticas del colegio " + this.getNomnbre()); 
        System.out.println("El mejor alumno del coloegio es: ");
        
        if(this.getNotaMedia()>5.0){
           System.out.print("El Colegio esta listo para recibir la subencion con una nota media total de "+this.getNotaMedia());                 
      }
      else{
          System.out.print("lo sentimos mucho pero no podra recibir la subencion con una nota media total de "+this.getNotaMedia());      
      }
    }
}
