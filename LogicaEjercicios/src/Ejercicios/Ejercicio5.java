package Ejercicios;


import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * PEDIR 3 NUMEROS QUE REPRESENTA EL DIA, MES, AÑO DE UNA FECHA COMPROBAR QUE LA
		 * FECHA INTRODUCIDA SEA CORRECTA
		 * 
		 * 2 - 28 dias 1,3,5,7,8,10,12 - 31 dias 4,6,9,11 - 30 dias
		 * 
		 */

		int dia, mes, year;

		Scanner sc = new Scanner(System.in);
		System.out.print("Escribir el dia: ");
		dia = sc.nextInt();
		System.out.print("Escribir el mes: ");
		mes = sc.nextInt();
		System.out.print("Escribir el año: ");
		year = sc.nextInt();

		if (year < 0) {
			System.out.println("Fecha inv�lida. Año incorrecto.");
		}

		if (mes < 1 || mes > 12) {
			System.out.println("Fecha invalida. Mes incorrecto.");
		}

		if (mes == 2 && (dia < 1 || dia > 28)) {
			System.out.println("Fecha incorrecta.");
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
			System.out.println("Fecha incorrecta.");
		} else {
			if (dia < 1 || dia > 31) {
				System.out.println("Fecha incorrecta.");
			}
		}

	}

}
