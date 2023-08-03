package Ejercicios;


public class Ejercicio2 {

	public static void main(String[] args) {
		/* Se ha recabado la edad de las personas de un pueblo de 1000 habitantes. Simula la recogida de datos generando edades entre 0 y 100 de forma aleatoria.
		 * Se desea saber de esta población:
		 * -  la edad media.
		 *  - la edad más grande.
		 *  - cuantas personas son menores de edad (menores de 18).
		 *  - cuantas personas están jubiladas (mayores de 65).
		 *  - edad media de los menores de edad.
		 */
		
					
		int[] edades = new int[1000];
        int sumaEdades = 0;
        int maximoEdad = 0;
        int menoresEdad = 0;
        int jubilados = 0;
        int sumaMenoresEdad = 0;

         // GNERAR NUMEROS ALEATORIOS //
        
        for (int i = 0; i < edades.length; i++) {
          edades[i] = (int) Math.ceil(Math.random() * 100);
            sumaEdades += edades[i];
            
            System.out.print(" Edad : ");
    			System.out.printf(" %3d \n ", edades[i]);
             
            // CALCULAR EDAD MAS GRANDE // 
            
            if (edades[i] > maximoEdad) {
                maximoEdad = edades[i];
            }
                  

            // CALCULAR CANTOS SON MENORES DE EDAD // 
            
            if (edades[i] < 18) {
                menoresEdad++;
                sumaMenoresEdad += edades[i];
            }
                       

            // CALCULAR CUANTOS JUBILADOS HAY // 
            
            if (edades[i] > 65) {
                jubilados++;
            }
            
        }
           // CALCULAR MEDIA /// 
        
        float edadMedia = sumaEdades / edades.length;
        float edadMediaMenores = sumaMenoresEdad / menoresEdad;

        
        
        System.out.println("Edad más grande: " + maximoEdad);
        System.out.println("Menores de edad: " + menoresEdad);
        System.out.println("Jubilados: " + jubilados);
        
        System.out.println("Edad media: " + edadMedia);
        System.out.println("Edad media de menores de edad: " + edadMediaMenores);
    }

	}


