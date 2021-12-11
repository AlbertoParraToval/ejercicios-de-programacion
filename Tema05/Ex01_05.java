/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 *
 * @author Alberto Parra Toval
 */
public class Ex01_05 {
    public static void main(String[] args) {
      // El buble se repetirá hasta que supere 100 y los numeros iran contando de 5 en 5
      for (int n = 0; n < 101; n += 5 ) {    
      System.out.println("n: " + n);
      System.out.println("--------");
      }
      //Se ejecuta una vez fuera de la condición impuesta por el bucle
      System.out.println("Fin");
    }
}
