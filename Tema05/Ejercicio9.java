/**
 *  Realiza un programa que nos diga cuántos dígitos tiene un número introducido
    por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
    la salvedad de que el anterior estaba limitado a números de 5 dígitos como
    máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
    esta manera, la única limitación en el número de dígitos la establece el tipo de
    dato que se utilice (int o long).
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Introduzca el número que desee y le diré los dígitos que tiene: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int numeroDeDigitos = 1;
        int i;
        i = numeroIntroducido;
        
        while (i > 10) {
          i /= 10;
          numeroDeDigitos++;
        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos");
      }
    }
}