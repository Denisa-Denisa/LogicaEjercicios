package Ejercicios;


public class Ejercicio26 {

	public static void main(String[] args) {
		// GENERAR 1000 NUMEROS ALEATORIOS ENTRE 1 Y 10. CONTAR CUANTOS NUMEROS DE CADA HAN SALIDO.
		
		
		int[] contadores = new int[10]; 
		
		for (int i=1; i<= 1000; i++) {
			int n= (int) Math.ceil(Math.random()* 10); 
			contadores[n-1]++; 
			
			
		}
		
		for (int i=0; i<contadores.length; i++) {
			System.out.printf("Contador de %2d s: %3d\n" ,     // \n es para hacer un salto de linea es decir escribirlos uno debajo de otro , 2d significa para que los numeros quedenados bonito
					           i+1, contadores[i]);
		}
		
	}

}
