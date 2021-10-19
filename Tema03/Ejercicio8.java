/**
* Escribe un programa que calcule el salario semanal de un empleado en base a
  las horas trabajadas, a razón de 12 euros la hora.
*
* @author Alberto Parra 
*/
public class Ejercicio8 {
public static void main(String[] args) {
	System.out.println("Este programa calcula el salario en base al número de horas.");
	
	System.out.println("Número de horas trabajando a la semana.");
	int horas = Integer.parseInt(System.console().readLine() );
	
	int salarioHora;
	salarioHora = 12;
	
	double operacion = (horas * salarioHora);
	System.out.println("El salario de nuestro trabajador es " + operacion + " euros");
 }
}
