/**
* 	Realiza un programa que diga si un número entero positivo introducido por
	teclado es capicúa. Se permiten números de hasta 5 cifras.
* @author Alberto Parra 
*/

		
public class Ejercicio20Tema4 {
  public static void main (String[] args) {
     String line;
      System.out.print(" Escribe un número entero positivo: ");
      line = System.console().readLine();
      int num, inv = 0, cifra;
      int aux = 0;
      num = Integer.parseInt(line);
      //invertir número
      num = aux;
      cifra = aux % 10; 
      inv = inv * 10 + cifra;
      aux = aux / 10;
      if(num == inv){
            System.out.println(" El número es capicua");
      }else {
		System.out.println(" El número no es capicua");
    }
  }
}
 



		
