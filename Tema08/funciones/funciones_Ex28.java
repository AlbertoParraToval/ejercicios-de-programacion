package funciones;
/**
 * Paqute de funciones del ejericio 15-28
 * 
 * 
 * @author Alberto Parra Toval
 */

public class funciones_Ex28 {
  /**
   * La función muestra un array
   *
   * @param array array que se quiere mostrar
   * @param tama��o tama�o del array
   * @return los valores de un array
   * 
   * @author Alberto Parra Toval
   */
  public static void muestraArray(int[] array, int tamano) {
    //la función mostrará en cada iteración la posición correspondiente a i (índice)
    for (int i = 0; i < tamano; i++) {
      System.out.print(array[i] + " ");
    }
  } 


  /**
   * La funcion muestra un array dentro de una tabla
   * (Los numeros tendran que ser como máximo de tres cifras)
   *
   * @param array array que se quiere mostrar
   * @param tamaño tamano del array
   * @return los valores de un array
   * 
   * @author Alberto Parra Toval
   */
  public static void muestraArrayEnTabla(int[] array, int tamano) {
    //la funcion pinta el borde superior de la tabla
    for (int i = 0; i < tamano; i++) {
      if (i == 0) {
        System.out.print("------");
      } else if (i == tamano - 1) {
        System.out.print("------");
      } else {
        System.out.print("------");
      } //if (i == 0)
    } //for (int i = 0; i < tamaño; i++)

    System.out.println(" ");

    //se muestra el indice que estara sobre el numero de la posicion del array correspondiente
    for (int j = 0; j < tamano; j++) {
      System.out.printf("%-1s %2d  " ,"|" ,j);
    }

    System.out.print("|");

    System.out.println(" ");

    //se pinta el borde medio de la tabla
    for (int k = 0; k < tamano; k++) {
      if (k == 0) {
        System.out.print("|-----|");
      } else if (k == tamano - 1) {
        System.out.print("-----|");
      } else {
        System.out.print("-----|");
      } //if (k == 0)
    } //for (int i = 0; i < tamaño; i++)

    System.out.println(" ");

    //s muestran los valores del array en cada posición
    for (int l = 0; l < tamano; l++) {
      System.out.printf("%-1s %3d " ,"|" ,array[l]);
    }

    System.out.print("|");

    System.out.println(" ");

    //se pinta el borde inferior de la tabla
    for (int m = 0; m < tamano; m++) {
      if (m == 0) {
        System.out.print("|-----|");
      } else if (m == tamano - 1) {
        System.out.print("-------");
      } else {
        System.out.print("-------");
      } //if (k == 0)
    } //for (int i = 0; i < tamaño; i++)
  } //public static void muestraArrayEnTabla(int[] array, int tamaño)


  /**
   * La función genera un array de tamaño n con números aleatorios
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   *
   * @param tamaño tamaño del array
   * @param maximo límite mayor del intervalo
   * @param minimo límite menor del intervalo
   * @return array de tamaño n de números aleatorios entre minimo y maximo
   * 
   * @author Alberto Parra Toval
   */
  public static int[] generaArrayInt(int tamano, int maximo, int minimo) {
    //se define el array que se va a generar
    int[] array = new int[tamano];

    //en cada posición se asiga un valor aleatorio gracias al aumento en cada iteración de la variable i.
    //el intervalo de los valores aleatorios se definirá multiplicando la función Math.random() por
    //el mayor número del intervalo menos el mínimo, para que al sumarle el mínimo el valor máximo no cambie
    for (int i = 0; i < tamano; i++) {
      array[i] = ((int)(Math.random() * (maximo - minimo)) + minimo);
    }

    return array;
  } //public static int[] generaArrayInt(int tamaño, int maximo, int minimo)


