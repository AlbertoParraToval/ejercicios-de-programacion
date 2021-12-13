/** Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.
 *
 * @author Alberto Parra Toval
 */
public class Ex11_07 {
    public static void main(String[] args) {
        System.out.println("\nA continuación se muestran en tres columnas, un numero aleatorio entre 0 y 100, su cuadrado y su cubo:\n");
        //DEFINO LA LONGITUD DE LOS ARRAY
        int[] num = new int[20];
        int[] square = new int[20];
        int[] cube = new int[20];
        int i;
        //METO EN EL FOR LOS 3 ARRAYS COMENZANDO POR EL ARRAY NUMERO
        for (i = 0; i < 20; i++) {
            num[i] = (int)(Math.random()*101);
            square[i] = num[i] * num[i];
            cube[i] = square[i] * num[i];
        }
        //MUESTRO LOS DATOS EN PANTALLA 
        System.out.println("| num  | square  |  cube |\n---------------------------");
        for (i = 0; i < 20; i++) {
            System.out.printf("| %4d | %7d |%6d |\n", num[i], square[i], cube[i]);
        }
        
    }
}

