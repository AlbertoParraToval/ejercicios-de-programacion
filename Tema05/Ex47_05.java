/**
    Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error. 
 * 
 * @author Alberto Parra Toval
 */
public class Ex47_05 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int anchura = 6;
    int vuelta = 2;
    if (altura < 5) {
      System.out.println("La altura introducida no es correcta");
    }else if ((altura %2) == 0){
      System.out.println("La altura introducida no es correcta");
    }else{
      /**Cabeza del ocho **/
        for (int i = 0; i < anchura -1; i++){
          System.out.print("M");
        }
      while ( vuelta > 0){
        /**Cuerpo del ocho **/
        for (int i = 2; i < altura; i++ ){
          System.out.println("");
          System.out.print("M");
          for (int aux = 2; aux <= (anchura - 2);aux++){
            System.out.print(" ");
          } 
          System.out.print("M");
        }
        System.out.println("");
        /**Base del ocho **/
        for (int i = 1; i < anchura; i++){
          System.out.print("M");
        }
        vuelta--;
      }
    }
  }
}