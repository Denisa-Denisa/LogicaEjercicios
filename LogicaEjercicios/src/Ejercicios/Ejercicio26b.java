package Ejercicios;


public class Ejercicio26b {

	public static void main(String[] args) {
		/*
			Generar 1000 n�meros aleatorios entre 1 y 10. 
			Contar cuantos n�meros de cada ha salido.
		*/
		int[] contadores = new int[10];
		
		for(int i=1; i<=1000; i++) {
			int n = (int) Math.ceil(Math.random() * 10);
			contadores[n-1]++;
		}
		
		for(int i=0; i<contadores.length; i++) {
			System.out.printf("Contador de %2d's: %3d\n", 
								i+1, contadores[i]);
		}
	}
	
	
	
}
