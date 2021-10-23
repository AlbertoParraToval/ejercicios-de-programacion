/**
* 	Escribe un programa que dada una hora determinada (horas y minutos), calcule
	los segundos que faltan para llegar a la medianoche.

*
* @author Alberto Parra 
*/
public class Ejercicio11Tema4 {
	public static void main(String[] args) {
		
		System.out.print("Introduce la hora que desee, por favor");
	 
    
		System.out.print("hora: ");
		int hora = Integer.parseInt(System.console().readLine());  
    
		System.out.print("minuto: ");
		int min = Integer.parseInt(System.console().readLine());

		int segundosTranscurridos =((hora * 3600) + (min * 60));
		int segundosHastaMedianoche =((24 * 3600) - segundosTranscurridos);
            
		System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, min, segundosHastaMedianoche);	
 }
}
