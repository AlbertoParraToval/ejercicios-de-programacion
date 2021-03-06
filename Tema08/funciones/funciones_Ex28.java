package funciones;
/**
 * Paqute de funciones del ejericio 15-28
 * 
 * 
 * @author Alberto Parra Toval
 */

public class funciones_Ex28 {
  /**
   * La funci贸n muestra un array
   *
   * @param array array que se quiere mostrar
   * @param tama民o tama駉 del array
   * @return los valores de un array
   * 
   * @author Alberto Parra Toval
   */
  public static void muestraArray(int[] array, int tamano) {
    //la funci贸n mostrar谩 en cada iteraci贸n la posici贸n correspondiente a i (铆ndice)
    for (int i = 0; i < tamano; i++) {
      System.out.print(array[i] + " ");
    }
  } 


  /**
   * La funcion muestra un array dentro de una tabla
   * (Los numeros tendran que ser como m谩ximo de tres cifras)
   *
   * @param array array que se quiere mostrar
   * @param tama帽o tamano del array
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
    } //for (int i = 0; i < tama帽o; i++)

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
    } //for (int i = 0; i < tama帽o; i++)

    System.out.println(" ");

    //s muestran los valores del array en cada posici贸n
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
    } //for (int i = 0; i < tama帽o; i++)
  } //public static void muestraArrayEnTabla(int[] array, int tama帽o)


  /**
   * La funci贸n genera un array de tama帽o n con n煤meros aleatorios
   * cuyo intervalo (m铆nimo y m谩ximo) se indica como par谩metro.
   *
   * @param tama帽o tama帽o del array
   * @param maximo l铆mite mayor del intervalo
   * @param minimo l铆mite menor del intervalo
   * @return array de tama帽o n de n煤meros aleatorios entre minimo y maximo
   * 
   * @author Alberto Parra Toval
   */
  public static int[] generaArrayInt(int tamano, int maximo, int minimo) {
    //se define el array que se va a generar
    int[] array = new int[tamano];

    //en cada posici贸n se asiga un valor aleatorio gracias al aumento en cada iteraci贸n de la variable i.
    //el intervalo de los valores aleatorios se definir谩 multiplicando la funci贸n Math.random() por
    //el mayor n煤mero del intervalo menos el m铆nimo, para que al sumarle el m铆nimo el valor m谩ximo no cambie
    for (int i = 0; i < tamano; i++) {
      array[i] = ((int)(Math.random() * (maximo - minimo)) + minimo);
    }

    return array;
  } //public static int[] generaArrayInt(int tama帽o, int maximo, int minimo)


