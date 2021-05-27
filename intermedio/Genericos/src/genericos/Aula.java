package genericos;

/**
 *
 * @author freya
 */
public class Aula {
    private String idAula;
    private Profesor profesor;
    private Alumno [] alumno;

    public Aula(){
        
    }
    
    public Aula(String idAula, Profesor profesor, Alumno[] alumno) {
        this.idAula = idAula;
        this.profesor = profesor;
        this.alumno = alumno;
    }
    
    

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno[] alumno) {
        this.alumno = alumno;
    }
    
    public double getNotaMediaPorAula(){
        double sumaTotal = 0.0;
        for(int i = 0; i < this.getAlumno().length; i++){
            if(alumno[i] instanceof Delegado){
                Delegado d1 = (Delegado) alumno[i];
                sumaTotal += 0.1 * d1.getValoracion();
                sumaTotal += alumno[i].getNotaMedia();
            }
            else{
                sumaTotal += alumno[i].getNotaMedia();
            }
        }
        return sumaTotal / alumno.length;
    }
    
    public void imprimirListadoDeAulas(){
        System.out.println("------------------"+ this.getIdAula() +"-----------------------");
        
        for(int i = 0; i < alumno.length; i++){
            alumno[i].imprimirAlumno();
        }
        
       System.out.println("\n--------------------------------------------------------------");
    }
    
    public Alumno getMejorAlumno(){
      Alumno mejor = new Alumno();
      double mejorNota = 0.0;
      for(int i = 0; i < alumno.length; i++){
          if(alumno[i].getNotaMedia() > mejorNota){
              mejorNota  = alumno[i].getNotaMedia();
              mejor = alumno[i];
          }
      }
      return mejor;
    }
    
}
