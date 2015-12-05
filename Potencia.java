import utiles.*;
/**
 * Define la clase Potencia que calcule y visualice la potencia de un número dada la base
 * y el exponente. Se le preguntará al usuario si quiere repetir el programa. Utiliza
 * métodos (deseaContinuar, mostrarInstrucciones…)
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Potencia{
	public static void main(String[] args){
		int base,exponente;
		boolean respuesta=true;

		while(respuesta){
			mostrarInstrucciones();
			base=Teclado.leerEntero("\nIntroduzca la base: ");
			exponente=Teclado.leerEntero("\nIntroduzca el exponente: ");
			System.out.println("\nEl resultado de " + base + " elevado a " + exponente + " es: " + calcularPotencia(base,exponente));
			respuesta=deseaContinuar();
		}
	}

	/**
	 * Pregunta al usuario si desea continuar pidiendole un caracter (s/n)
	 * @return true si la respuesta es s o S y false en cualquier otro caso
	 */
	static boolean deseaContinuar(){
		char respuesta;
		respuesta=Teclado.leerCaracter("\nDesea continuar? (s/n) : ");

		if(respuesta=='s' || respuesta=='S')
			return true;
		else
			return false;
	}

	/**
	 * Imprime por pantalla las intrucciones del programa
	 */
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca la base y el exponente y se le mostrara el resultado \n");
	}

	/**
	 * Calcula el resultado de elevar la base al exponente indicado
	 * @param base de la potencia
	 * @param exponente de la potencia
	 * @return resultado de elevar la base al exponente dado
	 */
	static double calcularPotencia(int base,int exponente){
		return Math.pow(base,exponente);
	}
}
