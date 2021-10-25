/**
* 	Escribe un programa que pinte una pirámide rellena con un carácter introducido
	por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
	etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
	de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
	hacia la derecha
* @author Alberto Parra 
*/
public class Ejercicio15Tema4 {

  public static void main(String[] args) {
        
    System.out.print("Introduzca el caracter para rellenar tu piramide: ");
    String c = System.console().readLine();
    System.out.println("Elija un tipo de pirámide");
    System.out.println("1. Vértice hacia arriba");
    System.out.println("2. Vértice hacia abajo");
    System.out.println("3. Vértice hacia la izquierda");
    System.out.println("4. Vértice hacia la derecha");
    int formato = Integer.parseInt(System.console().readLine());

    switch(formato) {
      case 1:
        System.out.println("  " + c);
        System.out.println(" " + c + c + c);
        System.out.println(c + c + c + c + c);
        break;
      case 2:
        System.out.println(c + c + c + c + c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c);
        break;
      case 3:
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println("  " + c + " " + c);
        System.out.println("    " + c);
        break;
      case 4:
        System.out.println(c);
        System.out.println(c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println(c + " " + c);
        System.out.println(c);
        break;
      default:
    }
  }
}
