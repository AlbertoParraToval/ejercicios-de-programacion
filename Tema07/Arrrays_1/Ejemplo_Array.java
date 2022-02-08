/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ejemplo_Array {
    public static void main(String[] args) {
    System.out.println("[Compra del BlackFriday]");
        //Define la estructura del array
        //double[] precios; 
        //Reserva la memoria
        //precios = new double[5];
        
        double[] precios = {350, 500, 499, 300, 400};
        //precios[0] = 350;
        //precios[1] = 500;
        //precios[2] = 499;
        //precios[3] = 300;
        //precios[4] = 400;
        
        for (int i = 0; i < precios.length; i++) {
            System.out.printf("%2.f\n", precios[i]);
        }
    }
}