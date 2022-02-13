package funciones;
public class funciones_Matematica {
    /**
     * Si un numero es capicua o no
     * 
     * @param numeroIntroducido
     * @return Si el numero introducido es capicua
     */
    public static boolean esCapicua(long numeroIntroducido){
        long numero = numeroIntroducido;
        long voltear = 0;
        int contador = 0;
        while (numero > 0){
        
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
            contador++;
        }
        /**Comparo si el numero dado la vuelta es igual al numero que he introducido**/
        if ((voltear == numeroIntroducido)&&(contador > 1)){
            return true;
        
        }else{
            return false;
        }
    }

    /**
     * Si el numero es Primo
     * 
     * @param numeroIntroducido
     * @return Primo si o no
     */
    public static boolean esPrimo(long numeroIntroducido){
        int entreNumero= 0;
        if ((numeroIntroducido == 1) || (numeroIntroducido == 2)) {
            return true;
        } else {
            for (entreNumero = 2; ((entreNumero < numeroIntroducido) && ((numeroIntroducido % entreNumero) != 0)); entreNumero++){ }
            
            if (entreNumero == numeroIntroducido){
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Primo siguiente al numero introducido
     * 
     * @param numeroIntroducido
     * @return el sigueitne numero
     */
    public static long siguientePrimo(long numeroIntroducido){
        while (!esPrimo(++numeroIntroducido)){};
        return numeroIntroducido;
    }


    /***
     * La potencia de un numero 
     * 
     * @param x
     * @param e
     * @return El resultado de la potencia
     */
    public static int potencia(int x , int e){
        int resultado = 1;
        for (int numVecesMultiplica = 0; numVecesMultiplica < e; numVecesMultiplica++) {
            resultado = (x * resultado);
        }
        return resultado;
    }


    /***
     * El numero de digitos de un numero
     * 
     * @param numeroIntroducido
     * @return Los digitos
     */
    public static int digitos(long numeroIntroducido){
        long numero = numeroIntroducido;
        int contador = 0;
        while (numero > 0){
            numero /= 10;
            contador++;
        }
        return contador;
    }


    /***
     * Para saber el numero de posiciones
     * 
     * @param numeroIntroducido
     * @return
     */
    public static long voltea(long numeroIntroducido){
        long numero = numeroIntroducido;
        long voltear = 0;
        while (numero > 0){
        
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
        }
        return voltear;
    }


    /**
     * Para saber 
     * 
     * @param x
     * @param i
     * @return
     */
    public static int digitoN(long x, int i){
        int n = i;
        long numero = x;
        long cifra = 0;
        long voltear = funciones_Matematica.voltea(numero);
        cifra = (voltear % 10);
        for (int comprobarPosicion = 0; comprobarPosicion < n; comprobarPosicion++){
            voltear = voltear / 10;

            cifra = (voltear % 10);
        }
        return (int) cifra;
        
    }


/**
 * La posicion que le digamos dentro de un numero
 * 
 * @param x
 * @param p
 * @return El numero que esta en esa posicion 
 */
    public static int posicionDeDigito(long x , int p){
        int n = p;
        long numero = x;
        long cifra = 1;
        int posicion = 0;
        long voltear =  funciones_Matematica.voltea(numero);
        while ( voltear > 0){
            if (posicion > 0){
                if (cifra == n){
                    return posicion;
                }
            }
            cifra = voltear % 10;
            voltear = voltear / 10;
            posicion++;
        }
        return -1;
    }


    /**
     * Va quitando numeros por dentras
     * 
     * @param x
     * @param j
     * @return El numero quitando los digitos que hemos dicho
     */
    public static long quitaPorDetras(long x, int j) {
        long numero = x;
        int n = j;
        while ( n > 0){
            numero = numero / 10;
            n--;
        }
        return numero;
    }

    /**
     * Va quitando numeros por delante
     * 
     * @param x
     * @param j
     * @return El numero quitando los digitos que hemos dicho
     */
    public static long quitaPorDelante(long x, int j) {
        long numero = x;
        int n = j;
        long voltear =  funciones_Matematica.voltea(numero);
        while ( n > 0){
            voltear = voltear / 10;
            n--;
        }
        voltear =  funciones_Matematica.voltea(voltear);
        return voltear;
    }



    /**
     * Va sumando numeros por detras
     * @param x
     * @param j
     * @return El numero sumando los digitos que hemos dicho
     */
    public static long pegaPorDetras(long x , long j) {
        long numero = x;
        long n = j;
        long aux = n;
        int contador = 0;
        while (aux > 0){
            aux /= 10;
            contador++;
        }
        while ( contador > 0){
            numero = (numero * 10);
            contador--;
        }
        numero = numero + n;
        return numero;
    }


    /**
     * Va sumando numeros por delante
     * @param x
     * @param j
     * @return El numero sumando los digitos que hemos dicho
     */
    public static long pegaPorDelante(long x ,long j) {
        long numero = x;
        long n = j;
        long aux = numero;
        int contador = 0;
        while (aux > 0){
            aux /= 10;
            contador++;
        }
        while ( contador > 0){
            n = (n * 10);
            contador--;
        }
        n = n + numero;
        return n;
    }

    /**
     * Coge el trozo de numero que le hemos indicado
     * 
     * @param x 
     * @return El trozo de numero restante
     */
    public static long trozoDeNumero(long x) {
        long numero = x;
        long voltear = 0;
        int resultado = 0;
        while (numero > 0){
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
        }
        int primeraCifra = (int) (voltear % 10);
        // Calcula la longitud de una cadena de caracteres : int posicionFinal = Integer.toString(voltear).length();
        int ultimaCifra = 0;
        while (voltear > 0){
                ultimaCifra = (int) (voltear % 10);
                voltear = voltear / 10;
        }
        resultado = (primeraCifra*10)+ultimaCifra;
        return resultado;
    }


    /**
     * Junta dos numeros que le digamos por pantalla
     * 
     * @param n1
     * @param n2
     * @return Los dos numeros en conjunto
     */
    public static long juntaNumeros(int n1, int n2) {
        int multiplicaPorCifra = 1;
        int aux = n2;
        while (aux > 0){
            multiplicaPorCifra = multiplicaPorCifra * 10;
            aux = aux / 10;
        }
        int resultado = (n1*multiplicaPorCifra)+n2;
        
        return resultado;
    }
} 
    