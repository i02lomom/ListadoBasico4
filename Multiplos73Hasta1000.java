import utiles.*;
/**
 * Crea la clase Multiplos73Hasta1000 que utilice el bucle do-while.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Multiplos73Hasta1000{
	public static void main(String[] args){
		int i=0;
		System.out.println("\nMultiplos de 73 hasta 1000: \n");
		do{
			i++;
			if (i > 1000)
				break;
			if (i % 73 != 0)
				continue;
		System.out.print("\t" + i);
		}while(true);
		System.out.print("\n");
	}
}
