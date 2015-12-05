import utiles.*;
/**
 * Define la clase Resta que realice de forma repetitiva restas y las muestre, siempre y
 * cuando el usuario responda afirmativamente a la pregunta: ¿Desea continuar? (s/n).
 * Para ello utiliza un método continuar (ejercicio anterior) e implementa también el
 * método restar con los dos argumentos que sean los operandos. Ha de devolver su
 * diferencia.
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Resta{
	public static void main(String[] args){
		boolean respuesta=true;
		int numero1=1,numero2=1,resultado;

		while(respuesta){
			numero1=Teclado.leerEntero("\nIntroduzca el primer numero: ");
			numero2=Teclado.leerEntero("\nIntroduzca el segundo numero: ");
			System.out.println("\nLa resta de los numeros es: "+ restar(numero1,numero2));
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
	 * Calcula la resta de los dos números pasados como parámetro
	 * @param numero1 primer número
	 * @param numero2 segundo número
	 * @return numero1-numero2 resta de los dos números
	 */
	static int restar(int numero1,int numero2){
		return (numero1-numero2);
	}
}
