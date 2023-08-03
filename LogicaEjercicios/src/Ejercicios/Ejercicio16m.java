package Ejercicios;


public class Ejercicio16m {

	public static void main(String[] args) {
		/*
		 * CREA DOS ARRAYS DE TAMAÑO 10
		 * LLENALOS CON NUMEROS ALEATORIOS ENTRE 1 Y 50
		 * CREA UNA FUNCION QUE PASANDOLE LOS DOS ARRAYS DEVUELVA LA SUMA DE LOS DOS ARRAYS PORISION POR POSICION
		 * ESCRIBIR TODOS LOS ARRAYS POR PANTALLA
		 */
		
		
		final int CANTIDAD = 10;
		final int VALOR_MINIMO = 1;
		final int VALOR_MAXIMO = 50;
		int[] array1, array2, suma;
		
		array1 = crearArrayNumerosAleatorios(CANTIDAD, VALOR_MINIMO, VALOR_MAXIMO);
		array2 = crearArrayNumerosAleatorios(CANTIDAD, VALOR_MINIMO, VALOR_MAXIMO);
	
		suma = sumar(array1, array2);
		
		System.out.print("Array 1: ");
		escribirArray(array1);
		System.out.println();
		System.out.print("Array 2: ");
		escribirArray(array2);
		System.out.println();
		System.out.print("Suma   : ");
		escribirArray(suma);
		System.out.println();
	}
	
	public static void escribirArray(int[] vector) {
		for(int i=0; i<vector.length;i++) {
			System.out.printf("%2d ", vector[i]);
		}
	}
	
	public static int[] sumar(int[] vector1, int[] vector2) {
		int[] suma = new int[vector1.length];
		
		for(int i=0; i<suma.length;i++) {
			suma[i] = vector1[i] + vector2[i];
		}
		
		return suma;
	}
	
	public static int[] crearArrayNumerosAleatorios(int cantidad, 
													int valorMinimo, 
													int valorMaximo) {
		int[] array = new int[cantidad];
		for(int i=0; i<array.length; i++) {
			array[i] = dameNumeroAleatorio(valorMinimo, valorMaximo);
		}
		return array;
	}
	
	public static int dameNumeroAleatorio(int minimo, int maximo) {
		return (int) Math.floor(Math.random() * (maximo - minimo + 1)) + minimo;
	}
}
