/**
* 	Escribe un programa que calcule el salario semanal de un
	trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
	trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
	la hora.
*
* @author Alberto Parra 
*/
public class Ejercicio4tema4 {
	public static void main(String[] args) {
		int salarioSemanal;

		System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
		int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    
    //Definimos cuando contamos que el salario es 12 o 16 
		if (horasTrabajadas <= 40) {
			salarioSemanal = 12 * horasTrabajadas;
		} else {
			salarioSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
		}
		System.out.println("El salario semanal es de  " + salarioSemanal + " euros");
 }
}
