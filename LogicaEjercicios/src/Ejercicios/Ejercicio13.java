package Ejercicios;


public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Crea un array cuyos elementos sea los d�as de la semana. Escr�belos separados
		 * por coma.
		 */

		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		for (int i = 0; i < dias.length; i++) {
			System.out.print(dias[i]);
			if (i < dias.length - 1) {
				System.out.print(", ");
			}
		}
	}

}
