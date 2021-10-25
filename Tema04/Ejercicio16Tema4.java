/**
* 	Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
	está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
	con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
	puntos. Las preguntas contestadas con falso no suman puntos. A continuación
	se listan las preguntas del test.

*
* @author Alberto Parra 
*/
public class Ejercicio16Tema4 {
	public static void main(String[] args) {
		int puntos = 0;
		String respuesta;
		System.out.print("Con este test vas a saber si tu novi@ te engaña o te es fiel, suerte!!");
		
		//Pregunta 1
		System.out.println("1. ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		} 
		
		
		//Pregunta 2
		System.out.println("2. Ha aumentado sus gastos de vestuario ");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 3
		System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti ");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 4
		System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) " );
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 5
		System.out.println("5. No te deja que mires la agenda de su teléfono móvil ");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 6
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 7
		System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a ");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 8
		System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo ");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 9
		System.out.println("9.  Has notado que últimamente se perfuma más ");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 10
		System.out.println("10.Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
		System.out.println("a) Verdadero\nb) Falso"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		//Multiplicamos los resultados del cuestionario por 3 para que el máximo de puntos sea 30
		int puntuacion = puntos * 3;
		if ((puntuacion >= 0) && (puntuacion <= 10)) {
		System.out.println("El resultado es de " + puntuacion + "\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		} else if ((puntuacion >= 11) && (puntuacion <= 22)) {
      System.out.println("El resultado es de " + puntuacion +"\nQuizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		} else if ((puntuacion >= 23) && (puntuacion <= 30)) {
	  System.out.println("El resultado es de test es de " + puntuacion + " \nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues unpoco más y averigües que es lo que está pasando por su cabeza.");
		} 
 }
}
