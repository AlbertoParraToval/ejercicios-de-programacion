/**
* 	Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
	que se imparten en el curso. Cada pregunta acertada sumará un punto. El
	programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
	tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
	en las diferentes asignaturas del curso.
*
* @author Alberto Parra 
*/
public class Ejercicio12Tema4 {
	public static void main(String[] args) {
		int puntos = 0;
		String respuesta;
		System.out.print("Acontinuación vas a hacer un test de 10 preguntas sobre algunas asignaturas, asique suerte compi :P ");
		
		//Pregunta 1
		System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
		System.out.println("a) int\nb) double\nc) float"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("b")) {
		puntos++;
		}
		
		
		//Pregunta 2
		System.out.println("2. ¿Cuales es el modelo de software más básico y sencillo?");
		System.out.println("a) Waterfall\nb) Evolution Prototype\nc) Spiral"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 3
		System.out.println("3. El sindrome del dedo blanco es debido a:");
		System.out.println("a) Agentes físicos\nb) Agentes Biológicos\nc) Enfermedades profesionales de la piel"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 4
		System.out.println("4. Pasa este número hexadecimal a octal: C127");
		System.out.println("a) 234457\nb) 150557\nc) 152392"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("b")) {
		puntos++;
		}
		
		//Pregunta 5
		System.out.println("5. ¿Cuántos tipos de organización de ficheros existen?");
		System.out.println("a) 3\nb) 4\nc) 2"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("a")) {
		puntos++;
		}
		
		//Pregunta 6
		System.out.println("6. ¿Cómo se divide el diseño de una base de datos?");
		System.out.println("a) Diseño Conceptual, Lógico y Físico.\nb) Diseño Conceptual, Físico y Lógico.\nc) Diseño Lógico, Conceptual y Físico."); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("b")) {
		puntos++;
		}
		
		//Pregunta 7
		System.out.println("7. ¿Qué es un riesgo laboral?");
		System.out.println("a) El daño que te haces en el trabajo\nb) Las posibilidades de verse en un accidente debido al cumplimiento de tus funciones de trabajo\nc) Todos los accidentes de trabajo"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("b")) {
		puntos++;
		}
		
		//Pregunta 8
		System.out.println("8. ¿Qué es el software?");
		System.out.println("a) La parte física del ordenador\nb) Una invención de la gente, no existe realmente\nc) Conjunto de código informático que se apoya en el hardware."); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("c")) {
		puntos++;
		}
		
		//Pregunta 9
		System.out.println("9. ¿Cúantos números tiene el sistema hexadecimal?");
		System.out.println("a) 16\nb) 8\nc) 6"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("b")) {
		puntos++;
		}
		
		//Pregunta 10
		System.out.println("10. Se pueden clasificar los daños a la salud de los trabajadores en:");
		System.out.println("a) Enfermedades y patologías\nb) Patologías o lesiones\nc) Patologías específicas o inespecíficas"); 
		System.out.print("---->>> ");
		respuesta = System.console().readLine();
		if (respuesta.equals("c")) {
		puntos++;
		}
		
		System.out.print("Tu nota es de " + puntos + " puntos.");	
 }
}
