import funciones.funciones_EX14;
import java.util.Scanner;
/**
 * 
 * Convertidor de binario a decimal de
 * 
 * @author Alberto Parra Toval
 */
public class Ex17_28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CONVERSOR BINARIO->DECIMAL");
    System.out.println("---------------------------");
    System.out.println(" ");

    //pedimos el número binario por pantalla
    System.out.println("Introduzca un número binario: ");
    System.out.print("> ");
    long numeroBi = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.print(numeroBi + " en binario es igual a ");

    long numeroDe = 0; //inicializamos la variable numeroDe donde guardaremos el resultado
    int posicion = 0; //variable que utilizaremos para indicar la psición del dígito binario (empezando por la derecha) y para 
    while (numeroBi > 0) {
      long digitoBi = numeroBi % 10;
      numeroDe = numeroDe + funciones.funciones_EX14.potencia(2, posicion) * digitoBi;

      posicion++;
      numeroBi /= 10;
    } //while (numeroBi > 0)

    System.out.println(numeroDe + " en decimal"); //mostramos los resultados
  }
}
