/**
 *  Realiza un programa que pinte una pirámide por pantalla. La altura se debe
    pedir por teclado. El carácter con el que se pinta la pirámide también se debe
    pedir por teclado.
 * @author Alberto Parra Toval
 */
public class Ex19_05 {
    public static void main(String[] args) {
        System.out.println("[Piramide]");
        System.out.println("--------------");
        //Pedimos al usuario que nos diga la altura y el caracter ha usar
        System.out.print("Introduce la altura de la piramide por teclado: ");
        int altura = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce el caracter por teclado: ");
        String caracter = System.console().readLine();
        //Definimos la base, numespacio y la longitudlinea
        int base = 1;
        int numespacio = altura -1;
        int longitudLinea = 1;
        // El bucle se ejecutara hasta que la base sea mayor a la altura introducida
        while (base <= altura ){
          // Mientras a sea menor o igual al nuemro de espacio no se pinta nada
          for (int a = 1; a <= numespacio; a++){
            System.out.print(" ");
          }
          //Mientras a es menor o igual a longitud linea que pinte el caracter introducido
          for (int a = 1; a <= longitudLinea; a++){
            System.out.print(caracter);
          }
          System.out.println(" ");
          //Cada vez que se ejecute el buble se sume una base, se reste un espacio y se sume dos a a longitudLiena
          base++;
          numespacio--;
          longitudLinea += 2;
        }
      }
    }