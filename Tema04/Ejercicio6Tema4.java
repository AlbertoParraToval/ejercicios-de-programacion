/**
* 	Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =
√2h
g
siendo g = 9.81m/s
2
*
* @author Alberto Parra 
*/
public class Ejercicio6Tema4 {
	public static void main(String[] args) {
		System.out.print("Introduce la altura (metros): ");
		Double h = Double.parseDouble(System.console().readLine());

		final double g = 9.81; // las constantes se declaran con final
		double s = Math.sqrt(2*h/g);

		System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
 }
}
