/**
<<<<<<< HEAD
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
=======
 *  Realiza un programa que pinte una pirámide por pantalla. La altura se debe
    pedir por teclado. El carácter con el que se pinta la pirámide también se debe
    pedir por teclado.
 * @author Alberto Parra Toval
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("[Piramide Hueca]");
        System.out.println("--------------");
        System.out.print("Introduzca la altura de la pirámide: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
        System.out.print("Introduzca el carácter de relleno: ");
        String caracter = System.console().readLine();
        
        int base = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;
        
        while (base <= alturaIntroducida) {
        
          for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
          }
    
          for (int i = 1; i <= longitudDeLinea; i++) {
            System.out.print(caracter);
          }
    
          System.out.println();
          base++;
          espacios--;
          longitudDeLinea += 2;
        }
    }
}
>>>>>>> 77968f8b7816cc20deb6fba9625ef0268ad78b78
