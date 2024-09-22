
public class Ejercicio05 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		boolean continuaIncendio = true;

		boolean noApoyo = true;

		boolean habraProblemas = continuaIncendio && noApoyo;
		
		System.out.println("¿Tenemos un problema?" + habraProblemas);

		boolean usarLinea2 = true;

		boolean usarTransportePublico = false;

		boolean podrasViajar = usarLinea2 ||  usarTransportePublico;

		System.out.println("¿Podras viajas?" + podrasViajar);

	}

}
