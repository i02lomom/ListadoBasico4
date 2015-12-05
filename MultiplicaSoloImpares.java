import utiles.*;
/**
 * Define la clase MultiplicaSoloImpares que multiplique 20 números impares leídos
 * desde teclado y muestre el resultado en pantalla. Define al menos los métodos
 * mostrarInstrucciones y leerImpar
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MultiplicaSoloImpares{
	public static void main(String[] args){
		int numero,producto=1;

		mostrarInstrucciones();
		for(int i=0;i<20;i++){
			numero=leerImpar();
			while(numero%2==0){
				System.out.println("\nError. El numero introducido es par\n");
				numero=leerImpar();
			}
			producto*=numero;
		}
		System.out.println("\nEl resultado es: " + producto + "\n");
	}

	/**
	 * Imprime por pantalla las intrucciones del programa
	 */
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca 20 numeros impares y se calculara el producto: \n");
	}

	/**
	 * Lee del teclado el número introducido
	 * @return número introducido por teclado
	 */
	static int leerImpar(){
		return Teclado.leerEntero("\nIntroduzca un numero impar: ");
	}
}
