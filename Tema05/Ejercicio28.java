public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("[Piramide]");
        System.out.println("--------------");
        System.out.print("Introduzca la altura de la pirámide: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
        System.out.print("Introduzca el carácter de relleno: ");
        int caracter = Integer.parseInt(System.console().readLine());;
        
        int base = 1;
        int longitud = 1;
        int espacios = alturaIntroducida-1;
        
        while (base <= alturaIntroducida) {
        
          for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
          }
    
          for (int i = 1; i <= longitud; i++) {
            System.out.print(caracter);
          }
    
          System.out.println();
          base++;
          espacios--;
          longitud += 2;
        }
    }
}