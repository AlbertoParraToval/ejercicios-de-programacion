/**
 * Bucle for
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio_For {
  public static void main(String[] args) {
    int i =27;
    //El bucle llega hasta el 10 debido a que la condición es i < 11
    //Si le añadimos de 3 en 3 es igual que de uno en uno se sale del bucle al ser superior a 11
    for (i = 1; i < 11; i = i + 3) {    //Se podría poner también i += 3.   
                                        //Si cambiamos el signo nos saldríamos fuera del bucle ya que la int i = 27
                                        //Si ponemos true nuestro bucle es infinito, nos peta el programa.
      System.out.println("Voy a mostrar la i");
      System.out.println(i); 
      System.out.println("He mostrado la i");
    }
    //Se ejecuta una vez fuera de la condición impuesta por el bucle
    System.out.println("Estoy fuera del bucle");
    System.out.println(i); 
    System.out.println("Fin");
  }
}
