/**
* 	Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
  hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
  Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
   hecho que el usuario introducirá un día y hora correctos, anterior al viernes
  a las 15:00h.
* @author Alberto Parra 
*/
public class Ejercicio22Tema4 {
	public static void main(String[] args) {
    System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    String dia = System.console().readLine();

    int diaNumerico = 0;

    switch(dia) {
      case "lunes":
        diaNumerico = 0;
        break;
      case "martes":
        diaNumerico = 1;
        break;
      case "miercoles":
        diaNumerico = 2;
        break;
      case "jueves":
        diaNumerico = 3;
        break;
      case "viernes":
        diaNumerico = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación introduzca la hora (hora y minutos)");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60); //Calculamos los minutos y le sumamos las horas hasta las 15:00
    int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos; //Nuestro dia elegido 
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana."); //Nuestro dia objetivo menos el elegido
  }
}

		

 
