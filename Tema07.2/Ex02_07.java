/**  
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
 * @author Alberto Parra Toval
 */
public class Ex02_07 {
    public static void main(String[] args) {
        int[][] num = new int[4][5]; // array de 4 filas por 5 columnas (4x5)
        int fila;
        int columna;

        // Lee los datos de teclado 
        System.out.println("Por favor, introduzca los números (enteros) en el array");
        for(fila = 0; fila < 4; fila++) { //Maximo de filas
            for(columna = 0; columna < 5; columna++) { //Maximo de columnas
            System.out.print("Fila " + fila + ", columna " + columna + ": ");
            num[fila][columna] = Integer.parseInt(System.console().readLine());
            }
        }
    
        // Muestra los datos y las sumas parciales de las filas
        int sumaFila;
        for(fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for(columna = 0; columna < 5; columna++) {
            System.out.printf("%5d   ", num[fila][columna]);
            sumaFila += num[fila][columna];
            }
            System.out.printf("|%5d\n", sumaFila);
        }
        //Separacion entre fila y fila
        for(columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");
    
        //Muestra las sumas parciales de las columnas
        int sumaColumna;
        int sumaTotal = 0;
        for(columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for(fila = 0; fila < 4; fila++) {
                sumaColumna += num[fila][columna];
            }
    
            sumaTotal += sumaColumna;
            System.out.printf("%5d   ", sumaColumna);
        }
        System.out.printf("|%5d   ", sumaTotal);
    }
}
