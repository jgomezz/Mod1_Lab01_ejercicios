
public class Ejercicio04 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int edadPedro = 18;
		int edadSilvia = 17;

		// Primera comparación
		System.out.println("Primera Comparación:");
		System.out.println("¿Edad de Pedro es mayor que la de Silvia? " + (edadPedro > edadSilvia));
		System.out.println("¿Ambas edades son iguales? " + (edadPedro == edadSilvia));
		System.out.println("¿Silvia tiene una edad mayor o igual a Pedro? " + (edadSilvia >= edadPedro));

		// Incrementar
		edadPedro += 4;
		edadSilvia -= 3;

		// Segunda comparación
		System.out.println("\nSegunda Comparación (después de modificar las edades):");
		System.out.println("¿Edad de Pedro es mayor que la de Silvia? " + (edadPedro > edadSilvia));
		System.out.println("¿Ambas edades son iguales? " + (edadPedro == edadSilvia));
		System.out.println("¿Silvia tiene una edad mayor o igual a Pedro? " + (edadSilvia >= edadPedro));
	}

}
