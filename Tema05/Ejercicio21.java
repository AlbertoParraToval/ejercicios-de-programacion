/**
 *  Realiza un programa que vaya pidiendo números hasta que se introduzca un
    numero negativo y nos diga cuantos números se han introducido, la media de
    los impares y el mayor de los pares. El número negativo sólo se utiliza para
    indicar el final de la introducción de datos pero no se incluye en el cómputo.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio21 {
    public static void main(String[] args) { 
        System.out.println("[Programa Total Numeros, Media Impar y Mayor Par]");
        System.out.println("Por favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de un número negativo.");
    
        int numeroIntroducido;
        int numeroDeElementos = 0;
        int sumaImpares = 0;
        int numeroDeElementosImpares = 0;
        int maximoPar = 0;
        // Mientras vayamos introduciendo datos positivos se ejecutará el siguiente bucle.
        do {
            System.out.println("Introduce otro número: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());
          // Si el numero introducido es mayor que 0.
          if (numeroIntroducido >= 0) {
            numeroDeElementos++;
            if ((numeroIntroducido % 2) == 1) { // En el caso de que sea Impar
              sumaImpares += numeroIntroducido;
              numeroDeElementosImpares++;
            } else { // En el caso de que sea Par. 
              if (numeroIntroducido > maximoPar)
                maximoPar = numeroIntroducido;
            }
          }
        } while (numeroIntroducido >= 0);
        // Mostramos los resultados
        System.out.println("Ha introducido " + numeroDeElementos + " números");
        System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
        System.out.println("El máximo de los pares es " + maximoPar);
      }
    }