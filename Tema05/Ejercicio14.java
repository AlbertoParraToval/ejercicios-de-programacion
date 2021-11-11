/**
 *  Escribe un programa que pida una base y un exponente (entero positivo) y que
    calcule la potenciaEscribe un programa que muestre en tres columnas, el cuadrado y el cubo de
    los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * @author Alberto Parra Toval
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("[Ejercicio Base y Exponente]");
        System.out.println("----------------------------");
        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el exponente: ");
        int exponente = Integer.parseInt(System.console().readLine());
        int potencia = 1;
        //Si el exponente es 0    
        if (exponente == 0) {
                potencia = 1;
        }
        //Si el exponente es mayor que 0
        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }
        //Si el exponente es menor que 0
        if (exponente < 0) {
            for (int i = 0; i > base; i++) {
                potencia *= base;
            }
        potencia /= 1;
        }

        System.out.println("El resultado de " + base + "^" + exponente + " = " + potencia);
    }
}