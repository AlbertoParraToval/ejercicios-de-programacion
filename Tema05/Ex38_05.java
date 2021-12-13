/**
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. 
 * El programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Alberto Parra Toval
 * 
 * 
 */
public class Ex38_05 {
    public static void main(String[] args) {
      System.out.print("Introduce la altura de la X por teclado: ");
      int alturaIntroducida = Integer.parseInt(System.console().readLine()) ;
      int altura =1;
      int espaciosDelante=0;
      int espaciosDentro= alturaIntroducida - 1;
      // Parte de arriba de la X
      while (altura < alturaIntroducida /2 + 1){
      
        for (int i=1; i <= espaciosDelante;i++ ){
          System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 1; i < espaciosDentro; i++ ){
        System.out.print("*");
        }
        System.out.print("*");
        System.out.println("");
      
        altura++;
        espaciosDelante++;
        espaciosDentro-=2;
      
    }

      //Parte del centro de la X
      if (altura == alturaIntroducida /2 +1){
        for (int i = 1; i <= altura-1; i++){
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println("");
    
    //Parte inferior de la X
      altura =1;
      espaciosDelante=alturaIntroducida /2 -1;
      espaciosDentro= 2;
    
      while (altura < alturaIntroducida /2 + 1){
      
      for (int i=1 ; i <= espaciosDelante;i++ ){
        System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 1; i < espaciosDentro; i++ ){
          System.out.print("*");
        }
        System.out.print("*");
        System.out.println("");
      
        altura++;
        espaciosDelante--;
        espaciosDentro+=2;
      
    }
  }
}