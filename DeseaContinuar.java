import utiles.*;
/**
 * Define la clase DeseaContinuar que realice la siguiente pregunta: ¿Desea continuar?
 * (s/n). En caso de que el usuario indique una s (minúscula o mayúscula) el programa
 * seguirá preguntando. En otro caso, que se salga del programa. Para ello implementa el
 * método continuar que devuelva true en caso de introducir una s, y false en caso
 * contrario.
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class DeseaContinuar{
	public static void main(String[] args){
		boolean respuesta=true;

		while(respuesta){
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
}
