/** Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados)
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Programa que lanza 3 dados y suma sus resultados:");
        int dados;
        int suma = 0;
        System.out.print("Tirada de tres dados: ");
    
        for(int i = 0; i < 3; i++) {
          dados = (int)(Math.random() * 6) + 1;
        System.out.print(dados + " ");
        suma += dados;
        }
    
        System.out.println("\nLa Suma: " + suma);
    }
}