
public class Ejercicio13_For {

	public static void main(String[] args) {

		final int INICIO_CONTADOR = 2;
		final int FIN_CONTADOR = 50;

		// Declaración de variables

		int contador = 0;

		// Procesamiento

		for (contador = INICIO_CONTADOR; contador < FIN_CONTADOR; contador += 4) {
			if (contador % 3 == 0) {
				continue;
			} else {
				System.out.println(contador);
			}
		}

	}
}
