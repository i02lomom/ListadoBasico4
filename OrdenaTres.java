import utiles.*;
/**
 * Define la clase OrdenaTres que ordene tres números enteros introducidos por teclado
 * y los muestre por pantalla de forma decreciente. Se le preguntará al usuario si quiere
 * repetir el programa. Utiliza métodos (deseaContinuar, leerTresEnteros,
 * mostrarResultados…)
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class OrdenaTres{
	public static void main(String[] args){
		boolean respuesta=true;

		while(respuesta){
			mostrarInstrucciones();
			leerTresEnteros();
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
		System.out.println("\nIntroduzca los valores de tres numeros y se mostraran ordenados de mayor a menor\n");
	}

	/**
	 * Pide al usuario tres números enteros
	 */
	static void leerTresEnteros(){
		int n1,n2,n3;

		n1=Teclado.leerEntero("\nIntroduzca el primer numero: ");
		n2=Teclado.leerEntero("\nIntroduzca el segundo numero: ");
		n3=Teclado.leerEntero("\nIntroduzca el tercer numero: ");

		mostrarResultados(n1,n2,n3);
	}

	/**
	 * Muestra los tres números enteros en orden
	 * @param n1 primer número
	 * @param n2 segundo número
	 * @param n3 tercer número
	 */
	static void mostrarResultados(int n1,int n2,int n3){
		if(n1>n2 && n1>n3 && n2>n3){
			System.out.print("\nLos numeros de mayor a menor son: " + n1 + " " + n2 +" " + n3 + "\n");
		}
		else if(n1>n2 && n1>n3 && n2<n3){
			System.out.print("\nLos numeros de mayor a menor son: " + n1 + " " + n3 +" " + n2 + "\n");
		}
		else if(n2>n1 && n2>n3 && n1>n3){
			System.out.print("\nLos numeros de mayor a menor son: " + n2 + " " + n1 +" " + n3 + "\n");
		}
		else if(n2>n1 && n2>n3 && n1<n3){
			System.out.print("\nLos numeros de mayor a menor son: " + n2 + " " + n3 +" " + n1 + "\n");
		}
		else if(n3>n1 && n3>n2 && n1>n2){
			System.out.print("\nLos numeros de mayor a menor son: " + n3 + " " + n1 +" " + n2 + "\n");
		}
		else if(n3>n1 && n3>n2 && n1<n2){
			System.out.print("\nLos numeros de mayor a menor son: " + n3 + " " + n2 +" " + n1 + "\n");
		}
	}
}
