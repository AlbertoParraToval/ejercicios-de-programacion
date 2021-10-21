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
	String numeroDelDia;
	
	switch (dia) {
		case 1:
		numeroDelDia = "Programación";		
		break;
		
		case 2:
		numeroDelDia = "Programación";		
		break;
		
		case 3:
		numeroDelDia = "Sistemas Informáticos";		
		break;
		
		case 4:
		numeroDelDia = "Programación";		
		break;
		
		case 5:
		numeroDelDia = "Sistemas Informáticos";		
		break;
		
		case 6:
		numeroDelDia = "Nada";		
		break;
		
		case 7:
		numeroDelDia = "Nada";		
		break;
		
		default :
		numeroDelDia = "No existe ese día";		
		break;		
		}
    
    System.out.println("Día " + dia + ": " + numeroDelDia);    
  }
}
