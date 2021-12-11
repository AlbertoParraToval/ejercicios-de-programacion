/**
    Escribe un programa que permita ir introduciendo una serie indeterminada
    de números mientras su suma no supere el valor 10000. Cuando esto último
    ocurra, se debe mostrar el total acumulado, el contador de los números
    introducidos y la media.
    
 * @author Alberto Parra Toval
 */
public class Ex23_05 {
    public static void main(String[] args) {
        System.out.println("[Programa que permite introducir 10 numeros mientras su suma no supere 10000]");
        System.out.println("----------------------------------------------------------------");
        //Defino las variables 
        int numeroIntroducido;
        int suma = 0;
        int numeroDeElementos = 0;
        // Usando un Do-while con la condicion de que la suma debe ser menor o igual a 10000
        do {
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            suma += numeroIntroducido;
            numeroDeElementos++;
        } while (suma <= 10000);
        //Muestro los resultados por pantalla
        System.out.println("Ha introducido un total de " + numeroDeElementos + " numeros");
        System.out.println("La suma total es " + suma);
        System.out.println("La media es " + suma / numeroDeElementos);
    }
}