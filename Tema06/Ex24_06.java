/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ex24_06 {
    public static void main(String[] args) {
        System.out.println("El programa dado un numero introducido por teclado, elije al azar uno de sus dígitos.");
        System.out.print("Introduce un numero entero positivo por teclado: ");
        long numero = Integer.parseInt(System.console().readLine()) ;
        int posicion = 0;
        long voltear = 0;
        int longitud = 0;
        int digito = 0;
        
        //Volteo el primer numero
        while (numero > 0){
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
            longitud++; // Añadimos 1 a la longitud
        }
            posicion = (int)(Math.random()*(longitud +1))+1; // Posicon aleatoria en base a la longitud ya recogida antes en el voltear
        //Recorro el numero
        for (int i = 0; i < longitud; i++){
            digito = (int)(voltear % 10);
            // Cuando llegue a la posicion que muestre el numero
            if (posicion - 1 == i){
            System.out.println(digito);
            }
            voltear/=10;
        }
    }
}