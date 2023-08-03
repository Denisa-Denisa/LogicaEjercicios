package Ejercicios;


public class Ejercicio29 {

	public static void main(String[] args) {
		// Crea un programa que:
		// a. Genere 10 números aleatorios entre 1 y 10.
		// b. Comprueba si el numero 5 fue uno de los números generados.
		// c. Si está el 5 escribe cuantas veces aparece

		
		
		
		boolean hayCincos = false; 
		int contarCincos=0;
		
		for(int i=1; i<=10; i++) {
			int n = (int) Math.ceil(Math.random() *10);
			if (n == 5) {
				hayCincos = true; 
				contarCincos++; 
			}
		}
		
		if (hayCincos) {
			System.out.println ("Hemos encontrado " + contarCincos + " cincos ");
			
		} else {
			System.out.println("No ha salido el cinco "); 
		}
		
		
		
	}

}
