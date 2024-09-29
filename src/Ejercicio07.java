
public class Ejercicio07 {

	public static void main(String[] args) {

		short age = 12;

		if (age >= 0 && age <= 3) {

			System.out.println("Está en casa con sus padres.");

		} else if (age >= 4 && age <= 6) {

			System.out.println("Está estudiando en el Jardin.");

		} else if (age >= 7 && age <= 12) {

			System.out.println("Está estudiando en el Primaria.");

		} else if (age >= 13 && age <= 17) {

			System.out.println("Está estudiando en la secundaria.");

		} else if (age > 17) {

			System.out.println("Posiblemente este estudios superiores");

		} else {

			System.out.println("Error al ingresar la edad");

		}

	}

}
