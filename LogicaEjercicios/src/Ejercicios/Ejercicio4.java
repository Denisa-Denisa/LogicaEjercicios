package Ejercicios;


import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * PEDIMOS UN NUMERO POR TECLADO ENTRE 1 Y 7 ESCRIBIMOS EL DIA DE LA SEMANA
		 * CORRESPONDIENTE A ESE NUMERO
		 */

		String[] dias = { "Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		int dia;
		String salida;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un numero entre 1 y 7:");
		dia = sc.nextInt();
		sc.close();

		if (dia == 1) {
			salida = "Lunes";
		} else if (dia == 2) {
			salida = "Martes";
		} else if (dia == 3) {
			salida = "Mi�rcoles";
		} else if (dia == 4) {
			salida = "Jueves";
		} else if (dia == 5) {
			salida = "Viernes";
		} else if (dia == 6) {
			salida = "Sabado";
		} else if (dia == 7) {
			salida = "Domingo";
		} else {
			salida = "Dia incorrecto.";
		}

		System.out.println(salida);

		if (dia >= 1 && dia <= 7)
			System.out.println(dias[dia - 1]);
		else
			System.out.println("Dia incorrecto.");
	}

}
