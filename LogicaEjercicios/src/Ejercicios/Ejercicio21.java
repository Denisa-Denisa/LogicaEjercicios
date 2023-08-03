package Ejercicios;


public class Ejercicio21 {

	public static void main(String[] args) {
		//  GENERA 1000 NUMEROS ALEATORIO ENTRE 1 Y 100. GUARDA EN UN ARRAY LOS NUMEROS DIVISIBLES POR 7 U 11. 
		
		
		
		byte [] numeros = new byte [1000];
		int j =0;
		for(int i=1; i<=1000; i++) {
			byte n = (byte) Math.ceil(Math.random() * 100); 
			if (n % 7 == 0 || n % 11 == 0) {
				numeros[j] = n;
				j++;
				
			}
			
		}
		
		for(int i=0; numeros[i] !=0; i++) {
			System.out.println(numeros[i]); 
		}
		
	}

}
