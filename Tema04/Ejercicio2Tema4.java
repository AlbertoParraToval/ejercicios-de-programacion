/**
 * 	Realiza un programa que pida una hora por teclado y que muestre luego buenos
	días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
	6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
	horas, los minutos no se deben introducir por teclado.
 *
 * @author Alberto Parra
 */
public class Ejercicio2Tema4 {
  public static void main(String[] args) {   
    System.out.print("Por favor, introduzca la hora que desee: ");
	int hora = Integer.parseInt(System.console().readLine());
	String tramoDeHora;
	//Utilizamos el if para concretar los tramos de hora con <> y &&
	if ((hora > 6) && (hora < 12)) {
      System.out.println("Buenos días");
    } else if ((hora > 13) && (hora < 20)) {
      System.out.println("Buenas tardes");
    } else if ((hora > 5) && (hora > 21)) {
	  System.out.println("Buenas noches");
	}	
  }
}
