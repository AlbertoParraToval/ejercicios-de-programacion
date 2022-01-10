/**  
 *  Modifica el programa anterior de tal forma que los números que se introducen en
 *    el array se generen de forma aleatoria (valores entre 100 y 999).
 * @author Alberto Parra Toval
 */
public class Ex03_07 {
    public static void main(String[] args) {
        int[][] num = new int[4][5]; // array de 4 filas por 5 columnas (4x5)
        int fila;
        int columna;

        System.out.println("");
        for(fila = 0; fila < 4; fila++) { //Maximo de filas
            for(columna = 0; columna < 5; columna++) { //Maximo de columnas
            num[fila][columna] = (int)(Math.random() * 900) + 100;
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
