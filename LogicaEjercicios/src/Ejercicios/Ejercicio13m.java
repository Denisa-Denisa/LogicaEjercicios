package Ejercicios;


import java.util.Scanner;

public class Ejercicio13m {

	public static void main(String[] args) {
		/*
		 * ESCRIBIR UN MENU CON LAS SIGUIENTES OPCIONES: 1. CALCULAR EL ARE DE UN
		 * TRINAGULO 2. CALCULAR EL ARE DE UN RECTANGULO 3. CALCULAR EL ARE DE UN
		 * CIRCULO 0. SALIR
		 * 
		 * EL PROGRAMA QUEDA PENDIENTE DE QUE EL USUARIO SELECCIONE UNA OPCION ---:
		 * 
		 * SOLO SE PUEDE SALIR DEL PROGRAMA SI EL USUARIO ESCOGE LA OPCION : 0
		 * 
		 * PARA LA OPCION 1: debera pedir la base y la altura y escribir el resultado.
		 * areaTriangulo = base * altura / 2
		 * 
		 * PARA LA OPCION 2: debera pedir lado pequeño y lado grande y escribir el area.
		 * areaRectagulo = ladoPeque�o * ladoGrande
		 * 
		 * PARA LA OPCION 3: debe pedir el radio del circulo y mostrar despues el
		 * resultado. areaCirculo = Pi * radio*radio
		 */

		int op;
		Scanner sc = new Scanner(System.in);
		do {
			do {
				escribirMenu();
				op = pedirOpcion(sc);
			} while (op < 0 || op > 3);
			if (op == 1) {
				calcularAreaTrianguloOpcion(sc);
			} else if (op == 2) {
				calcularAreaRectanguloOpcion(sc);
			} else if (op == 3) {
				calcularAreaCirculoOpcion(sc);
			} else {
				System.out.println("Fin del programa.");
			}
		} while (op != 0);
		sc.close();
	}

	public static void calcularAreaTrianguloOpcion(Scanner sc) {
		double base, altura, area;
		System.out.println("CALCULAR AREA DEL TRIANGULO");
		System.out.println("Introduce la base: ");
		base = pedirNumeroDecimal(sc);
		System.out.println("Introduce la altura: ");
		altura = pedirNumeroDecimal(sc);

		area = base * altura / 2;

		System.out.printf("El area del triangulo es: %.2f" + area);
		System.out.println();

	}

	public static void calcularAreaRectanguloOpcion(Scanner sc) {
		double ladoP, ladoG, area;
		System.out.println("CALCULAR AREA DEL RECTANGULO");
		System.out.println("Introduce el lado peque�o: ");
		ladoP = pedirNumeroDecimal(sc);
		System.out.println("Introduce el lado grande: ");
		ladoG = pedirNumeroDecimal(sc);

		area = ladoP * ladoG;

		System.out.printf("El area del rectangulo es: %.2f", area);
		System.out.println();

	}

	public static void calcularAreaCirculoOpcion(Scanner sc) {
		double radio, area;
		System.out.println("CALCULAR AREA DEL CIRCULO");
		System.out.println("Introduce el radio: ");
		radio = pedirNumeroDecimal(sc);

		area = 2 * Math.PI * radio * radio;

		System.out.printf("El area del circulo es: %.2f", area);
		System.out.println();

	}

	public static void escribirMenu() {
		System.out.println("1. Calcular el area de un triangulo.");
		System.out.println("2. Calcular el area de un rectangulo.");
		System.out.println("3. Calcular el area de un circulo.");
		System.out.println("0. Salir.");
	}

	public static int pedirOpcion(Scanner sc) {
		int op;

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Opcion no disponible.");
		}
		op = Integer.parseInt(sc.nextLine());
		return op;
	}

	public static double pedirNumeroDecimal(Scanner sc) {
		double dec;

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Error. Introduce un numero decimal.");
		}
		dec = Double.parseDouble(sc.nextLine().replace(',', '.'));

		return dec;
	}
}
