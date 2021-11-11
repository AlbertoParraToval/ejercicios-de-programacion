/**
 *  Realiza el control de acceso a una caja fuerte. La combinación será un
    número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
    acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
    y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
    Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio7Tema5 {
    public static void main(String[] args) {
      System.out.println("Introduce la contraseña: ");
      int contraseña = Integer.parseInt(System.console().readLine());      
      int codigo = 1234;
      int intentos = 1;
      do {
          if (contraseña == codigo) {
              System.out.println("La caja fuerte se ha abierto satisfactoriamente");
              intentos = 5;
          } else {
            intentos++;  
            System.out.println("Lo siento, esa no es la combinación");
            System.out.println("Introduce la contraseña de nuevo, por favor: ");
            contraseña = Integer.parseInt(System.console().readLine()); 
          }
        }  while (intentos <= 4);
    }
}