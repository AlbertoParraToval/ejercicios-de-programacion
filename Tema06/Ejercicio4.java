/** Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra 20 numeros aleatorios de o a 10 ");
        
        for (int i = 0; i <= 20; i++) {
          System.out.print(((int)(Math.random()*10)) + " ");
          }
      System.out.println( );

      
    }
}