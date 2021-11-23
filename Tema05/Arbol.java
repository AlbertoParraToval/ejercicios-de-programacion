/**
 * Bucle for
 *
 * @author Alberto Parra Toval
 */
public class Arbol {
  public static void main(String[] args) {
    System.out.println("[Arbol de Navidad]");
    System.out.println("Por favor introduca la altura del arbol: ");
    System.out.print("Introduce la altura del arbol por teclado: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int base = 1;
    int numespacio = altura -1;
    int longitudLinea = 1;
    /****** estrella superior ***********/
    for(int i = 0; i <= altura;i++){
      if (i <= (altura -2) ){ /* Condición de si la i es mayor que la altura -2 que pare de poner espacios en blanco hacia la derecha */
        System.out.print(" ");
      } else if (i < altura ){ /* Si la i es menor que la altura que muestre  */
        System.out.print("⭐");
      }
    }
    System.out.println("");
    /******* Cuerpo del arbol **************/
    while (base <=(altura-3) ){
      
      for (int a = 1; a <= numespacio; a++){
        System.out.print(" ");
        
      }
      for (int a = 1; a <= longitudLinea; a++ ){
        if (base == (altura -3))
          System.out.print("/");
        else{
          if ((a == 1) || (a == longitudLinea)){
            System.out.print("/");
          } else {
            int caracter = (int)(Math.random()*15);
            switch (caracter){
              case 0:
              System.out.print("+");
              break;
              case 1:
              System.out.print("@");
              break;
              case 2:
              System.out.print("o");
              break;
              default:
              System.out.print(" ");
              break;
            }
          }
        }
        
      }
      
      
      System.out.println(" ");
    base++;
    numespacio--;
    longitudLinea+=2;
    }
    /*********** Base del arbol (Tronco) ************/
    int contador = 2;
    int aux = 0;
    while ( aux < contador ){
      for (int i = 0; i < altura; i++){
        if (i < altura -1){
          System.out.print(" ");
        }else{
          System.out.print("#");
          System.out.println("");
        }
      }
      aux++;
    }
  }
}
