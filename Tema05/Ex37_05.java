/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * @author Alberto Parra Toval
 */
public class Ex37_05 {
  public static void main(String[] args) {
    System.out.println("El programa nos un numero en un sistema de palotes (Ej: 12 = | - ||)");
    //Le pedimos al usuario el numero
    System.out.print("Introduce un numero por teclado: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
    int numero = numeroIntroducido;
    int voltear = 0 ;
    System.out.print("El "+ numero +" en decimal es el ");
    //Saco la cifra del numero
    while (numero > 0){
      voltear = (voltear * 10) + (numero %10);
      numero/=10;
    }

    while (voltear > 0){
      int cifra = voltear % 10; 
      switch (cifra){  // Las posibles combinaciones de palos para llegar a nuestro numero introducido
        case 1:
          System.out.print(" | -");
        break;
        case 2:
          System.out.print(" || -");
        break;
        case 3:
          System.out.print(" ||| -");
        break;
        case 4:
          System.out.print(" |||| -");
        break;
        case 5:
          System.out.print(" ||||| -");
        break;
        case 6:
          System.out.print(" |||||| -");
        break;
        case 7:
          System.out.print(" ||||||| -");
        break;
        case 8:
          System.out.print(" |||||||| -");
        break;
        case 9:
          System.out.print(" ||||||||| -");
        break;
        default:
        System.out.print("  -");
        break;
        } 
      voltear /= 10;
    }
    System.out.print(" en el sistema palotes. "); // El final
  }
}
