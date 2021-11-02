/**
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
	otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
	por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    char letra1 = 'V';
	char letra2 = 'e';
	char letra3 = 'r';
	char letra4 = 's';
	char letra5 = 'o';
	
	String palabra = "" + letra1 + letra2 + letra3 + letra4 + letra5;
	
	System.out.println(palabra); 
  }
}
