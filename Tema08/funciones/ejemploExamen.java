package funciones;

public class ejemploExamen {

  // Todas las funciones est�n sacadas de los apuntes

  /**
   * Devuelve el n�mero de filas de un array bidimensional de
   * n�meros enteros.
   * 
   * @param x un array bidimensional de n�meros enteros
   * @return n�mero de filas del array
   */
  public static int filasArrayIntBi(int x[][]) {
    return x.length;
  }

  /**
   * Devuelve el n�mero de columnas de un array bidimensional
   * de n�meros enteros.
   * 
   * @param x un array bidimensional de n�meros enteros
   * @return n�mero de columnas del array
   */
  public static int columnasArrayIntBi(int x[][]) {
    return x[0].length;
  }

  /**
   * Devuelve el m�ximo de un array bidimensional
   * de n�meros enteros.
   * 
   * @param x un array bidimensional de n�meros enteros
   * @return el valor m�ximo encontrado en el array
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
   * de n�meros enteros.
   * 
   * @param x un array bidimensional de n�meros enteros
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
   * Devuelve el n�mero de d�gitos que contiene un n�mero entero
   * 
   * @param x un n�mero entero
   * @return la cantidad de d�gitos que contiene el n�mero
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
