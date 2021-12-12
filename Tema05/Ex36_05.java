public class Ex36_05 {
    public static void main(String[] args) {
        System.out.println("[Programa que dice si un numero es capicua]");
        System.out.print("Introduce el numero: ");
        long numeroIntroducido = Integer.parseInt(System.console().readLine());
        long numero = numeroIntroducido;
        long voltear = 0;
        // Le doy la vuelta al nuemro 
        while (numero > 0){
            voltear = (voltear * 10) + (numero % 10);
            numero /= 10;
        }

        if (voltear == numeroIntroducido ) { // Si es igual es capicua
            System.out.println("El numero "+ numeroIntroducido + " es capicua");
        } else{ // Sino es igual no es capicua
            System.out.println("El numero " + numeroIntroducido + " no es capicua");
        }
    }
}
    

