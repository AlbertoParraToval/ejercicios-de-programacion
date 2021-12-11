
/*  Realiza un programa que sume los 100 números siguientes a un número entero
    y positivo introducido por teclado. Se debe comprobar que el dato introducido
    es correcto (que es un número positivo).
* @author Alberto Parra Toval
*/
public class Ex17_05 {
    public static void main(String[] args) {
        System.out.println("Ejercicio que muestra las suma de 100 numeros a partir de uno");
        //Defino la variable num
        int numeroIntroducido = 0;
        
        do {
            System.out.print("Introduzca un numero entero positivo: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());
          // Si el nuemro introducido es menor a 0:
            if(numeroIntroducido < 0) {
          System.out.println("El numero introducido no es correcto.");
            }
        } while (numeroIntroducido < 0); //Mientra el numero introducido sea menor a 0 que se ejecute el buble

        int suma = 0;
        // Mientras i sea menor al numero introducido mas 100 que el buble se ejecute
        for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
          suma += i;
        }
        System.out.println("La suma de los siguientes 100 numeros al " + numeroIntroducido + " es " + suma);
    }
}