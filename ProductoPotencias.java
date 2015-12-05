import utiles.*;
/**
 * Define la clase ProductoPotencias que calcule y visualice el producto de las potencias
 * de 2 entre 0 y 10.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class ProductoPotencias{
	public static void main(String[] args){
		long resultado,producto=1;

		for(int i=0;i<=10;i++){
			resultado=calcularProducto(i);
			System.out.print("\n2 elevado a " + i + " = " + resultado);
			producto*=resultado;
		}
		System.out.println("\n\nEl producto total es: " + producto);
	}

	/**
	 * Calcula el valor de 2 elevado al número i y los añade al acumulador llamado producto
	 * @param i contador que indica a cuanto debe elvarse 2
	 * @return producto acumulador que almacena el valor acumulado de las potencias
	 */
	static long calcularProducto(int i){
		return ((long) (Math.pow(2,i)));
	}
}
