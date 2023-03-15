package utils;

import java.util.Scanner;

public class Menuutilidades {

	public static void main(String[] args) {

		try (Scanner sn = new Scanner(System.in)) {
			boolean salir = false;

			int opcion;

			int tamaño;

			while (!salir) 
				
			Utilidades.pintarmenu();

				System.out.println("Elige una de las opciones para el menú para el menú: ");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Usted ha elegido la opción validar el email: ");
					break;

				case 2:
					System.out.println("Usted ha elegido la opción de pintar el cuadrado: ");
					System.out.println("Elige el tamaño del cuadrado: ");
					tamaño = sn.nextInt();
					if (tamaño==1);
					System.out.println("x");
					
					
					
					break;

				case 3:
					System.out.println("Usted ha elegido la opción de mostrar datos: ");

					break;

				case 4:
					System.out.println("Usted ha elegido cerrar el menú");
					salir = true;

					break;
				default:
					System.out.println("Se ha equivocado");
					break;

				}
			}
		}
	}
}