  /**
   * La funci贸n devuelve el m铆nimo del array que se pasa como par谩metro.
   *
   * @param array array del que se quiere ver cual es el n煤mero m铆nimo
   * @return n煤mero m铆nimo
   * 
   * @author Alberto Parra Toval
   */
  public static long minimoArrayInt(int[] array) {
    long numMenor = 0; //se define la variable numMenor para guardar ah铆 el n煤mero menor

    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        numMenor = array[i]; //el primer n煤mero ser谩 siempre tomado en cuenta como el menor de primera hora
      } else if (array[i] < numMenor) {
        numMenor = array[i]; //si el siguiente n煤mero generado es menor que el que hasta ahora el m铆nimo el nuevo nuevo pasar谩 a ser el m铆nimo
      } //if (i == 0)
    } //for (int i = 0; i < array.length; i++)

    //驴por qu茅 calculo as铆 el menor? seg煤n se vayan introduciendo n煤meros el m铆nimo ir谩 cambiando. El primer n煤mero generado cuando no se ha generado ning煤n otro es el primer m铆nimo,
    //por eso lo declaro como tal cuando el contador (i) est谩 a 0. Si el siguiente n煤mero generado es menor, el n煤mero m铆nimo cambiar谩, as铆 hasta llegar al 煤ltimo n煤mero

    return numMenor;
  } //public static long minimoArrayInt(int[] array)


  /**
   * La funci贸n devuelve el m谩ximo del array que se pasa como par谩metro.
   *
   * @param array array del que se quiere ver cual es el n煤mero m谩ximo
   * @return n煤mero m谩ximo
   * 
   * @author Alberto Parra Toval
   */
  public static long maximoArrayInt(int[] array) {
    long numMayor = 0; //se define la variable numMayor para guardar ah铆 el n煤mero mayor

    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        numMayor = array[i]; //el primer n煤mero ser谩 siempre tomado en cuenta como el mayor de primera hora
      } else if (array[i] > numMayor) {
        numMayor = array[i]; //si el siguiente n煤mero generado es mayor que el que hasta ahora el m谩ximo el nuevo nuevo pasar谩 a ser el m谩ximo
      } //if (i == 0)
    } //for (int i = 0; i < array.length; i++)

    //驴por qu茅 calculo as铆 el mayor? seg煤n se vayan introduciendo n煤meros el m谩ximo ir谩 cambiando. El primer n煤mero generado cuando no se ha generado ning煤n otro es el primer m谩ximo,
    //por eso lo declaro como tal cuando el contador (i) est谩 a 0. Si el siguiente n煤mero generado es mayor, el n煤mero m谩ximo cambiar谩, as铆 hasta llegar al 煤ltimo n煤mero.

    return numMayor;
  } //public static long maximoArrayInt(int[] array)


  /**
   * La funci贸n devuelve la media del arrayque se pasa como par谩metro
   *
   * @param array array del que se quiere comprobar la media
   * @return media
   * 
   * @author Alberto Parra Toval
   */
  public static double mediaArrayInt(int[] array) {
    long sumatorio = 0; //definimos e inicializamos la variable sumatorio donde iremos sumando cada valor del array

    //en cada iteraci贸n se sumar谩 el valor del array coorespondiente
    for (int i = 0; i < array.length; i++) {
      sumatorio = sumatorio + array[i];
    }

    return ((double)sumatorio / array.length); //la funci贸n devolver谩 el sumatorio partido la longitud del array, es decir, la media
  } //public static long mediaArrayInt(int[] array)


  /**
   * La funci贸n dice si un n煤mero est谩 o no dentro de un array
   *
   * @param array array de donde se quiere comprobar el n煤mero
   * @param numero n煤mero que se quiere comprobar si est谩 en el array
   * @return si el n煤mero est谩 o no en el array
   * 
   * @author Alberto Parra Toval
   */
  public static String estaEnArrayInt(int[] array, long numero) {
    int i; //definimos el indice para usarlo fuera del bucle

    //con este bucle comprobamos si el n煤mero se encuentra en el array
    //si el n煤mero no se encuentra el en el array i ser谩 igual a 10
    //si el n煤mero se encuentra en el array i ser谩 menor que 10
    for (i = 0; ((i < array.length) && (numero != array[i])); i++) { }

    //en cada caso se mostrar谩 el mensaje correspondiente
    if (i < array.length) {
      System.out.println("El " + numero + " se encuentra dentro del array");
    } else {
      System.out.println("El " + numero + " no se encuentra dentro del array");
    } //if (numero == array[i])

    return "";
  } //public static String estaEnArrayInt(int[] array, long numero)


  /**
   * La funci贸n busca un n煤mero en el array y devuelve la posici贸n (el 铆ndice)
   * en la que se encuentra
   *
   * @param array array de donde se quiere comprobar la posici贸n del n煤mero
   * @param numero numero del que se quiere comprobar la posici贸n
   * @return posici贸n del n煤mero en el array
   * 
   * @author Alberto Parra Toval
   */
  public static String posicionEnArray(int[] array, long numero) {
    int i; //definimos el indice para usarlo fuera del bucle

    //con este bucle comprobamos si el n煤mero se encuentra en el array
    //si el n煤mero no se encuentra el en el array i ser谩 igual a 10
    //si el n煤mero se encuentra en el array i ser谩 menor que 10
    for (i = 0; ((i < array.length) && (numero != array[i])); i++) { }

    //en cada caso se mostrar谩 el mensaje correspondiente
    //en caso de que el n煤mero se encuentre se mostrar谩 la posici贸n
    if (i < array.length) {
      System.out.println("El " + numero + " se encuentra en la posici贸n " + i + " dentro del array");
    } else {
      System.out.println("El " + numero + " no se encuentra dentro del array");
    } //if (numero == array[i])

    return "";
  } //public static String estaEnArrayInt(int[] array, long numero)


  /**
   * La funci贸n le da la vuelta a un array
   *
   * @param array array que se va a voltear
   * @return array volteado
   * 
   * @author Alberto Parra Toval
   */
  public static int[] volteaArrayInt(int[] array) {
    int[] arrayVolteado = new int [array.length]; //se define el array donde se va a guardar el array volteado

    //para cada posici贸n de arrayVolteado, se le asigna el valor del opuesto del array par谩metro
    //Ej.: en un array de 10 elementos, arrayVolteado[0] = array[arrayVolteado.lenght = 10, 10 - 1 - 0 = 9], arrayVolteado[1] = array[8 (i = 2)], ...
    for (int i = 0; i < arrayVolteado.length; i++) {
      arrayVolteado[i] = array[arrayVolteado.length - 1 - i];
    }

    return arrayVolteado; //se devuelve el array volteado
  } //public static int[] volteaArrayInt(int[] array)


  /**
   * La funcion rota n posiciones a la derecha los n煤meros de un array.
   *
   * @param array array que se va a rotar
   * @return array rotado
   * 
   * @author Alberto Parra Toval
   */
  public static int[] rotaDerechaArrayInt(int[] array, int numPosiciones) {
    int[] arrayRotado = new int [array.length]; //se define el array donde se va a guardar el array rotado

    //si el 铆ndice es menor que el n煤mero de posiciones que se quiere mover cada numero
    //se guardar谩n en el nuevo array las posiciones del antiguo posteriores a la posici贸n 
    //igual a numPosiciones. si el 铆nidce es igual o mayor que numPosiciones se guadar谩 en el array
    //las psoiciones del array antiguo anteriores  a la posici贸n igual a numPosiciones
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
   * La funci贸n rota n posiciones a la izquierda los n煤meros de un array.
   *
   * @param array array que se va a rotar
   * @return array rotado
   * 
   * @author Alberto Parra Toval
   */
  public static int[] rotaIzquierdaArrayInt(int[] array, int numPosiciones) {
    //por ejemplo, en un array de 10 elementos, si queremos rotarlos todos 3 posiciones a la 
    //izquierda ser谩 lo mismo que rotarlas 7 posiciones a la derecha
    numPosiciones = array.length - numPosiciones; 
    return rotaDerechaArrayInt(array, numPosiciones); 
  } //public static int[] rotaIzquierdaArrayInt(int[] array)
}
