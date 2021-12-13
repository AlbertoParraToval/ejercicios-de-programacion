public class Ex46_05 {
    public static void main(String[] args) {
      System.out.println("[Programa que dibuja una L en base a su altura]");
      //Pido al usuario una altura
      System.out.print("Introduce la altura de tu L: ");
      int alturaIntroducida =  Integer.parseInt(System.console().readLine());
      int anchura = alturaIntroducida;
      //DIbujamos la linea vertical
      for (int i = 0; i < alturaIntroducida; i++) {
        System.out.println(" * ");
        
      }
      //Dibujamos la linea horizontal en base a la altura introducida en la vertical
      for (int j = 0; j < alturaIntroducida/2; j++) {
        System.out.print(" * ");
        }
      
    }
}