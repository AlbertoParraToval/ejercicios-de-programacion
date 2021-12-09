public class Ejercicio33 {
  public static void main(String[] args) {
    System.out.println("[Programa que dibuja una U en base a su altura]");
    System.out.print("Introduce la altura de tu U (min 4): ");
      int alturaIntroducida =  Integer.parseInt(System.console().readLine());
      int anchura = alturaIntroducida -2 ;
      int espacios = alturaIntroducida;
      
      if (alturaIntroducida > 3) {
        //Código de los dos palitos
        for (int i = 1; i < alturaIntroducida; i++) {
          System.out.print("*");
          for (int j = 2; j < alturaIntroducida; j++) {
            System.out.print("  ");
          }
          System.out.print(" ");
          System.out.println("*");
        }
        //Código de la base que depende de la altura introducida
        for (int a = 0; a <= anchura; a++) {
          System.out.print(" ");
          System.out.print("*");
          }
      } else {
        System.out.println("Datos erroneos");
      }
    }
}
