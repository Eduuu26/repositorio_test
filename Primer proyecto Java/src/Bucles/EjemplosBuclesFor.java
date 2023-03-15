package Bucles;

public class EjemplosBuclesFor {

	public static void main(String[] args) {
		
		for (int i =0, j =10 ; i <10 ; i+=2 ) {
			
			
			if(i%2== 0&& i<8) {
				continue;
			}else if (i%3==0) {
				break;
			}
			System.out.println(i);
		

		}

	}
}