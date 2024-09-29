
public class Ejercicio14_Array {

	public static void main(String[] args) {

		int numeros[] = new int[10];

		// Inicializo
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = -1;
		}
		
		// Asigno 3, 6, ....
		for (int i = 0 , valor = 3 ; i < numeros.length; i++ , valor +=3) {
			numeros[i] = valor;
		}
		
		// Suma total
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			
			suma += numeros[i];
		}
		
		System.out.println(suma);
		

		
	}
}
