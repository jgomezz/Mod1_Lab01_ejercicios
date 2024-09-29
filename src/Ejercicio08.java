
public class Ejercicio08 {

	public static void main(String[] args) {

		byte edadEducacion = 5;

		// Procesamiento

		if (edadEducacion >= 0 && edadEducacion < 3) {
			System.out.println("La persona no va al colegio");
		} else if (edadEducacion >= 3 && edadEducacion <= 6) {
			System.out.println("La persona va al kinder");
		} else if (edadEducacion >= 7 && edadEducacion <= 12) {
			System.out.println("La persona va a la Primaria");
		} else if (edadEducacion >= 13 && edadEducacion <= 17) {
			System.out.println("La persona va a la Secundaria");
		} else if (edadEducacion > 17) {
			System.out.println("La persona realiza estudios superiores");
		} else {
			System.out.println("Error: Edad no valida");
		}

	}

}
