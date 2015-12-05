import utiles.*;
/**
 * Define la clase Sumar2 que realice una suma y la muestre. Para ello implementa el
 * método sumar con los dos argumentos que sean los sumandos. Ha de devolver su
 * suma. Documéntalo correctamente (@param y @return)
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Sumar2{
	public static void main(String[] args){
		int numero1,numero2;

		numero1=Teclado.leerEntero("\nIntroduzca el primer numero: ");
		numero2=Teclado.leerEntero("\nIntroduzca el segundo numero: ");

		System.out.println("\nLa suma de los numeros es: "+sumar(numero1,numero2));
	}

	/**
	 * Calcula la suma de los dos números pasados como parámetro
	 * @param numero1 primer sumando
	 * @param numero2 segundo sumando
	 * @return numero1+numero2 suma de los dos números
	 */
	static int sumar(int numero1,int numero2){
		return (numero1+numero2);
	}
}
