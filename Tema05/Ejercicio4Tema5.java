/**
 *  Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
    un bucle for.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio4Tema5 {
    public static void main(String[] args) {
      for (int n = 320; n > 159; n -= 20 ) {    
      System.out.println("n: " + n);
      System.out.println("--------");
      }
      //Se ejecuta una vez fuera de la condición impuesta por el bucle
      System.out.println("Fin");
    }
  }