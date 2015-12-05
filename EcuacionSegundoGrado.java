import utiles.*;
/**
 * Define la clase EcuacionSegundoGrado que muestre las soluciones de una ecuación de
 * segundo grado ax2+ bx + c = 0. Se le preguntará al usuario si quiere repetir el
 * programa. Utiliza métodos (deseaContinuar, leerCoeficientes, mostrarResultados…)
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class EcuacionSegundoGrado{
	public static void main(String[] args){
		int a,b,c;
		boolean respuesta=true;

		while(respuesta){
			mostrarInstrucciones();
			leerCoeficientes();
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
		System.out.println("\nUna ecuacion de segundo grado tiene esta forma: ax2 + bx + c = 0\n");
		System.out.println("\nIntroduzca los valores de a, b y c y se calculara el valor de x\n");
	}

	/**
	 * Pide al usuario los valores de a, b y c y llama al método mostrarResultados
	 */
	static void leerCoeficientes(){
		int a,b,c;

		a=Teclado.leerEntero("\nIntroduzca el valor de a: ");
		b=Teclado.leerEntero("\nIntroduzca el valor de b: ");
		c=Teclado.leerEntero("\nIntroduzca el valor de c: ");

		mostrarResultados(a,b,c);
	}

	/**
	* Calcula el discriminante y realiza cálculos en función de éste
	* @param a coeficiente dado por el usuario
	* @param b coeficiente dado por el usuario
	* @param c coeficiente dado por el usuario
	*/
	static void mostrarResultados(int a,int b,int c){
		double x1,x2,discriminante;

		discriminante=(Math.pow(b, 2)) - (4*a*c);
		if(a==0){ 
			System.out.println("\nNo es una ecuación de segundo grado\n");
		}
		else if(discriminante>0){
			x1= (-b + Math.sqrt(discriminante)) / (2*a);	//sqrt realiza la raiz cuadrada
			x2= (-b - Math.sqrt(discriminante)) / (2*a);
			System.out.println("\nx1 = " + x1 + "\nx2 = " + x2 + "\n");
		}
		else if(discriminante==0){
			x1=-b/(2*a);
			System.out.println("\nLa solución es doble: x = " + x1);
		}
		else{
			System.out.println("El discriminante es " +discriminante+ " (menor que cero). No riene solución real\n");
		}
	}
}
