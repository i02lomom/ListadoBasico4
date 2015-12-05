import utiles.*;
/**
 * Define la clase IvaConMetodos que calcule los impuestos que se aplican a un precio
 * base en función de si el iva es superreducido (4%), reducido (10%) o general (21%).
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class IvaConMetodos{
	public static void main(String[] args){
		char iva;
		double precio,resultado;
		boolean respuesta=true;

		while(respuesta){
			precio=pedirPrecio();
			iva=pedirIVA();
			resultado=calcularIva(precio,iva);
			System.out.printf("\n%s %.1f %s %.1f %s","El IVA a aplicar sobre ",precio," es: ",resultado,"\n");
			respuesta=continuar();
		}
	}

	/**
	 * Pregunta al usuario si desea continuar pidiendole un caracter (s/n)
	 * @return true si la respuesta es s o S y false en cualquier otro caso
	 */
	static boolean continuar(){
		char respuesta;
		respuesta=Teclado.leerCaracter("\nDesea continuar? (s/n) : ");

		if(respuesta=='s' || respuesta=='S')
			return true;
		else
			return false;
	}

	/**
	 * Se pide el precio sobre el que se calculará el IVA, éste debe ser mayor que cero
	 * @return precio introducido por el usuario
	 */
	static double pedirPrecio(){
		double precio;

		do{
			System.out.println("\nVamos a calcular el IVA sobre un precio base");
			precio=Teclado.leerDecimal("\nPrecio base del articulo (mayor que cero): ");
			if(precio<0)
				System.out.println("\nError. El numero introducido es menor que cero");
		}while(precio<0);
		return precio;
	}

	/**
	 * Se pide el tipo de iva que se aplicará
	 * @return iva caracter que representa el tipo de iva a aplicar
	 */
	static char pedirIVA(){
		char iva;

		do{
			iva=Teclado.leerCaracter("\nIndica el tipo de iva: super reducido, reducido o general (s/r/g): ");
			if(iva!='s' && iva!='S' && iva!='r' && iva!='R' && iva!='g' && iva!='G')
				System.out.println("\nError. El caracter introducido es incorrecto");
		}while(iva!='s' && iva!='S' && iva!='r' && iva!='R' && iva!='g' && iva!='G');
		return iva;
	}

	/**
	 * Se calcula el iva en función del caracter (s/r/g)
	 * @param precio al que aplicaremos el iva
	 * @param iva tipo de iva (s/r/g)
	 * @return resultado cantidad destinada al iva 
	 */
	static double calcularIva(double precio,char iva){
		double resultado=0;

		if(iva=='s' || iva=='S')
			resultado=(precio*4)/100;
		else if(iva=='r' || iva=='R')
			resultado=(precio*10)/100;
		else if(iva=='g' || iva=='G')
			resultado=(precio*21)/100;
		return resultado;
	}
}
