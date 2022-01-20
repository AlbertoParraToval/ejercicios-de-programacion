package funciones;
/**
 * Funciones matematicas variadas
 */
public class Matematicas {
  /**
   * Comprueba si un numero entero es Primo o no, es decir, si es divisible
   * unicamente
   * entre si mismo y la unidad.
   * 
   * @param numero numero entero que introducimos o generamos
   * @return si es <code>true</code> numero entero es primo y si es
   *         <code>false</code> numero entero no es primo.
   */
  public static boolean esPrimo(int numero) {
    boolean esPrimo = true;
    // Definimos que i=2 para ahora dividirlo entre nuestro numero introducido y que
    // si el resultado es == 0, numeroPrimo = false
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        esPrimo = false;
      }
    }
    return esPrimo;
  }

  /**
   * Media del trimestre con ponderaciones
   * 
   * @param examen1 Primera nota
   * @param examen2 Segunda nota
   * @return La media del trimestre
   */
  public static double mediaTrimestre(double examen1, double examen2) {
    double resultado = (examen1 * 0.4) + (examen2 * 0.6);
    return resultado;
  }

  /**
   * Genera un valor entero aleatorio entre
   * <code>Inicio</code> y <code>Fin</code>
   * 
   * @param inicio valor minimo a devolver
   * @param fin    valor maximo a devolver
   * @return un numero aleatorio entre dos valores que nosotros introduzcamos
   *         <code>Inicio</code> y <code>fin</code>
   */
  public static int aleatorio(int inicio, int fin) {
    return (int) (Math.random() * (fin - inicio + 1)) + inicio;
  }



  /**
   * Calcula la media aritmetica de tres números.
   * @param nota1
   * @param nota2
   * @param nota3
   * @return La media de los tres numeros.
   */
  public static double media(double nota1, double nota2, double nota3){
    double resultado = ((nota1 * 0.4) + (nota2 * 0.6) + (nota3 * 0.2))/3;
    return resultado;
  }





  public static boolean esCapicua(int numero){
    long voltear = 0;
        // Le doy la vuelta al nuemro 
        while (numero > 0){
            voltear = (voltear * 10) + (numero % 10);
            numero /= 10;
        }

        if (voltear == numero ) { // Si es igual es capicua
          return true;
      } else{
          return false;
      }
      
  }
}
