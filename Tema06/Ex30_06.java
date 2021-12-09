
/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ex30_06 {
    public static void main(String[] args) {
      System.out.print("Introduce la altura de la pecera por teclado(min. 4): ");
      int altura = Integer.parseInt(System.console().readLine()) ;
      System.out.print("Introduce la anchura de la pecera por teclado(min. 4): ");
      int anchura = Integer.parseInt(System.console().readLine()) ;
      int posicion = 0;
      int posicionPez;
      int posicionCaballito;
      int posicionCaracola;
      //REPETIR POSICIONES ALEATORIAS DENTRO DE LA PECERA HASTA QUE SE TOQUEN Y AHI YA PARARÁ
      do{
        posicionPez = (int)(Math.random()*((altura -2)*(anchura-2)));;
        posicionCaballito = (int)(Math.random()*((altura -2)*(anchura-2)));;
        posicionCaracola = (int)(Math.random()*((altura -2)*(anchura-2)));;
      }while (((posicionPez == posicionCaracola ) || (posicionCaracola == posicionCaballito))||(posicionCaballito==posicionPez));
      
      /**Cabeza del rectangulo **/
      for (int i = 0; i < anchura; i++){
        System.out.print("*");
      }
      /**Cuerpo del rectangulo **/
      for (int i = 2; i < altura; i++ ){
        System.out.println("");
        System.out.print("*");
          for (int aux = 2; aux < anchura ;aux++){
            /** Si la posicion es igual a la posicion del pez, pinto el pez...**/
            if (posicion == posicionPez){
              System.out.print("&");
            }else if (posicion == posicionCaracola){
              System.out.print("@");
              
            }else if (posicion==posicionCaballito){
              System.out.print("$");
            }else{
              System.out.print(" ");
            }
            posicion++; //La posicion ira incrementando hasta ser igual que la posicion del pez.
          }
        System.out.print("*");
      }
      System.out.println("");
      /**Base del rectangulo **/
      for (int i = 0; i < anchura; i++){
        System.out.print("*");
      }
      
    }
  }
    