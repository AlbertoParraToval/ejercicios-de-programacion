/**
 *  Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
    un bucle while.
 *
 * @author Alberto Parra Toval
 */
public class Ex05_05 {
    public static void main(String[] args) {
      int n = 320;
      // definimos el comienzo con la variable n, y ponemos la condicion de que si n es menor que 160 pare, va descontando de 20 en 20 
      while ( n > 159) {    
      n -= 20;
      System.out.println("n: " + n);
      System.out.println("--------");
      }
      //Se ejecuta una vez fuera de la condición impuesta por el bucle
      System.out.println("Fin");
  }
}