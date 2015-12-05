import utiles.*;
/**
 * Crea la clase Multiplos17Hasta200 que utilice el bucle for.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Multiplos17Hasta200{
	public static void main(String[] args){
		int i=0;
		System.out.println("\nMultiplos de 17 hasta 200: \n");
		for(;;){
			i++;
			if (i > 200)
				break;
			if (i % 17 != 0)
				continue;
		System.out.print("\t" + i);
		}
		System.out.print("\n");
	}
}
