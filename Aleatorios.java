import utiles.*;
/**
 * Define la clase Aleatorios que de forma repetitiva muestre un número aleatorio entre
 * un mínimo y un máximo. Define el método generarAleatorio(min, max)
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Aleatorios{
	public static void main(String[] args){
		int minimo,maximo;
		boolean respuesta=true;

		while(respuesta){
			minimo=Teclado.leerEntero("\nIntroduzca el minimo: ");
			maximo=Teclado.leerEntero("\nIntroduzca el maximo: ");
			System.out.println("\nEl numero generado es: "+ generarAleatorio(minimo,maximo));
			respuesta=continuar();
		}
	}

	/**
	 * Pregunta al usuario si desea continuar pidiendole un caracter (s/n)
	 * @return true si la respuesta es s o S y false en cualquier otro caso
	 */
	static boolean continuar(){
		char respuesta;
		respuesta=Teclado.leerCaracter("\nDesea continuar? (s/n) : ");

		if(respuesta=='s' || respuesta=='S')
			return true;
		else
			return false;
	}

	/**
	 * Genera un número aleatorio entre el mínimo y el máximo
	 * @param minimo el número mínimo
	 * @param maximo el número máximo
	 * @return número aleatorio entre el mínimo y el máximo
	 */
	static int generarAleatorio(int minimo,int maximo){
		return(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
	}
}
