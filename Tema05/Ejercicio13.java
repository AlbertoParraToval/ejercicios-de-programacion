import javax.sound.midi.SysexMessage;

/**
 *  Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio13 {
    public static void main(String[] args) {
      System.out.println("Programa que lee diez numeros y determine los negativos/positivos");
      System.out.println("Introduce diez números: ");
      int negativos = 0;
      int positivos = 0;

      for (int numeroMax = 0; numeroMax < 10; numeroMax++) {
        if ( Integer.parseInt(System.console().readLine()) > 0) {
          positivos++;
        } else {
          negativos++;
        }
      }
      System.out.println("Los numeros positivos son " + positivos + " y los números negativos son " + negativos);
  }
}