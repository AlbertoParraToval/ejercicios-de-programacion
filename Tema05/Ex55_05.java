public class Ex55_05 {
    public static void main(String[] args) {
    System.out.print("Introduce la altura del Rombo por teclado: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine()) ;
    int altura =alturaIntroducida /2 +1;
    int espaciosDelante=alturaIntroducida /2 -1;
    int espaciosDentro= 2;
    // Mostramos el error si la alturaIntroducida < 3
    if ((alturaIntroducida <= 3) || ((alturaIntroducida %2)== 0)){
      System.out.print("La altura del Rombo debe ser un numero Impar mayor a 3.");
    }
    System.out.println("");
    //Parte superio del Rombo
    if (altura == alturaIntroducida /2 +1){
      for (int i = 1; i <= altura-1; i++){
        System.out.print(" ");
      }
      System.out.print("*");
    }
    System.out.println();
    altura =1;
    //Cuerpo superior del rombo
    while (altura < alturaIntroducida /2 + 1){
      
      for (int i=1 ; i <= espaciosDelante;i++ ){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int i = 1; i < espaciosDentro; i++ ){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
      
      altura++;
      espaciosDelante--;
      espaciosDentro+=2;
      
    }
    //Cuerpo inferior del rombo
    altura =2;
    espaciosDelante=1;
    espaciosDentro= alturaIntroducida - 3;
    
    while (altura < alturaIntroducida /2 +1){
      
      for (int i=1; i <= espaciosDelante;i++ ){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int i = 1; i < espaciosDentro; i++ ){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
      
      altura++;
      espaciosDelante++;
      espaciosDentro-=2;
      
    }
    //Parte inferior del rombo
    if (altura == alturaIntroducida /2 + 1){
      for (int i = 1; i <= altura - 1; i++){
        System.out.print(" ");
      }
      System.out.print("*");
    }
  }
}