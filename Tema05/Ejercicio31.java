public class Ejercicio31 {
    public static void main(String[] args) {
      System.out.println("[Programa que dibuja una L en base a su altura]");
      System.out.print("Introduce la altura de tu L: ");
      int alturaIntroducida =  Integer.parseInt(System.console().readLine());
      int anchura = alturaIntroducida;
      
      for (int i = 0; i < alturaIntroducida; i++) {
        System.out.println(" * ");
        
      }
      
      for (int j = 0; j < alturaIntroducida/2; j++) {
        System.out.print(" * ");
        }
      
    }
}