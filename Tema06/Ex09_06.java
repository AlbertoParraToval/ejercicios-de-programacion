/** Realiza un programa que vaya generando números aleatorios pares entre 0
    y 100 y que no termine de generar números hasta que no saque el 24. El
    programa deberá decir al final cuántos números se han generado.
 *
 * @author Alberto Parra Toval
 */
public class Ex09_06 {
    public static void main(String[] args) {
      System.out.println("[Programa que genera numeros entre 0 y 100 hasta llegar a 24]");
      int num;
      int veces = 0;
      do {
        num = (int)(Math.random()*51) * 2;
        System.out.print(num  + " ");
        veces++;
      } while (num != 24);
     System.out.println("\nLa cantidad de numeros que ha mostrado hasta llegar al 24 es de " + veces + " veces.");
    }
}
