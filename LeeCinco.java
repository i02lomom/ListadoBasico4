import utiles.*;
/**
 * Define la clase LeeCinco que lea cinco valores numéricos y calcule su producto. Se le
 * preguntará al usuario si quiere repetir el programa. Utiliza métodos (deseaContinuar,
 * leerCincoNumeros, System.out.println(El producto es:  + calcularResultado()…)
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class LeeCinco{
	public static void main(String[] args){
		boolean respuesta=true;

		while(respuesta){
			System.out.println("\n\nEl producto es: " + calcularResultado());
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
	 * Llama al método leerCincoNumeros y devuelve su producto
	 * @return producto de los cinco números leidos en leerCincoNumeros
	 */
	static int calcularResultado(){
		return leerCincoNumeros();
	}

	/**
	 * Lee conco numeros dados por el usuario y calcula su producto
	 * @return producto de los cinco números
	 */
	static int leerCincoNumeros(){
		int numero,resultado=1;

		for(int i=0;i<5;i++){
			numero=Teclado.leerEntero("\nIntroduzca un numero: ");
			resultado*=numero;	
		}
		return resultado;
	}
}
