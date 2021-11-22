/** Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secretos
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio6 {
    public static void main(String[] args) {
      System.out.println("Programa que intenta adivinar el password del usuario.");
      int numIntentos = 1;
      System.out.println("Introduce el numero que creas: ");
      int passwordIntro = Integer.parseInt(System.console().readLine());
      int password = 0;
      int i;
      for (i = password; i < 1; i++) {
        System.out.print(((int)(Math.random()*100)) + " ");
      }


      while (numIntentos < 5) {
        if (password != passwordIntro) {
          System.out.println("El numero introducido es incorrecto");
          if (passwordIntro < i) {
          System.out.println("El numero introducido es menor al correcto");
          } 
          if (passwordIntro > i) {
          System.out.println("El numero introducido es mayor al correcto");
          }
          passwordIntro = Integer.parseInt(System.console().readLine());
          numIntentos++;
        } else {
        System.out.println("El numero introducido es el correcto");
          break;
        }
      }
      
      
      System.out.println("Ups te quedaste sin intentos");
    }
}

