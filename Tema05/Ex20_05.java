/**
 *  Realiza un programa que pinte una pirámide por pantalla. La altura se debe
    pedir por teclado. El carácter con el que se pinta la pirámide también se debe
    pedir por teclado.
 * @author Alberto Parra Toval
 */
public class Ex20_05 {
    public static void main(String[] args) {
      System.out.println("[Piramide Hueca]");
      System.out.println("--------------");
      // Pedimos al usuario la altura y el caracter a usar
      System.out.print("Introduce la altura de la piramide por teclado: ");
      int altura = Integer.parseInt(System.console().readLine()) ;
      System.out.print("Introduce el caracter por teclado: ");
      String caracter = System.console().readLine();
      //Definimos la base, numespacio y la longitudlinea
      int base = 1;
      int numespacio = altura -1;
      int longitudLinea = 1;
      
      // El bucle se ejecutara cuando la base sea mayor a la altura
      while (base <= altura ){
          //Mientras a sea menor o igual al numespacio , no se pintara nada
          for (int a = 1; a <= numespacio; a++){
            System.out.print(" ");
          }
          // Mientras a sea menor o igual a la longitudlinea
          for (int a = 1; a <= longitudLinea; a++ ){
            // Si base igual altura se pinta el caracter
            if (base == altura)
              System.out.print(caracter);
            else{
              if ((a == 1) || (a == longitudLinea)){ // Si a es igual a 1 o es igual a longitudlinea tambien se pinta el caracter
                System.out.print(caracter);
              } else { // Sino es así, no se pinta nada
                System.out.print(" ");
              }
            }
          }
          System.out.println(" ");
        // Le voy sumando y restando a estas varibles cada vez que se ejecute el bucle
        base++;
        numespacio--;
        longitudLinea+=2;
      }
  }
}
