/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * 
 * @author Alberto Parra Toval
 */
public class Ex01_07 {
  public static void main(String[] args) {
    int[][] n = new int[3][6]; // array de 3 filas por 6 columnas
    n[0][0] = 0;
    n[1][0] = 75;
    n[0][1] = 30;
    n[0][2] = 2;
    n[2][2] = -2;
    n[2][3] = 9;
    n[1][4] = 0;
    n[0][5] = 5;
    n[2][5] = 11;
    int fila, columna; //Declaro mis variables
    System.out.println("       Columna 1  Columna 2  Columna 3  Columna 4  Columna 5  Columna 6");
    System.out.println("------------------------------------------------------------------------");
    for (fila = 0; fila < 3; fila++) { //Maximo de filas
      System.out.print("Fila " + fila + ":");
      for (columna = 0; columna < 6; columna++) { //Maximo de columnas
        System.out.printf(" %7d | ", n[fila][columna]);
      }
      System.out.println();
    }
  }
}