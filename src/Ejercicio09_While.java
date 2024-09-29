
public class Ejercicio09_While {

	
	
	public static void main(String[] args) {

		final int INICIO_CONTADOR = 200;
		final int FIN_CONTADOR = 13;
				
		int contador = INICIO_CONTADOR;

		while (contador >= FIN_CONTADOR) {
			contador -= 2;
			System.out.println("Cuenta abajo: " + contador);
			if (contador % 4 == 0) {
				System.out.println("Soy Multiplo de 4");
			}
		}
	}
}
