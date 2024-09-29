
public class Ejercicio11_While_continue {

	
	
	public static void main(String[] args) {

		final int INICIO_CONTADOR = 40;
		final int FIN_CONTADOR = 30;
				
		int contador = INICIO_CONTADOR;
		int suma = 0;

		while (contador >= FIN_CONTADOR) {
			System.out.println("Cuenta abajo: " + contador);
			
			if (contador % 4 != 0) {
				contador -= 1;
				continue;
			}
			
			contador -= 1;
			suma += 2;
			
		}
		System.out.println("Suma total: " + suma);

	}
}
