import funciones.funciones_Ex28;
import java.util.Scanner;

public class Ex22_28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DICE SI UN N�MERO EST� O NO DENTRO DE UN ARRAY");
    System.out.println("------------------------------------------------------------");
    System.out.println(" ");

    //se piden el tama�o del array, el valor m�ximo y el valor m�nimo del intervalo
    System.out.println("Introduzca el tama�o del array: ");
    System.out.print("> ");
    int tama�oArray = Integer.parseInt(s.nextLine());
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
    int[] array = funciones.funciones_Ex28.generaArrayInt(tama�oArray, maximo, minimo); 

    //se muestra el array
    System.out.println("Array generado - Array de " + tama�oArray + " n�meros cuyo menor n�mero posible puede ser el " + minimo + " y el m�ximo el " + maximo + ":\n");

    funciones.funciones_Ex28.muestraArray(array, tama�oArray); 

    System.out.println("\n ");

    //se pide un n�mero para buscarlo en el array
    System.out.println("Introduzca un n�mero para buscarlo en el array: ");
    System.out.print("> ");
    long numeroAEncontrar = Long.parseLong(s.nextLine());
    System.out.println(" ");

    funciones.funciones_Ex28.estaEnArrayInt(array, numeroAEncontrar);
  }
}

