/**
 *  Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
    un bucle do-while.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio6Tema5 {
    public static void main(String[] args) {
      int n = 320;
      do { 
        n -= 20;
        System.out.println("n: " + n);
        System.out.println("--------");
      } while (n > 159);
      //Se ejecuta una vez fuera de la condición impuesta por el bucle
      System.out.println("Fin");
    }
  }