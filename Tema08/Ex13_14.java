import funciones.funciones_EX14;
/**
 * Formar un numero pidiendo el numero base, la poscion inicial y la final
 * @author Alberto Parra Toval
 */

public class Ex13_14 {
  public static void main(String[] args) {
    System.out.println("Programa que forma numero con la base la parte final y la inicial");
    //Pedimos al usuario que nos deiga un numero y un digito
    System.out.print("Introduce un numero por teclado: ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println("");

    System.out.print("Introduce el primer trozo por teclado: ");
    int  posicionInicial = Integer.parseInt(System.console().readLine());
    System.out.println("");

    System.out.print("Introduce el ultimo trozo del numero: ");
    int posicionFinal = Integer.parseInt(System.console().readLine());
    System.out.println("");

    System.out.print("El trozo del numero introducido que va desde la posicion " + posicionInicial + " a la posicion " + posicionFinal + " es " + funciones.funciones_EX14.trozoDeNumero(numero, posicionInicial, posicionFinal));
  }
}