  /**
   * La función devuelve el mínimo del array que se pasa como parámetro.
   *
   * @param array array del que se quiere ver cual es el número mínimo
   * @return número mínimo
   * 
   * @author Alberto Parra Toval
   */
  public static long minimoArrayInt(int[] array) {
    long numMenor = 0; //se define la variable numMenor para guardar ahí el número menor

    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        numMenor = array[i]; //el primer número será siempre tomado en cuenta como el menor de primera hora
      } else if (array[i] < numMenor) {
        numMenor = array[i]; //si el siguiente número generado es menor que el que hasta ahora el mínimo el nuevo nuevo pasará a ser el mínimo
      } //if (i == 0)
    } //for (int i = 0; i < array.length; i++)

    //¿por qué calculo así el menor? según se vayan introduciendo números el mínimo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer mínimo,
    //por eso lo declaro como tal cuando el contador (i) está a 0. Si el siguiente número generado es menor, el número mínimo cambiará, así hasta llegar al último número

    return numMenor;
  } //public static long minimoArrayInt(int[] array)


  /**
   * La función devuelve el máximo del array que se pasa como parámetro.
   *
   * @param array array del que se quiere ver cual es el número máximo
   * @return número máximo
   * 
   * @author Alberto Parra Toval
   */
  public static long maximoArrayInt(int[] array) {
    long numMayor = 0; //se define la variable numMayor para guardar ahí el número mayor

    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        numMayor = array[i]; //el primer número será siempre tomado en cuenta como el mayor de primera hora
      } else if (array[i] > numMayor) {
        numMayor = array[i]; //si el siguiente número generado es mayor que el que hasta ahora el máximo el nuevo nuevo pasará a ser el máximo
      } //if (i == 0)
    } //for (int i = 0; i < array.length; i++)

    //¿por qué calculo así el mayor? según se vayan introduciendo números el máximo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer máximo,
    //por eso lo declaro como tal cuando el contador (i) está a 0. Si el siguiente número generado es mayor, el número máximo cambiará, así hasta llegar al último número.

    return numMayor;
  } //public static long maximoArrayInt(int[] array)


  /**
   * La función devuelve la media del arrayque se pasa como parámetro
   *
   * @param array array del que se quiere comprobar la media
   * @return media
   * 
   * @author Alberto Parra Toval
   */
  public static double mediaArrayInt(int[] array) {
    long sumatorio = 0; //definimos e inicializamos la variable sumatorio donde iremos sumando cada valor del array

    //en cada iteración se sumará el valor del array coorespondiente
    for (int i = 0; i < array.length; i++) {
      sumatorio = sumatorio + array[i];
    }

    return ((double)sumatorio / array.length); //la función devolverá el sumatorio partido la longitud del array, es decir, la media
  } //public static long mediaArrayInt(int[] array)


  /**
   * La función dice si un número está o no dentro de un array
   *
   * @param array array de donde se quiere comprobar el número
   * @param numero número que se quiere comprobar si está en el array
   * @return si el número está o no en el array
   * 
   * @author Alberto Parra Toval
   */
  public static String estaEnArrayInt(int[] array, long numero) {
    int i; //definimos el indice para usarlo fuera del bucle

    //con este bucle comprobamos si el número se encuentra en el array
    //si el número no se encuentra el en el array i será igual a 10
    //si el número se encuentra en el array i será menor que 10
    for (i = 0; ((i < array.length) && (numero != array[i])); i++) { }

    //en cada caso se mostrará el mensaje correspondiente
    if (i < array.length) {
      System.out.println("El " + numero + " se encuentra dentro del array");
    } else {
      System.out.println("El " + numero + " no se encuentra dentro del array");
    } //if (numero == array[i])

    return "";
  } //public static String estaEnArrayInt(int[] array, long numero)


  /**
   * La función busca un número en el array y devuelve la posición (el índice)
   * en la que se encuentra
   *
   * @param array array de donde se quiere comprobar la posición del número
   * @param numero numero del que se quiere comprobar la posición
   * @return posición del número en el array
   * 
   * @author Alberto Parra Toval
   */
  public static String posicionEnArray(int[] array, long numero) {
    int i; //definimos el indice para usarlo fuera del bucle

    //con este bucle comprobamos si el número se encuentra en el array
    //si el número no se encuentra el en el array i será igual a 10
    //si el número se encuentra en el array i será menor que 10
    for (i = 0; ((i < array.length) && (numero != array[i])); i++) { }

    //en cada caso se mostrará el mensaje correspondiente
    //en caso de que el número se encuentre se mostrará la posición
    if (i < array.length) {
      System.out.println("El " + numero + " se encuentra en la posición " + i + " dentro del array");
    } else {
      System.out.println("El " + numero + " no se encuentra dentro del array");
    } //if (numero == array[i])

    return "";
  } //public static String estaEnArrayInt(int[] array, long numero)


  /**
   * La función le da la vuelta a un array
   *
   * @param array array que se va a voltear
   * @return array volteado
   * 
   * @author Alberto Parra Toval
   */
  public static int[] volteaArrayInt(int[] array) {
    int[] arrayVolteado = new int [array.length]; //se define el array donde se va a guardar el array volteado

    //para cada posición de arrayVolteado, se le asigna el valor del opuesto del array parámetro
    //Ej.: en un array de 10 elementos, arrayVolteado[0] = array[arrayVolteado.lenght = 10, 10 - 1 - 0 = 9], arrayVolteado[1] = array[8 (i = 2)], ...
    for (int i = 0; i < arrayVolteado.length; i++) {
      arrayVolteado[i] = array[arrayVolteado.length - 1 - i];
    }

    return arrayVolteado; //se devuelve el array volteado
  } //public static int[] volteaArrayInt(int[] array)


  /**
   * La funcion rota n posiciones a la derecha los números de un array.
   *
   * @param array array que se va a rotar
   * @return array rotado
   * 
   * @author Alberto Parra Toval
   */
  public static int[] rotaDerechaArrayInt(int[] array, int numPosiciones) {
    int[] arrayRotado = new int [array.length]; //se define el array donde se va a guardar el array rotado

    //si el índice es menor que el número de posiciones que se quiere mover cada numero
    //se guardarán en el nuevo array las posiciones del antiguo posteriores a la posición 
    //igual a numPosiciones. si el ínidce es igual o mayor que numPosiciones se guadará en el array
    //las psoiciones del array antiguo anteriores  a la posición igual a numPosiciones
    for (int i = 0; i < arrayRotado.length; i++) {
      if (i < numPosiciones) {
        arrayRotado[i] = array[(arrayRotado.length - numPosiciones) + i];
      } else if (i >= numPosiciones) {
        arrayRotado[i] = array[i - numPosiciones];
      } //if (i < numPosiciones)
    } //for (int i = 0; i < arrayRotado.length; i++)

    return arrayRotado; 
  } //public static int[] rotaDerechaArrayInt(int[] array)


  /**
   * La función rota n posiciones a la izquierda los números de un array.
   *
   * @param array array que se va a rotar
   * @return array rotado
   * 
   * @author Alberto Parra Toval
   */
  public static int[] rotaIzquierdaArrayInt(int[] array, int numPosiciones) {
    //por ejemplo, en un array de 10 elementos, si queremos rotarlos todos 3 posiciones a la 
    //izquierda será lo mismo que rotarlas 7 posiciones a la derecha
    numPosiciones = array.length - numPosiciones; 
    return rotaDerechaArrayInt(array, numPosiciones); 
  } //public static int[] rotaIzquierdaArrayInt(int[] array)
}
