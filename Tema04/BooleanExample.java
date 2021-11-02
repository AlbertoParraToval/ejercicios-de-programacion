import javax.sound.sampled.SourceDataLine;

/*Ejemplo de Boolean 
*/
public class BooleanExample {
  public static void main(String[] args) {
    //No admite numeros las opciones son true o false. 
    boolean repiteAsignatura;
    repiteAsignatura = true;
    //Lo representamos en pantalla mediante un System.out.pritnln();
    System.out.println(repiteAsignatura);
        
    if (repiteAsignatura){
        System.out.println("Tienes que hacer ejercicios de recuperación.");
    } else {
        System.out.println("No tienes que hacer ejercicios de recuperación.");
    }





  }
}



