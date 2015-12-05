import utiles.*;
/**
 * Define la clase Sumar que realice una suma y la muestre. Para ello implementa el
 * método sumar que devuelva la suma de dos números, solicitados por teclado (sin
 * argumentos) . Documéntalo correctamente (@return)
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Sumar{
	public static void main(String[] args){
		System.out.println("\nLa suma de los numeros es: "+sumar());
	}

	/**
	 * Calcula la suma de los dos números introducidos por teclado
	 * @return numero1+numero2 suma de los dos números
	 */
	static int sumar(){
		int numero1,numero2;

		numero1=Teclado.leerEntero("\nIntroduzca el primer numero: ");
		numero2=Teclado.leerEntero("\nIntroduzca el segundo numero: ");

		return (numero1+numero2);
	}
}
