import funciones.funciones_EX14;
import java.util.Scanner;
/**
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author Alberto Parra Toval
 */
public class Ex18_28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CONVERSOR DECIMAL->BINARIO");
    System.out.println("---------------------------");
    System.out.println(" ");

    //pedimos el n�mero decimal por pantalla
    System.out.println("Introduzca un n�mero decimal: ");
    System.out.print("> ");
    long numeroDe = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.print(numeroDe + " en decimal es igual a ");

    //definimos primero al n�mero binario como String para a�adir al mismo cero y unos sin inconvenientes
    String numeroBi = "";

    //en cada iteraci�n del bucle numeroDe (el n�mero decimal introducido), ir� reduciendose a la mitad sucesivamente.
    //el bucle continuar� hasta que numeroDe llegue a 0. El resto de la divisi�n de numeroDe entre 2 ser� el valor 
    //a�adido a la variable numeroBi. Se le a�ade por delante ya que el primer d�gito del n�mero binario corresponde 
    //a la �ltima divisi�n que se realice en el bucle, el segundo d�gito con la pen�ltima divisi�n...
    while (numeroDe > 0) {
      String digito = String.valueOf(numeroDe % 2);

      numeroBi = digito + numeroBi;

      numeroDe /= 2;
    }

    //mostramos los resultados
    System.out.println(Long.valueOf(numeroBi));
  }
}

