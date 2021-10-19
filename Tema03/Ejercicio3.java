/**
* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
  convertir debe ser introducida por teclado.

*
* @author Alberto Parra 
*/
public class Ejercicio3 {
public static void main(String[] args) {
	
	System.out.print("Introduce el valor de pesetas que quieres conventir: ");
	//Definimos el valor de la peseta
    int pesetas = Integer.parseInt(System.console().readLine() );;
    double Conversion = 166.38;
    
    //Multiplicamos dicho valor por la cantidad de euros que introduzcamos
    double euros = (pesetas / Conversion);
    System.out.printf(" %d pesetas en euros son: %.2f €" ,pesetas ,euros);
 }
}
