import java.util.Scanner;

public class Arreglos5 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		int vector[] = {3,8,1,5,7,9,2};
		int lon = vector.length;
		int movimientos = 10;

		System.out.print("Arreglo: ");
		for(int i = 0; i < lon; i++){
			System.out.print(vector[i] + " ");
		}
		System.out.print("\nMovimientos: "+movimientos+"\n");
		

		for(int j = 0; j < movimientos; j++){
			System.out.print("Movimiento "+(j+1)+": ");

			// Movimiento
			int temporal = 0;
			for (int a=0; a < lon ;a++ ) {
				if (a==0) {
					temporal = vector[a];
				}
				if (a!=lon-1) {
					vector[a] = vector[a+1];
				}else{
					vector[a] = temporal;
				}
			}

			// Imprimir el arreglo
			System.out.print("{");
			for (int i=0; i<vector.length; i++) {
				System.out.print(((i==0)? "":",")+vector[i]);
			}
			System.out.println("}");
		}

	}
	
}