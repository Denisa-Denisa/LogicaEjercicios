package Ejercicios;


public class Ejercicio20 {

	public static void main(String[] args) {
		//  GUARDA EN UN ARRAY LOS NUMEROS MENORES DE 500 QUE SEAN DIVISIBLES DE 3.  

		final int maximo =500; 
		final int multiplo =3; 
		final int cantidad = (int)Math.floor(maximo/multiplo); 
		
		int [] triples = new int [cantidad]; 
		
		for (int tri=multiplo, i=0; tri<=maximo; tri+=multiplo,i++) {
			triples[i]=tri;
			
		}
		
		for(int i=0; i<triples.length; i++) {
			System.out.println(triples[i] + " ");
			
		}
		
	}

}
