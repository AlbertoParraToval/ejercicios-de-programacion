/**
 *  Realiza un programa que pinte una pirámide por pantalla. La altura se debe
    pedir por teclado. El carácter con el que se pinta la pirámide también se debe
    pedir por teclado.
 * @author Alberto Parra Toval
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("[Piramide Hueca]");
        System.out.println("--------------");
        System.out.print("Introduzca la altura de la piramide: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
        System.out.print("Introduzca el caracter de relleno: ");
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