/**
 *  Escribe un programa que pida un número entero positivo por teclado y que mues
 * -tre a continuación los 5 números consecutivos a partir del número introducido
 * Al lado de cada número se debe indicar si se trata de un primo o no.
.

 * @author Alberto Parra Toval
 */
public class Ex57_05 {
  public static void main(String[] args) {
    System.out.println("El programa calcula el factorial de un número entero leído por teclado.");
    System.out.print("Por favor, introduzca un número entero positivo :");
    int numero = Integer.parseInt(System.console().readLine()) ;
    int esPrimo = 0;
    int contador = 0;
    boolean NoesPrimo;
    while (contador < 5){ //numero de veces que se repite
      NoesPrimo=false;
      for (int i=2; i < numero; i++){
          if (numero % i == 0){ //Si es divisible entre si mismo y es igual a 0 = NOesPrimo es cierto
            NoesPrimo = true;
          }
      }
      if(NoesPrimo){ //Si no es primo que muestre ese numero con el no primo
        System.out.println(numero +" no es primo");
      }else{
        System.out.println(numero +" es primo"); // Sino pues que ponga es primo
      }
      numero++; //Para añadir numeros consecutivos
      contador++; // Para salir del bucle
    }
  }
}
