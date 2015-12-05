import utiles.*;
/**
 * Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos. La nota
 * será un número decimal comprendido entre 0 y 10, ambos inclusive. Utiliza métodos.
 * Al finalizar el programa deberá mostrar:
 *
 * a. Total de notas
 * b. Número de aprobados
 * c. Número de suspensos
 * d. Nota máxima
 * e. Nota mínima
 * f. Media
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Alumnos{
	public static void main(String[] args){
		boolean respuesta=true;
		int i,aprobados=0,suspensos=0;
		double numero,maxima=0,minima=9,media=0;

		while(respuesta){
			mostrarInstrucciones();
			for(i=0;i<30;i++){
				numero=generarAleatorio();
				mostrarNumero(numero);
				aprobados=comprobarAprobados(numero,aprobados);
				suspensos=comprobarSuspensos(numero,suspensos);
				maxima=comprobarNotaMaxima(numero,maxima);
				minima=comprobarNotaMinima(numero,minima);
				media+=numero;
			}
			media=media/i;
			mostrarResultados(i,aprobados,suspensos,maxima,minima,media);
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
		System.out.println("\nSe van a generar automaticamente las notas de 30 alumnos\n");
		System.out.println("Se mostraran las notas, aprobados, suspensos, etc.\n");
	}

	/**
	 * Genera un número aleatorio entre 0 y 10
	 * @return número aleatorio generado
	 */
	static double generarAleatorio(){
		return (Math.random()*10);
	}

	/**
	 * Muestra por pantalla el número pasado
	 * @param número a mostrar
	 */
	static void mostrarNumero(double numero){
		System.out.print(numero + "\t");
	}

	/**
	 * Comprueba si el número es mayor que 5. En ese caso se aumenta el número aprobados
	 * @param numero nota a comprobar
	 * @param aprobados número de aprobados
	 * @return aprobados número de aprobados
	 */
	static int comprobarAprobados(double numero,int aprobados){
		if(numero>=5)
			aprobados++;
		return aprobados;
	}

	/**
	 * Comprueba si el número es menor que 5. En ese caso se aumenta el número suspensos
	 * @param numero nota a comprobar
	 * @param suspensos número de suspensos
	 * @return aprobados número de suspensos
	 */
	static int comprobarSuspensos(double numero,int suspensos){
		if(numero<5)
			suspensos++;
		return suspensos;
	}

	/**
	 * Comprueba si el número es mayor que maxima, en ese caso de devuelve el número
	 * ya que es la nueva nota máxima. En caso contrario se devuelve maxima
	 * @param numero nota a comprobar
	 * @param maxima número que actualmente es la nota máxima
	 * @return numero si es mayor que maxima, sino se devuelve maxima
	 */
	static double comprobarNotaMaxima(double numero,double maxima){
		if(numero>maxima)
			return numero;
		else
			return maxima;
	}

	/**
	 * Comprueba si el número es menor que minima, en ese caso de devuelve el número
	 * ya que es la nueva nota mínima. En caso contrario se devuelve minima
	 * @param numero nota a comprobar
	 * @param minima número que actualmente es la nota mínima
	 * @return numero si es menor que minima, sino se devuelve minima
	 */
	static double comprobarNotaMinima(double numero,double minima){
		if(numero<minima)
			return numero;
		else
			return minima;
	}

	/**
	 * Muestra por pantalla todos los datos calculados: total de notas, aprobados, suspensos,
	 * nota máxima, nota mínima y nota media.
	 * @param i total de notas
	 * @param aprobados número de aprobados
	 * @param suspensos número de suspensos
	 * @param maxima nota máxima
	 * @param minima nota mínima
	 * @param media nota media
	 */
	static void mostrarResultados(int i,int aprobados,int suspensos,double maxima,double minima,double media){
		System.out.println("\nNumero total de notas: "+i);
		System.out.println("\nNumero de alumnos aprobados: "+aprobados);
		System.out.println("\nNumero de alumnos suspensos: "+suspensos);
		System.out.println("\nNota maxima: "+maxima);
		System.out.println("\nNota minima: "+minima);
		System.out.println("\nNota media: "+media);
	}
}
