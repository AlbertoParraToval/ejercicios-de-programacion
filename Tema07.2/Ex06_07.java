/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 * 
 * @author Alberto Parra Toval
 */
public class Ex06_07 {
  public static void main(String[] args) throws InterruptedException {
    int[][] num = new int[6][10]; // array de 6 filas por 10 columnas (6x10)
    int fila;
    int columna;

    int valorMax = Integer.MAX_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    int valorMin = Integer.MIN_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    System.out.print("\n      ");
    for (columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();

    System.out.print("    ");
    for (columna = 0; columna < 9; columna++) {
      System.out.print("-------");
    }
    System.out.println("");
    
    for (fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " |");
      for (columna = 0; columna < 10; columna++) {
        
        num[fila][columna] = (int) (Math.random() * 1000);
        System.out.printf("%5d ", num[fila][columna]);
        Thread.sleep(100);

        // Calcula el mínimo y guarda sus coordenadas
        if (num[fila][columna] < valorMin) {
          valorMin = num[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }

        // Calcula el máximo y guarda sus coordenadas
        if (num[fila][columna] > valorMax) {
          valorMax = num[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
      System.out.println("|");
    }
    System.out.print("    ");
    for (columna = 0; columna < 9; columna++) {
      System.out.print("-------");
    }

    System.out
        .println("\n\nEl maximo es " + valorMax + " y esta en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El minimo es " + valorMin + " y esta en la fila " + filaMinimo + ", columna " + columnaMinimo);

  }
}
