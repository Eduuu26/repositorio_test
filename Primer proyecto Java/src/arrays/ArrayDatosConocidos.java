package arrays;

public class ArrayDatosConocidos {

	public static void main(String[] args) {
		
		String[] colores= {"Rojo", "Azul","Amarillo"};
		System.out.println(colores.length);
		System.out.println(colores[2]);
		System.out.println("==============");
		
		//Recorremos array con for tradicional
		for(int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
			
		}
		
		System.out.println("===============");
		//Recorremos array con bucle foreach
		for (String color : colores) {
			System.out.println(color);
		}
		
	}
	

}
