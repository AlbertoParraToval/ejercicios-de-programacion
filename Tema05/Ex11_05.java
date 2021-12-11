/**
 *  Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
    los 5 primeros números enteros a partir de uno que se introduce por teclado

 * @author Alberto Parra Toval
 */
public class Ex11_05 {
    public static void main(String[] args) {
        System.out.println("Ejercicio que muestra 5 numeros consecutivos y sus respectivos cuadrado y cubo");
        System.out.print("Introduzca un número: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        // For: I = numeroIntroducido y I debe ser menor a numero Introducido +5, se le suma I
        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
        System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        } 
    }
}