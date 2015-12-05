import utiles.*;
/**
 * Define la clase Pares que de forma repetitiva indique si un número es par o impar.
 * Define el método esPar(int)
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Pares{
	public static void main(String[] args){
		int numero;
		boolean par,respuesta=true;

		while(respuesta){
			numero=Teclado.leerEntero("\nIntroduzca un numero: ");
			par=esPar(numero);
			if(par)
				System.out.println("\nEl numero introducido es par\n");
			else
				System.out.println("\nEl numero introducido es impar\n");
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
	 * Comprueba si el número pasado es par y en ese caso devuelve true
	 * @param numero que debemos comprobar
	 * @return true si el número es par y false si no lo es
	 */
	static boolean esPar(int numero){
		if(numero%2==0)
			return true;
		else
			return false;
	}
}
