import funciones.funciones_Ex28;
import java.util.Scanner;
/**
 * 
 * Programa que dice la posicion de un numero dentro de un array
 * 
 * 
 * @author Alberto Parra Toval
 */

public class Ex25_28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DICE LA POSICI�N DE UN N�MERO DENTRO DE UN ARRAY");
    System.out.println("--------------------------------------------------------------");
    System.out.println(" ");

    //se piden el tama�o del array, el valor m�ximo y el valor m�nimo del intervalo
    System.out.println("Introduzca el tama�o del array: ");
    System.out.print("> ");
    int tamanoArray = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el menor n�mero del intervalo de n�meros que quiere: ");
    System.out.print("> ");
    int minimo = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el mayor n�mero del intervalo de n�meros que quiere: ");
    System.out.print("> ");
    int maximo = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    //se define el array
    int[] array = funciones.funciones_Ex28.generaArrayInt(tamanoArray, maximo, minimo); 

    //se muestra el array
    System.out.println("Array generado - Array de " + tamanoArray + " n�meros cuyo menor n�mero posible puede ser el " + minimo + " y el m�ximo el " + maximo + ":\n");

    funciones.funciones_Ex28.muestraArray(array, tamanoArray); 

    System.out.println("\n ");

    //se pide un n�mero para buscarlo en el array
    System.out.println("Introduzca un n�mero para saber su posici�n en el array: ");
    System.out.print("> ");
    long numeroAEncontrar = Long.parseLong(s.nextLine());
    System.out.println(" ");

    funciones.funciones_Ex28.posicionEnArray(array, numeroAEncontrar);
  }
}

