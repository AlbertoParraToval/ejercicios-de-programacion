/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
   asignatura toca a primera hora ese día.
 *
 * @author Alberto Parra
 */
public class Ejercicio1Tema4 {
  public static void main(String[] args) {   
    
    System.out.print("Por favor, introduzca un numero de la semana: ");
	int dia = Integer.parseInt(System.console().readLine());
	String nombreDelDia;
	
	switch (dia) {
		case 1:
		nombreDelDia = "Lunes";		
		break;
		
		case 2:
		nombreDelDia = "Martes";		
		break;
		
		case 3:
		nombreDelDia = "Miércoles";		
		break;
		
		case 4:
		nombreDelDia = "Jueves";		
		break;
		
		case 5:
		nombreDelDia = "Viernes";		
		break;
		
		case 6:
		nombreDelDia = "Sábado";		
		break;
		
		case 7:
		nombreDelDia = "Domingo";		
		break;
		
		default :
		nombreDelDia = "No existe ese día";		
		break;		
		}
    
    System.out.println("Día " + dia + ": " + nombreDelDia);    
  }
}
