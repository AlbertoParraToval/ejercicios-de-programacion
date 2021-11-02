/**
* Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.
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

