package Ejercicios;


public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Crea un array de animales: perro, gato, tortuga. a. Escribe el segundo
		 * animal. b. A�ade un nuevo animal, por ejemplo, elefante. c. Sustituye tortuga
		 * por camello. d. Intercambia dos posiciones de forma aleatoria
		 */

		String[] animales = { "perro", "gato", "tortuga" };

		System.out.println(animales[1]);

		// c
		animales[2] = "camello";

		// d
		int pos1 = 1;
		int pos2 = 2;

		String aux = animales[1];
		animales[1] = animales[2];
		animales[2] = aux;

		System.out.println(animales[1]);
		System.out.println(animales[2]);
	}

}
