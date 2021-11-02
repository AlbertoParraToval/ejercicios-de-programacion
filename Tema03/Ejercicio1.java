/**
* 	Realiza un programa que pida dos números y que luego muestre el resultado
	de su multiplicación.
*
* @author Alberto Parra 
*/
public class Ejercicio1 {
public static void main(String[] args) {
	String linea;
	System.out.print("Por favor, introduce un número: ");
	linea = System.console().readLine();
	int primerNumero;
	primerNumero = Integer.parseInt( linea );

	System.out.print("introduce otro, por favor: ");
	linea = System.console().readLine();
	int segundoNumero;
	segundoNumero = Integer.parseInt( linea );

	int multiplicacion;
	multiplicacion = (segundoNumero * primerNumero);
	
	System.out.print("La multiplicación de estos dos números es " + multiplicacion);
  }
}

