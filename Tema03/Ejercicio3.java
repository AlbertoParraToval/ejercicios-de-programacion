/**
* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
  convertir debe ser introducida por teclado.

*
* @author Alberto Parra 
*/
public class Ejercicio3 {
public static void main(String[] args) {
	
	System.out.print("Introduce el valor de pesetas que quieres conventir: ");
    int pesetas = Integer.parseInt(System.console().readLine() );;
    double Conversion = 166.38;
    
    double euros = (pesetas / Conversion);
    System.out.printf(" %d pesetas en euros son: %.2f €" ,pesetas ,euros);
 }
}
