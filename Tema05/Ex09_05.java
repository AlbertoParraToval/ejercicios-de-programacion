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
public class Ex09_05 {
    public static void main(String[] args) {
      // Introducimos el numero  
      System.out.println("Introduzca el numero que desee y le dire los digitos que tiene: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int numeroDeDigitos = 1;
        int i;
        i = numeroIntroducido;
        
        //La condicion para que empiece a contar los numeros es que sea mayor a 10
        while (i > 10) {
          i /= 10; //lo divide y si sigue siendo mayor a 10 lo cuenta
          numeroDeDigitos++;
        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " digitos");
      }
    }
}