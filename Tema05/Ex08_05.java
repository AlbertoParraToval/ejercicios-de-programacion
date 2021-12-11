/**
 *  Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Alberto Parra Toval
 */
public class Ex08_05 {
    public static void main(String[] args) {
      System.out.println("Ejercicios de Tablas");
      // Introducimos el numero que queramos
      System.out.println("Introduce el numero que desees: ");
      int num = Integer.parseInt(System.console().readLine());
      System.out.println("[La tabla del " + num + "]");
      System.out.println("---------");
      // Definimos que se repita dicha multiplicacion hasta 10 veces definiendo mult < 11
      for (int mult = 1; mult < 11 ; mult++){    
        //Mostramos los resultados por pantalla
      System.out.println(num + "x" + mult + " = " + num * mult);
      System.out.println("---------");
      }
  }
}