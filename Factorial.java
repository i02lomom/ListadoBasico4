import utiles.*;
/**
 * Define la clase Factorial que muestre el factorial de un número introducido por
 * teclado. (Factorial (4) = 4*3*2*1; Factorial (0) = 1) Realízalo con los tres bucles
 * (factorialFor(), factorialDoWhile(), factorialWhile())
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Factorial{
	public static void main(String[] args){
		int numero;

		mostrarInstrucciones();
		numero=Teclado.leerEntero("\nIntroduzca un numero: ");
		System.out.println("\nEl factorial de " + numero + " con For es: " + factorialFor(numero) + "\n");
		System.out.println("\nEl factorial de " + numero + " con Do-while es: " + factorialDoWhile(numero) + "\n");
		System.out.println("\nEl factorial de " + numero + " con While es: " + factorialWhile(numero) + "\n");
	}

	/**
	 * Imprime por pantalla las intrucciones del programa
	 */
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca un numero y se calculara el factorial\n");
	}

	/**
	 * Calcula el factorial con un bucle for
	 * @param numero del cual calcularemos el factorial
	 * @return resultado factorial del número dado
	 */
	static int factorialFor(int numero){
		int resultado=1;

		for(;numero>0;numero--){
			resultado*=numero;
		}
		return resultado;
	}

	/**
	 * Calcula el factorial con un bucle do-while
	 * @param numero: numero del cual calcularemos el factorial
	 * @return resultado: factorial del número dado
	 */
	static int factorialDoWhile(int numero){
		int resultado=1;

		do{
			resultado*=numero;
			numero--;
		}while(numero>0);
		return resultado;
	}

	/**
	 * Calcula el factorial con un bucle while
	 * @param numero del cual calcularemos el factorial
	 * @return resultado factorial del número dado
	 */
	static int factorialWhile(int numero){
		int resultado=1;

		while(numero>0){
			resultado*=numero;
			numero--;
		}
		return resultado;
	}
}
