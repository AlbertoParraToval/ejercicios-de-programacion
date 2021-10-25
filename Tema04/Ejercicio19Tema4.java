/**
* 	Realiza un programa que nos diga cuántos dígitos tiene un número entero que
	puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
* @author Alberto Parra 
*/
public class Ejercicio19Tema4 {
	public static void main(String[] args) {
		
		System.out.print("Introduce el número cuya primera cifra quiera saber:\n ");
		int numero = Integer.parseInt(System.console().readLine());
		
		//Si es mayor de 5 no se cuenta
		if (numero > 99999) {
			System.out.printf("No se pueden los números de más de 5 cifras.");
			}
		//Si el numero tiene 5 cifras
		if ((numero <= 99999) && (numero >= 10000) || (numero >= -99999) && (numero <= -10000) ) {
			System.out.printf("La primera cifra es " + (numero / 10000));
			}
			//Si el numero tiene 4 cifras
		if ((numero <= 9999) && (numero >= 1000) || (numero >= -9999) && (numero <= -1000)) {
			System.out.printf("La primera cifra es " + (numero / 1000));
			}
			//Si el numero tiene 3 cifras
		if ((numero <= 999) && (numero >= 100) || (numero >= -999) && (numero <= -100)) {
			System.out.printf("La primera cifra es " + (numero / 100));
			}
			//Si el numero tiene 2 cifras
		if ((numero <= 99) && (numero >= 10) || (numero >= -99 && (numero <= -10))) {
			System.out.printf("La primera cifra es " + (numero / 10));
			}
			//Si el numero tiene 1 cifra
		if ((numero <= 9) && (numero >= 0) || (numero >= -9) && (numero <= 0)) {
			System.out.printf("La primera cifra es " + numero);
			}
  }
}
