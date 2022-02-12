import funciones.funciones_EX14;
import java.util.Scanner;
public class Ex17_28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CONVERSOR BINARIO->DECIMAL");
    System.out.println("---------------------------");
    System.out.println(" ");

    //pedimos el n�mero binario por pantalla
    System.out.println("Introduzca un n�mero binario: ");
    System.out.print("> ");
    long numeroBi = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.print(numeroBi + " en binario es igual a ");

    long numeroDe = 0; //inicializamos la variable numeroDe donde guardaremos el resultado
    int posicion = 0; //variable que utilizaremos para indicar la psici�n del d�gito binario (empezando por la derecha) y para usarla de exponente

    //creamos un bucle while en el que numeroBi ser� dividido entre 10 en cada iteraci�n hasta llegar a 0. El resto de cada divisi�n corresponde a un d�gito
    //binario, empezando por la derecha. La variable posicion indica la posici�n de ese n�mero de derecha a izquierda (aumenta en 1 en cada iteraci�n). 
    //Una vez obtenido el d�gito se multiplica por dos elevado a posicion y se le suma a lo que ya hay en numeroDe. Si digitoBi es 0 no se le sumar� nada
    //a numeroDe, por contra, si es 1, se le sumar� la potencia de 2 correspondiente a la posici�n.
    while (numeroBi > 0) {
      long digitoBi = numeroBi % 10;
      numeroDe = numeroDe + funciones.funciones_EX14.potencia(2, posicion) * digitoBi;

      posicion++;
      numeroBi /= 10;
    } //while (numeroBi > 0)

    System.out.println(numeroDe + " en decimal"); //mostramos los resultados
  }
}
