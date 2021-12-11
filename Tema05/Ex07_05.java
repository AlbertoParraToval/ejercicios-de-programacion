/**
 *  Realiza el control de acceso a una caja fuerte. La combinación será un
    número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
    acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
    y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
    Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Alberto Parra Toval
 */
public class Ex07_05{
    public static void main(String[] args) {
      System.out.println("Ejercicio Caja Fuerte");
      System.out.println("Para abrir la caja fuerte dispone de 4 intentos, suerte.");
      // Introducimos la contraseña en la consola que creemos que es
      System.out.println("Introduce la contraseña: ");
      int contraseña = Integer.parseInt(System.console().readLine());      
      // Definimos el codigo oculto y el numero de intentos
      int codigo = 1234;
      int intentos = 1;
      do {
        // Si contraseña = codigo
          if (contraseña == codigo) {
              System.out.println("La caja fuerte se ha abierto satisfactoriamente");
              intentos = 7;
          } else { //Si contraseña != codigo
            intentos++;  
            System.out.println("Lo siento, esa no es la combinación");
            System.out.println("Introduce la contraseña de nuevo, por favor: ");
            contraseña = Integer.parseInt(System.console().readLine()); 
          }
        }  while (intentos < 4); // Mientras el numero de intentos sea menos a 4 que se ejecute el bucle
    }
}