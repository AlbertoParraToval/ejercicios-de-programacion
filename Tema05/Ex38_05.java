/**
 * Escribe un programa que muestre por pantalla todos los números enteros positi
 * -vos menores a uno leído por teclado que no sean divisibles entre otro también
 * leído de igual forma.
 * 
 * @author Alberto Parra Toval
 * 
 * 
 */
public class Ex29_05 {
    public static void main(String[] args) {
      System.out.println("A partir de un numero muestra los menores a ese num y que no son divisibles por el num elegido");
      //Pedimos al usuario un divisor y un numero
      System.out.print("Introduce un numero por teclado: ");
      int num= Integer.parseInt(System.console().readLine()) ;
      System.out.print("Introduce un divisor por teclado: ");
      int div = Integer.parseInt(System.console().readLine()) ;
      //Variable para comrpobar si es divisible
      int comprobador = 0;
      // Mientras el num introducido sea mayor a 0
      while (num > 0){
        num--;
        comprobador = num % div;
        //Si comprobado no es igual a 0 mostramos esos numeros ya que no son divisibles por el introducido
        if (comprobador != 0){
          System.out.print(num +" ");
          }
      }
      System.out.println(" ");
    }
  }