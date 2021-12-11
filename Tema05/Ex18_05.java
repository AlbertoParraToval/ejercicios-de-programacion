/**
 *  Escribe un programa que obtenga los números enteros comprendidos entre dos
    números introducidos por teclado y validados como distintos, el programa debe
    empezar por el menor de los enteros introducidos e ir incrementando de 7 en
    7.
 * @author Alberto Parra Toval
 */
public class Ex11_05 {
    public static void main(String[] args) {
        System.out.println("[Numeros enteros comprendidos entre dos números]");
        System.out.println("----------------------------------");
        // Pedimos al ususario introducir dos numeros definiendolos en varibles diferentes
        System.out.print("Introduzca un número entero positivo: ");
        int primerNumero = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un número entero positivo: ");
        int segundoNumero = Integer.parseInt(System.console().readLine());
        
        // Si los numeros son iguales 
        if (primerNumero == segundoNumero) {
            System.out.println("Los números introducidos no son correctos.");
        }
        
        int aux;
        // Si el primero es mayor que el segundo, se localiza cual es menor para despues ir contando de 7 en 7
        if (primerNumero > segundoNumero) {
            aux = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = aux;
            }
        
        //Mientras i sea menor o igual al segundo numero se ira sumando de 7 en 7
        for(int i = primerNumero; i <= segundoNumero; i += 7) {
            System.out.print(i + " ");
        }         
        
        System.out.println();
    }
}
