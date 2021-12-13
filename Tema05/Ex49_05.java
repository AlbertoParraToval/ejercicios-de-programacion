public class Ex49_05 {
    public static void main(String[] args) {
        System.out.println("El programa pide 2 y luego los mezcle en dos numeros diferentes los digitos pares y los impares.");
        System.out.print("Introduce un numero entero positivo por teclado: ");
        long numero1 = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce otro numero entero positivo por teclado: ");
        long numero2 = Integer.parseInt(System.console().readLine()) ;
        
        long voltear = 0;
        long voltearNum2 = 0;
        int longitud = 0;
        
        if ( numero1 == 0){
            longitud = 1;
        }
        
        /**Volteo el primer numero**/
        while (numero1 > 0){
            voltear = (voltear * 10) + (numero1 %10);
            numero1 /= 10;
            longitud++;
        }
        /** Volteo el segundo numero**/
        while (numero2 > 0){
            voltearNum2 = (voltearNum2 * 10) + (numero2 %10);
            numero2 /= 10;
        }


        long numeroPares = 0;
        long numeroImpares = 0;
        int digito = 0;
        /**recorro los numeros volteados para sacar ambos resultados**/
        for (int a = 0; a < longitud; a++){
            //Separo los numeros impares y los pares del primer numero
            digito = (int)(voltear %10);
            
            if ((digito % 2)==0){
            numeroPares = digito + (numeroPares * 10);
            }else{
            numeroImpares = digito + (numeroImpares * 10);
            }
            // Separo los numero impares y los pares del segudno numero
            digito = (int)(voltearNum2 % 10);
        
            if ((digito % 2)== 0){
                numeroPares = digito + (numeroPares * 10);
            }else {
            numeroImpares = digito + (numeroImpares * 10);
            }
            
            voltear = voltear /10; //Volteo primer num
            voltearNum2 = voltearNum2 /10; //Volteo segundo num
        }
        //Muestro los resultados pro pantalla
        System.out.println("El numero formado por los digitos pares es: " + numeroPares);
        System.out.println("El numero formado por los digitos impares es: " + numeroImpares);
    }
}