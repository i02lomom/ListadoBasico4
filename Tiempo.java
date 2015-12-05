import utiles.*;
/**
 * Define la clase Tiempo que dada una medida de tiempo expresada en horas, minutos y
 * segundos con valores arbitrarios, elabore un programa que transforme dicha medida
 * en una expresión correcta. Por ejemplo, dada la medida 3h 118m 195s, se deberá
 * obtener como resultado 5h 1m 15s
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Tiempo{
	public static void main(String[] args){
		boolean respuesta=true;
		int horas,minutos,segundos,segundosEnTotal;

		while(respuesta){
			horas=generarAleatorio(10);
			minutos=generarAleatorio(200);
			segundos=generarAleatorio(200);
			mostrarTiempo(horas,minutos,segundos);
			segundosEnTotal=calcularSegundosTotales(horas,minutos,segundos);
			calcularHorasMinutosSegundos(segundosEnTotal);
			respuesta=deseaContinuar();
		}
	}

	/**
	 * Pregunta al usuario si desea continuar pidiendole un caracter (s/n)
	 * @return true si la respuesta es s o S y false en cualquier otro caso
	 */
	static boolean deseaContinuar(){
		char respuesta;
		respuesta=Teclado.leerCaracter("Desea continuar? (s/n) : ");

		if(respuesta=='s' || respuesta=='S')
			return true;
		else
			return false;
	}

	/**
	 * Genera un número aleatorio entre 0 y el factor
	 * @param factor número máximo que podremos generar
	 * @return número aleatorio generado
	 */
	static int generarAleatorio(int factor){
		return (int)(Math.random()*factor);
	}

	/**
	 * Calcula el total de segundos a partir de las horas, minutos y segundos
	 * @param horas
	 * @param minutos
	 * @param segundos
	 * @return número total de segundos
	 */
	static int calcularSegundosTotales(int horas,int minutos,int segundos){
		return ((horas*3600)+(minutos*60)+segundos);
	}

	/**
	 * Calcula las horas, minutos y segundos partiendo del número de segundos
	 * @param segundosEnTotal número de segundos
	 */
	static void calcularHorasMinutosSegundos(int segundosEnTotal){
		int horas,minutos,segundos;

		horas=segundosEnTotal/3600;
		segundosEnTotal=segundosEnTotal%3600;
		minutos=segundosEnTotal/60;
		segundosEnTotal=segundosEnTotal%60;
		segundos=segundosEnTotal;

		System.out.println("El tiempo expresado correctamente es: ");
		mostrarTiempo(horas,minutos,segundos);
	}

	/**
	 * Muestra por pantalla las horas, minutos y segundos pasados
	 * @param horas
	 * @param minutos
	 * @param segundos
	 */
	static void mostrarTiempo(int horas,int minutos,int segundos){
		System.out.println("\n"+horas+"h "+minutos+"m "+segundos+"s\n");
	}
}
