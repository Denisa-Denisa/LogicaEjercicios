package Ejercicios;


import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*
		 * PEDIR UN NUMERO POR TECLADO ESCRIBIR LO MULTIPLOS DE 7 QUE HAY HASTA EL
		 * NUMERO INTRODUCIDO
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		int numero = sc.nextInt();

		for (int i = 0; i <= numero; i += 7) {
			System.out.printf("%d ", i);
		}

		System.out.println();
		for (int i = 0; i <= numero; i++) {
			if (i % 7 == 0)
				System.out.printf("%d ", i);
		}
	}

}
