/**
 * Ejercicio: 49
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir)
 * 
 * @author Alberto Parra Toval
 * 
 * 
 */
public class Ex49_05 {
    public static void main(String[] args) {
        System.out.print("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        int contador=0;
        int maxNum = 0;
        int menorNum = 0;
        int sumanumeros = 0;
        boolean esPrimo; 
        do{
            int numero = Integer.parseInt(System.console().readLine()) ;
            esPrimo = true; 
            for (int i=2; i < numero; i++){ //Comprobamos dividimos entre i para saber si es primo 
            if ((numero % i) == 0){
                esPrimo = false;
            }
            }
            if (!esPrimo){ // Sino es primo 
            sumanumeros = numero + sumanumeros;
            contador++;
            if (numero > maxNum){ // Sino es primo y tambien el num es mayor que el max
            maxNum=numero;
            }
            if(contador == 1){
                menorNum=numero;
                }
            if (numero < menorNum){
            menorNum=numero;
                }
            }

        }while (!esPrimo); //Mientras no sea primo
        System.out.println("Ha introducido "+ contador +" números no primos.");
        System.out.println("Máximo: "+maxNum);
        System.out.println("Mínimo: "+menorNum);
        double media = (double)(maxNum+menorNum)/(double)contador;
        System.out.println("Media: "+media);
        }
    }
    