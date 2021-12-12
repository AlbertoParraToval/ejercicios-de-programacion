/**Realiza el juego del Craps. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando.
 *
 * @author Alberto Parra Toval
 */
public class Ex31_06 {
    public static void main(String[] args) {
        System.out.println("[CRABS]");
        System.out.println("------");
        //El usuario introduce cuanto decide apostar
        System.out.print("Introduce la cantidad de la puesta (Euros): ");
        int apuesta = Integer.parseInt(System.console().readLine()) ;
        int dado1 = (int)(Math.random()*6)+1; // Tirada del primer dado
        int dado2 = (int)(Math.random()*6)+1; // Tirada del segundo dado
        System.out.println("El primer dado ha sido un: "+ dado1); // Mostramos el resultado del 1
        System.out.println("El segundo dado ha sido un: "+ dado2); // Mostramos el resultado del 1
        int sumaDados = dado1 + dado2; // Los sumamos
        System.out.println("La suma de los dado ha sido : " + sumaDados);
    
        int premio = apuesta; 
        if ((sumaDados == 7)||(sumaDados==11)){ // Si se da una de estas combinaciones
        premio = premio + apuesta; // El premio es igual al premio de antes mas la apuesta
        System.out.println("Has ganado.");
        System.out.println("Has acabado con:"+premio+"€");
        }else if (((sumaDados == 2)||(sumaDados == 3))||(sumaDados == 12)){ // Si se da una de estas combinaciones
        System.out.println("Has perdido."); // has perdido
        }else{
        System.out.println("");
        System.out.println("Has entrado en la segunda etapa. "); // Si no ha pasado ninguna de las siguiente combinaciones pasas a la 2 ronda 
        System.out.println("---------------------------------");
        do{
        dado1 = (int)(Math.random()*6)+1;  // Tirada del primer dado
        dado2 = (int)(Math.random()*6)+1; // Tirada del segundo dado
        System.out.println("El primer dado ha sido un: " + dado1);
        System.out.println("El segundo dado ha sido un: " + dado2);
        if ((dado1 + dado2) == sumaDados){  // Si se da esta opcion
            premio = premio + apuesta; // El premio es igual al premio de antes mas la apuesta
            System.out.println("Has ganado.");
            System.out.println("Has acabado con:" + premio + "€");
        }else if ((dado1 + dado2) == 7){ // Si se ada esta opcion 
            System.out.println("Has perdido.");
        }else{
            System.out.println("La suma de los dados ha sido "+ (dado1 + dado2)); // Si no se da otra vez ninguna de las combinaciones
            System.out.print("Vuelve a tirar (Press any key):");
            String tirada = (System.console().readLine()) ;
        }
            }while (((dado1 + dado2) != 7) && (dado1 + dado2) != sumaDados); // Si ninguna de las opciones se dan pues que se repita el bucle
        }
    }
}