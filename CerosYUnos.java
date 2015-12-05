import utiles.*;
/**
 * Define la clase CerosYUnos que lea una secuencia de ceros y unos. Mostrará el número
 * de ceros de la secuencia. Dejará de leer cuando el usuario introduzca el número 2.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class CerosYUnos{
	public static void main(String[] args){
		int numero,contador=0;

		do{
			numero=Teclado.leerEntero("\nIntroduzca numeros 0 o 1 (2 para salir): ");
			if(numero<0 || numero>2){
				System.out.println("\nError. Numero incorrecto.\n");
			}

			else{				
				contador=cuentaCeros(numero,contador);
			}
		}while(numero!=2);
		System.out.println("\nSe han introducido "+contador+" ceros\n");
	}

	/**
	* Comprueba si el número es cero. En ese caso se incrementa el contador
	* @param numero introducido por teclado
	* @param contador de ceros 
	* @return contador de ceros
	*/
	static int cuentaCeros(int numero,int contador){
		if(numero==0){
			contador++;
		}
		return contador;
	}
}
