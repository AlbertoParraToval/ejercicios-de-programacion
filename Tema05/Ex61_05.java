public class Ex61_05 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la V (mayor o igual a 3): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int anchura = 3;
    int base = 0;
    int espaciosDelante = 0;
    
        if (altura < 3){
        System.out.print("La altura debe ser mayor o igual a 3. ");
        }else{
        while (altura  > 0){
        /**Espacios por delante**/
        for (int i = 0;i < espaciosDelante;i++){
            System.out.print(" ");
        }
        /**Primera parte de la V**/
        for (int i = 0; i < anchura;i++){
        System.out.print("*");
        }
        /**Espacios Dentras**/
        for (int i = 0;i < altura -1;i++){
            System.out.print(" ");
        }
        /**Espacios por delante**/
        for (int i = 0;i < altura -1;i++){
            System.out.print(" ");
        }
        /**Segunda parte de la V**/
        for (int i = 0; i < anchura;i++){
        System.out.print("*");
        }
        System.out.println("");
        altura--;
        espaciosDelante++;
            }
        }
    }
}   

