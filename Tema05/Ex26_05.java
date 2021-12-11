/**
 * Ejercicio: 26
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Alberto Parra Toval
 * 
 * 
 */public class Ex26_05 {
    public static void main(String[] args) {
      System.out.println("El programa nos dara la posición  de un ese dígito en el número introducido.");
      //Pedimos al usuario que nos deiga un numero y un digito
      System.out.print("Introduce un numero por teclado: ");
      int numero = Integer.parseInt(System.console().readLine()) ;
      System.out.print("Introduce un digito por teclado: ");
      int digito = Integer.parseInt(System.console().readLine()) ;
      //defino mis variables
      int cifra = 1; 
      int posicion = 0;
      int voltear = 0;
      
      numero = (numero * 10) +1;
      //Si numeor es mayor que 0
      while (numero > 0){
        voltear = (voltear * 10) + (numero %10);
        numero /= 10;
      }
      // mientras voltear sea mayor que 0
      while (voltear > 0){
        /*si la cifra es igual al digito entonces mostrara el siguiente mensaje por pantalla*/
        if (posicion > 0){
          if (cifra == digito){
            System.out.println("El digito en la posicion "+ posicion +" es "+cifra);
          }
        }
        
        cifra = voltear % 10; /*saco la cifra con el modulo*/
        
        voltear = voltear / 10;  /*divido el numero entre 10 para ir reduciendo el numero*/
        
        posicion++;/*por cada vuelta aumento la posicion hasta llegar al digito deseado*/
      }
    }
  }
  