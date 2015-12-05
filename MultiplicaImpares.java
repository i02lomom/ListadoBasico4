import utiles.*;
/**
 * Define la clase MultiplicaImpares que multiplique los 20 primeros números impares y
 * muestre el resultado en pantalla.
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MultiplicaImpares{
	public static void main(String[] args){
		System.out.println("\n\nEl resultado de multiplicar los 20 primeros numeros impares es: " + multiplicarImpares());
	}

	/**
	 * Imprime por pantalla los 20 primeros números impares y calcula su producto
	 * @return producto de multiplicar los 20 primeros números impares
	 */
	static double multiplicarImpares(){
		double resultado=1;
		System.out.println("\nLos 20 primeros numeros impares son: \n");
		for(int i=1;i<=40;i+=2){
			resultado*=i;
			System.out.print(i+"\t");
		}
		return resultado;
	}
}
