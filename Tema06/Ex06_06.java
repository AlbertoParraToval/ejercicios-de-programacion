/** Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secretos
 *
 * @author Alberto Parra Toval
 */
public class  Ex06_06 {
    public static void main(String[] args) {
      //Definimos las variables
      int oportunidades = 5;
      int numeroIntroducido;
      boolean acertado = false;
      int numeroMisterioso = (int)(Math.random() * 101);
      
      System.out.println("Estoy pensando un numero del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");
      
      do {
        System.out.print("Introduce un numero: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
        oportunidades--;
        // Si es menor
        if ( (numeroIntroducido > numeroMisterioso) && (oportunidades > 0) ){
          System.out.println("El numero que estoy pensando es menor que " + numeroIntroducido);
          System.out.println("Te quedan " + oportunidades + " oportunidades.");
        }
        // Si es mayor
        if ( (numeroIntroducido < numeroMisterioso) && (oportunidades > 0) ){
          System.out.println("El numero que estoy pensando es mayor que " + numeroIntroducido);
          System.out.println("Te quedan " + oportunidades + " oportunidades.");
        }
        // Si has acertado
        if (numeroIntroducido == numeroMisterioso) {
          acertado = true;
          System.out.println("¡Enhorabuena! ¡has acertado!");
        }
      } while (!acertado && (oportunidades > 0)); // Mientras no acierte el numero y oportunidades sea mayor a 0
      // Si no has acertado y te has quedado sin intentos
      if (!acertado) {
        System.out.println("Lo siento, no has acertado, el numero que estaba pensando era el " + numeroMisterioso);
      }
    }
  }

