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

    //pedimos el número decimal por pantalla
    System.out.println("Introduzca un número decimal: ");
    System.out.print("> ");
    long numeroDe = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.print(numeroDe + " en decimal es igual a ");

    //definimos primero al número binario como String para añadir al mismo cero y unos sin inconvenientes
    String numeroBi = "";

    
    while (numeroDe > 0) {
      String digito = String.valueOf(numeroDe % 2);

      numeroBi = digito + numeroBi;

      numeroDe /= 2;
    }

    //mostramos los resultados
    System.out.println(Long.valueOf(numeroBi));
  }
}

