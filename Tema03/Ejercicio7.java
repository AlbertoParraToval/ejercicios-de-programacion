/**
* Escribe un programa que calcule el total de una factura a partir de la base
  imponible.
*
*
* @author Alberto Parra 
*/
public class Ejercicio7 {
public static void main(String[] args) {
	//Preguntamos que el usuario imponga la baseImponible
	System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
    double baseImponible = Double.parseDouble(System.console().readLine());
	
	//Ejecutamos dicha base imponible con el Iva incluido
    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
 }
}
