package funciones;

/**
 * Realiza figuras
 */
public class Figuras {
  /**
   * Crea una linea con el caracter (*) con un longitud determinada.
   * 
   * @param Longitud Numero que introduzcamos para la longitud de la linea
   * @return La linea con la longitud elegida con anterioridad.
   */
  public static String linea(int Longitud) {
    String result = "";
    for (int i = 0; i < Longitud; i++) {
      result += "*";
    }
    return result;
  }

  /**
   * La función pinta lineas de caracteres que tienen un determinado carácter en
   * los
   * extremos y otro carácter de relleno.
   *
   * @param longitud longitud de la línea
   * @param extremo  carácter de los extremos
   * @param relleno  carácter de relleno
   * @return línea de caracteres
   * 
   * @author Alberto Parra Toval
   */
  public static String linea(int longitud, char extremo, char relleno) {
    // longitud es el número de caracteres de la línea
    // cuando el bucle se encuentre entre la primera iteración o en la última el
    // caracter pintado
    // será el del extremo, el resto de veces será el del relleno
    for (int i = 1; i <= longitud; i++) {
      if ((i == 1) || (i == longitud)) {
        System.out.print(extremo);
      } else {
        System.out.print(relleno);
      }
    }

    return "";
  } // public static String linea(int longitud, char extremo, char relleno)

  /**
   * Función auxiliar para incluir los espacios previos al piso de una pirámide
   *
   * @param numEspacios número de espacios necesarios
   * @return espacios previos al piso de una pirámide
   * 
   * @author Alberto Parra Toval
   */
  public static String espacios(int numEspacios) {
    // definido un número de espacios, la función pintará una línea de espacios de
    // esa longitud
    for (int i = 1; i <= numEspacios; i++) {
      System.out.print(" ");
    }

    return "";
  } // public static String espacios(int altura)
}
