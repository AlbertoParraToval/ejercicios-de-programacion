import funciones.funciones_Ex28;
import java.util.Scanner;

public class Ex22_28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DICE SI UN NÚMERO ESTÁ O NO DENTRO DE UN ARRAY");
    System.out.println("------------------------------------------------------------");
    System.out.println(" ");

    //se piden el tamaño del array, el valor máximo y el valor mínimo del intervalo
    System.out.println("Introduzca el tamaño del array: ");
    System.out.print("> ");
    int tamañoArray = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el menor número del intervalo de números que quiere: ");
    System.out.print("> ");
    int minimo = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el mayor número del intervalo de números que quiere: ");
    System.out.print("> ");
    int maximo = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    //se define el array
    int[] array = funciones.funciones_Ex28.generaArrayInt(tamañoArray, maximo, minimo); 

    //se muestra el array
    System.out.println("Array generado - Array de " + tamañoArray + " números cuyo menor número posible puede ser el " + minimo + " y el máximo el " + maximo + ":\n");

    funciones.funciones_Ex28.muestraArray(array, tamañoArray); 

    System.out.println("\n ");

    //se pide un número para buscarlo en el array
    System.out.println("Introduzca un número para buscarlo en el array: ");
    System.out.print("> ");
    long numeroAEncontrar = Long.parseLong(s.nextLine());
    System.out.println(" ");

    funciones.funciones_Ex28.estaEnArrayInt(array, numeroAEncontrar);
  }
}

