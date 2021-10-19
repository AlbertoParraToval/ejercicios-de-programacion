/**
* Escribe un programa que calcule el total de una factura a partir de la base
  imponible.
*
* @author Alberto Parra 
*/
public class Ejercicio7 {
public static void main(String[] args) {
	System.out.println("Este programa calcula la factura total");
	
	System.out.println("Introduce el primer pedido");
	int pedido1 = Integer.parseInt(System.console().readLine() );
	
	System.out.println("Introduce el segundo pedido");
	int pedido2 = Integer.parseInt(System.console().readLine() );
	
	System.out.println("Introduce el tercero pedido");
	int pedido3 = Integer.parseInt(System.console().readLine() );
	
	System.out.println("Introduce el cuarto pedido");
	int pedido4 = Integer.parseInt(System.console().readLine() );
	
	double pedidoTotal = (pedido1 + pedido2 + pedido3 + pedido4);
	System.out.println("La factura total será de " + pedidoTotal + "euros.");
 }
}
