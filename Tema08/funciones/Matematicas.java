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



  /**
   *  Calcula si un numero introducido es CAPICUA O NO
   * @param numero 
   * @return Si es o no es capicua
   */
  public static boolean esCapicua(int numero) {
    //usando la función voltea, solo necesitamos saber si el resultado final de la función es igual al número introducido, si es así, la función será verdadera; y si no, falsa
    if (funciones.Matematicas.voltea(numero) == numero) { 
      return true;
    } else {
      return false;
    }
  } //public static boolean esCapicua(long numero)





    /**
   *  Va volteando un numero 
   * @param numero 
   * @return El numero con las veces que ha volteado este
   */
  public static int voltea(int numero) {
    int darLaVuelta = 0; //en esta variable se irá guardando el número al que poco a poco se le irá dando la vuelta
    
    while (numero > 0) {
      //el resto del número introducido entre 10 (su último dígito) se irá sumando a lo que haya en darLaVuelta multiplicado por 10 para actualizar darLaVuelta
      darLaVuelta = ((darLaVuelta * 10) + ((int)numero % 10)); 
      
      numero /= 10; //cada vez que el bucle de una vuelta el número introducido se dividirá entre 10, así hasta que este número sea igual a 0.
    } //while (numero > 0)

    return darLaVuelta; //si el número introducido es igual a cero significa que el número ya ha sido volteado, por lo que se devolverá ael resultado
  } //public static int voltea(int numero)



  /***
   * Base y el Exponente de un numero
   * @param base
   * @param exponente
   * @return El exponente que le demos 
  */
  public static int potencia(int base,  int exponente){ 
    // Definimos el buble hasta que nuestra variable auxiliar i supere a nuestro exponenete introducido
    int exponenteIntroducido = exponente;
    for (int i = 1; i <= exponenteIntroducido; i++) {
      // Mostramos el resultado por pantalla
          System.out.println("El resultado es: " + base + "^" + i);
          System.out.println("--------------------");
          
      }
      return exponenteIntroducido;
  }

  /**
   * 
   * @param numero
   * @return
   */
  public static int digitos(int numero){
    int numeroDeDigitos = 1;
    int i;
    i = numero;
    
    //La condicion para que empiece a contar los numeros es que sea mayor a 10
    while (i > 10) {
      i /= 10; //lo divide y si sigue siendo mayor a 10 lo cuenta
      numeroDeDigitos++;
    System.out.println(numero + " tiene " + numeroDeDigitos + " digitos");
    }
    return numeroDeDigitos;
  }






}
