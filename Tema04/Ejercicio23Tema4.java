/**
* 	Escribe un programa que calcule el precio final de un producto según su
  base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
  reducido o superreducido) y el código promocional. Los tipos de IVA general,
  reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
  promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
  respectivamente que no se aplica promoción, el precio se reduce a la mitad,
  se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
  muestran los valores correctos, aunque los números no estén tabulados.

* @author Alberto Parra 
*/

		
public class Ejercicio23Tema4 {
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
 
