public class Ex61_05 {
    public static void main(String[] args) {
    System.out.println("El programa pinta por pantalla un rectángulo y el usuario puede interactuar.");
    int anchura=6;
    int altura=3;
    System.out.println("");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("");

    int opcion = 0;
    while(opcion != 4){
        /**Cabeza del rectangulo **/
        for (int i = 0; i < anchura ; i++){
            System.out.print("*");
        }
        /**Cuerpo del rectangulo **/
        for (int i = 0; i < altura-2; i++ ){
            System.out.println("");
            System.out.print("*");
        for (int aux = 0; aux < (anchura - 2);aux++){
            System.out.print(" ");
            } 
        System.out.print("*");
        }
        System.out.println("");
        /**Base del rectangulo **/
        for (int i = 0; i < anchura; i++){
            System.out.print("*");
        }
        System.out.println("");
    
        System.out.println("1. Agrandarlo");
        System.out.println("2. Achicarlo");
        System.out.println("3. Cambiar la orientación");
        System.out.println("4. Salir");
        System.out.println("Indique qué quiere hacer con el rectángulo: ");
        opcion = Integer.parseInt(System.console().readLine());
        switch(opcion){
            case 1:
                altura++;
                anchura++;
            break;
            case 2:
                if((altura >= 2)&&(anchura>=2)){
                altura--;
                anchura--;
                }
            break;
            case 3:
                int aux= anchura;
                anchura=altura;
                altura=aux;
            break;
            default:
            }
        }
    }
} 

