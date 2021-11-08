/**
 *  Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio8Tema5 {
    public static void main(String[] args) {
      
      System.out.println("Introduce el número que desees: ");
      int num = Integer.parseInt(System.console().readLine());
      System.out.println("[La tabla del " + num + "]");
      System.out.println("--------");
      //Aplicamos el for   
      for (int mult = 1; mult < 11 ; mult++){    
      System.out.println(num + "x" + mult + " = " + num * mult);
      System.out.println("--------");
      }
  }
}