package arrays;

public class ArrayConDatosDesconocidos {

	public static void main(String[] args) {
		
		int [] [] numeros = new int [5][6];
		numeros[1][1]=8;
		System.out.println(numeros[1][1]);
		System.out.println(numeros.length);
		System.out.println("Numero de filas "+ numeros.length);
		System.out.println("Numero de columnas "+ numeros[1].length);
	
		//Pintar la matriz 
		System.out.println(numeros);
		for(int i = 0 ; i <numeros.length; i++) {//Recorre filas
			for(int j=0; j <numeros[i].length; j++) {//Recorre columnas
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}

	}
}