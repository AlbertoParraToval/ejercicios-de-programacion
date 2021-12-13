/** Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 *
 * @author Alberto Parra Toval
 */
public class Ex08_07 {
    public static void main(String[] args) {
        System.out.print("el programa genera 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios. \n");
        int [] lista = new int[100]; //Defino la longitud de mi array
        
        for (int i = 0; i < 100;i++){ // Numero de veces que se generara un numero random guardado en la lista
            lista[i] = (int)(Math.random()*20);
            System.out.print(lista[i]+" ");
        }

        System.out.print("\nIntroduce 2 numeros y el programa rota los elementos de ese array: \n");
        int [] numeroSustituto = new int[2]; //Los numeros que queramos poner en nuestro array
        for (int i = 0; i < 2;i++){
            numeroSustituto[i] = Integer.parseInt(System.console().readLine()); 
        }
        int indice = 0;
        while  (indice < 100){ // Mientra sea menor a 100
        if (lista[indice] == numeroSustituto[0] ){ // Si es igual al numero susutituto esta en la lista
            System.out.print("\""+numeroSustituto[1]+"\" "); //Pinta ese numero sustituto en lugar del que estaba antes
        }else{
            System.out.print(lista[indice]+" "); //Sino pinta el array que venia ya de por si
        }
        indice++; // Se va sumando para que se acabe el bucle
        }
        
    }
}

