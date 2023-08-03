package Ejercicios;


public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * CREAR UNA FUNCION QUE CALCULE EL FACTORIAL DE UN NUMERO
		 * !n = n * n-1 * n-2 * .... * 1
		 * 
		 * ejemplo: !5 = 5 * 4 * 3 * 2 * 1 = 120
		 */

		
		
		System.out.println("Factorial de 5 es : " + factorial(5));
		System.out.println("Factorial de 6 es : " + factorial(6));
		System.out.println("Factorial de 10 es : " + factorial(10));
	}

	public static int factorial(int numero) {
		int result = 1;
		int i = numero;
		while (i > 1) {
			result = result * i;
			i--;
		}
		return result;
	}
}
