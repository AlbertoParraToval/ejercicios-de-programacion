/**
 * Ejercicio: 32
 * Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
 * el carácter |. La anchura del sendero siempre es la misma, los dos caracteres
 * del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
 * espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
 * la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
 * Por cada metro de sendero - representado por una línea - puede que haya un
 * obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculos
 * aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
 * sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
 * O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
 * habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
 * 
 * @author Alberto Parra Toval
 * 
 * 
 */
public class Ex32_06 {
    public static void main(String[] args) { 
    System.out.println("El programa pinte por pantalla una serpiente con un (serpenteo) aleatorio.");
    System.out.print("Introduzca la longitud del sendero en metros: ");
    int longitud = Integer.parseInt(System.console().readLine()) ;
    int altura = longitud;
    int posicionObstaculo = 0;
    int espacioDelante = 6;
    String obstaculo ="";
    //Mientas la longitud sea mayor a 0
    while (longitud > 0){
        int probObstaculo=(int)(Math.random()*4); // PROB Obstaculo
        posicionObstaculo=(int)(Math.random()*6); // Pos Obstaculo
        for (int i = 0; i < espacioDelante; i++){ //El espacio entre cada obstaculo
        System.out.print(" ");
        }
        if ((probObstaculo == 0)||(probObstaculo == 1)){ // Si se da:
        obstaculo ="*";
        }else{
        obstaculo ="O";
        }
        if (longitud <= altura ){ // Si la longitud es menor o igual a la altura puede
        switch (posicionObstaculo){
            case 0: 
            System.out.print("|");
            for (int i = 0; i < 4; i++){ // La posicion del obstaculo
                if (i == posicionObstaculo){
                System.out.print(obstaculo);
                }else{
                System.out.print(" ");
                }
            }
            System.out.println("|");
            break;
            case 2:
            System.out.print("|");
            for (int i = 0; i < 4; i++){ // La posicion del obstaculo
                if (i == posicionObstaculo){
                System.out.print(obstaculo);
                }else{
                System.out.print(" ");
                }
            }
                System.out.println("|");
            break;
            case 3: 
            System.out.print("|");
            for (int i = 0; i < 4; i++){ // La posicion del obstaculo
                if (i == posicionObstaculo){
                System.out.print(obstaculo);
                }else{
                System.out.print(" ");
                }
            }
                System.out.println("|");
            break;
            case 4:
            System.out.print("|");
                for (int i = 0; i < 4; i++){   // La posicion del obstaculo
                if (i == posicionObstaculo){
                    System.out.print(obstaculo);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("|");
            break;
            default:
                System.out.print("|");
                for (int i = 0; i < 4; i++){   // La posicion del obstaculo
                System.out.print(" ");
                }
                System.out.println("|");
            break;
            }
        }
        espacioDelante += (int)(Math.random() * 3) - 1; 
        longitud--; // Le vas restando para que poco a poco se termine el bucle
        }
    }
}