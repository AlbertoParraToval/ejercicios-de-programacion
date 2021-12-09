/**Realiza una version del programa Hola mundo.Se debe mostrar la palabra HOLA
 * (todo en mayúsculas) hecha con asteriscos.La altura de la palabra debe ser un
 * número impar generado al azar entre el 3 y el 13 ambos incluidos.Los palos ho
 * -rizontales de la H y de la A están justo a la mitad de la altura. La anchura
 * de las letras siempre es la misma. Aunque, en este caso , sólo hay 6 posibles
 * HOLAs de distinta altura,el programa debe hacerse de tal forma que sea muy fá
 * -cil adaptarlo a otros rangos de altura, por ej. entre 7 y 33. Por tanto, no 
 * se da por válido escribir 6 sentencias if, cada una pintando la correspondien
 * te figura completa.
 *
 * @author Alberto Parra Toval
 */
public class Ex31_06 {
    public static void main(String[] args) {
        System.out.println("El programa pinta el mensaje HOLA con una altura aleatoria.");
        //NUMERO ALEATORIO ENTRE EL 3 Y 13
        int altura=(int)(Math.random()* 13)+3;
        //
        if ((altura %2 )==0){
        altura++;
        }
        // MIENTRAS I SEA MENOR O IGUAL QUE ALTURA
        for (int i = 1; i <= altura; i++ ){
            //SI I ES IGUAL A 1 SE PINTA LA PARTE DE ARRIBA
        if (i == 1){
            System.out.print("*    *   ****    *        **** ");
            //SI I ES MENOS QUE ALTURA Y ESTA DIVISIBLE ENTRE 3 SE PINTA LA PARTE CONTINUA A LA DE ARRIBA
        }else if (i < altura /2 +1){
            System.out.print("*    *  *    *   *       *    * ");
            //SI I IGUAL ALTURA Y ESTA DIVISIBLE ENTRE 3 SE PINTA LA PARTE DEL MEDIO
        }else if (i == altura /2 +1){
            System.out.print("******  *    *   *       ****** ");
            //SI I MAYOUR QUE ALTURA ENTRE DOS Y I MENOS QUE ALTURA SE PINTA LA PARTE DE EN MEDIO PARA ABAJO
        }else if ((i > altura /2)&&(i < altura)){
            System.out.print("*    *  *    *   *       *    * ");
              //SI I IGUAL A ALTURA SE PINTA LA PARTE DE ABAJO Y SE FINALIZA
        }else if (i == altura ){
            System.out.print("*    *   ****    ******  *    * ");
        }
            //ESPACIO SI NO SE CUMPLEN NINGUNA DE LAS SIGUIENTES CONDICIONES
        System.out.println("");
        }
    }
}