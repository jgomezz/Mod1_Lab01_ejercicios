
public class Ejercicio03 {

	// Declaracion de constantes
	static final float IGV = 0.18f;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Declaracion de variables

		float precioComputadora = 4500.00F;

		float valorIGV;

		// Procesamiento
		
		valorIGV = precioComputadora * IGV;

		System.out.println("El valor del IGV de la computadora es: S/ " + valorIGV);

		precioComputadora += 300;

		valorIGV = precioComputadora * IGV;

		System.out.println("El valor del IGV de la computadora actualizada es: S/ " + valorIGV);
	}

}
