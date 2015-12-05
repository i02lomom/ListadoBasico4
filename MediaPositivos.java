import utiles.*;
/**
 * Define la clase MediaPositivos que calcule la media de una serie de números positivos,
 * introducidos por teclado. Dejará de leer cuando el usuario introduzca el 0. Utiliza
 * métodos.
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MediaPositivos{
	public static void main(String[] args){
		mostrarInstrucciones();
		System.out.println("\nLa media es: "+ calcularMedia() +"\n");
	}

	/**
	 * Imprime por pantalla las intrucciones del programa
	 */
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca numeros positivos y se calculara la media (0 para terminar): \n");
	}

	/**
	 * Pide por teclado numeros positivos hasta que se introduce un cero y luego se calcula la media
	 * @return media de los numeros introducidos
	 */
	static float calcularMedia(){
		int i=0,numero=1;
		float media=0;

		for(i=0;numero!=0;i++){
			numero=Teclado.leerEntero("\nIntroduzca un numero positivo: ");
			while(numero<0){
				System.out.println("\nError. El numero introducido es menor que cero\n");
				numero=Teclado.leerEntero("\nIntroduzca un numero positivo: ");
			}
			media+=numero;
		}
		return (media/(i-1));
	}
}
