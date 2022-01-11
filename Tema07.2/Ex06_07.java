/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 * 
 * @author Alberto Parra Toval
 */
public class Ex06_07 {
  public static void main(String[] args) throws InterruptedException {
    int[][] n = new int[6][10];
    // declaramos las variables
    int filas, columnas, max, min;
    max = 0;
    min = 1000;

    System.out.print(
        "             Columna 1 Columna 2   Columna 3  Columna 4  Columna 5  Columna 6  Columna 7  Columna 8  Columna 9  Columna 10");

    System.out.println();
    for (columnas = 0; columnas < 10; columnas++) {
      System.out.print("------------");
    }
    System.out.println();
    // Numeros aleatorios que iran dentro de nuestro array
    for (filas = 0; filas < 6; filas++) {
      System.out.print("Fila: " + filas + " |");
      for (columnas = 0; columnas < 10; columnas++) {
        n[filas][columnas] = (int) (Math.random() * 1000);
        // Si el valor que sale supera al del valor max, se convierte en el maximo
        if (n[filas][columnas] >= max) {
          max = n[filas][columnas];
        }
        // Si el valor que sale es menor que el numero se convierte en el minimo
        if (n[filas][columnas] <= min) {
          min = n[filas][columnas];
        }
        // Mostramos el Array
        System.out.printf("%10d ", n[filas][columnas]);
      }
      System.out.println();
    }
    // Mostramos los valres minimos y maximos por pantalla
    System.out.println();
    System.out.print("El valor maximo es " + max);
    System.out.println();
    System.out.print("El valor minimo es " + min);
  }
}
