/**
 *    Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
 *    nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
 *    El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no
 *    se incluye en el cómputo.
 * 
 * @author Alberto Parra Toval
 */
public class Ejercicio21 {

    public static void main(String[] args) {
      System.out.println("Programa Media Impares, Mayor Par y Numeros Introducidos Totales");
      System.out.println("--------------------------------------------------");
      System.out.println("Vaya Introduciendo numeros, puede terminar mediante la introduccion de un numero negativo. ");
     
      int numeroIntroducido;
      int numeroDeElementos = 0;
      int sumaImpares = 0;
      int numeroDeElementosImpares = 0;
      int maximoPar = 0;
        //Este bucle se ejecutará hasta que introduzcamos un número negativo.
      do {
        numeroIntroducido = Integer.parseInt(System.console().readLine());
        
        if (numeroIntroducido >= 0) {
          numeroDeElementos++;
          if ((numeroIntroducido % 2) == 1) { // En el caso de que el número sea impar
            sumaImpares += numeroIntroducido;
            numeroDeElementosImpares++;
          } else { // En el caso de que el número sea par
            if (numeroIntroducido > maximoPar)
              maximoPar = numeroIntroducido;
          }
        }
      } while (numeroIntroducido >= 0);
      //Mostramos los resultados obtenidos en nuestro bucle
      System.out.println("Ha introducido " + numeroDeElementos + " numeros");
      System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
      System.out.println("El maximo de los pares es " + maximoPar);
    }
  }