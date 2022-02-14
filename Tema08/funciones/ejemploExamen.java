package funciones;

public class ejemploExamen {

  // Todas las funciones están sacadas de los apuntes

  /**
   * Devuelve el número de filas de un array bidimensional de
   * números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return número de filas del array
   */
  public static int filasArrayIntBi(int x[][]) {
    return x.length;
  }

  /**
   * Devuelve el número de columnas de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return número de columnas del array
   */
  public static int columnasArrayIntBi(int x[][]) {
    return x[0].length;
  }

  /**
   * Devuelve el máximo de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return el valor máximo encontrado en el array
   */
  public static int maximoArrayIntBi(int x[][]) {

    int maximo = Integer.MIN_VALUE;

    for (int f = 0; f < filasArrayIntBi(x); f++) {
      for (int c = 0; c < columnasArrayIntBi(x); c++) {
        if (x[f][c] > maximo) {
          maximo = x[f][c];
        }
      }
    }

    return maximo;
  }

  /**
   * Muestra por pantalla el contenido de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   */
  public static void muestraArrayIntBi(int x[][]) {

    String formatoNumero = "%" + digitos(maximoArrayIntBi(x)) + "d";

    for (int f = 0; f < filasArrayIntBi(x); f++) {
      for (int c = 0; c < columnasArrayIntBi(x); c++) {
        System.out.printf(formatoNumero + " ", x[f][c]);
      }
      System.out.println();
    }
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

}
