package Ejercicios;


public class Ejercicio29b {

	public static void main(String[] args) {
		/*
		Crea un programa que:
			a. Genere 10 n�meros aleatorios entre 1 y 10.
			b. Comprueba si el numero 5 fue uno de los 
			   n�meros generados.
			c. Si est� el 5 escribe cuantas veces aparece.
		*/
		boolean hayCinco = false;
		int contarCincos = 0;
		for(int i=1; i<=10; i++) {
			int n = (int) Math.ceil(Math.random() * 10);
			if (n == 5) {
				hayCinco = true;
				contarCincos++;
			}
		}
		
		if (hayCinco) {
			System.out.println("Hemos encontrado " + 
									contarCincos + " cincos.");
		} else {
			System.out.println("No ha salido el cinco.");
		}
	}

}
