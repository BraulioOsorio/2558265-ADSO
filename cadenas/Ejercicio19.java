import java.util.Scanner;

public class Ejercicio19{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la longitud del arreglo: ");
        int lon=entrada.nextInt();
		int vector[] = new int[lon];
        for(int i=0;i<lon;i++){
            System.out.print("Valor "+(i+1)+": ");
            vector[i]=entrada.nextInt();
        }
		System.out.print("Arreglo: {");
		for(int i = 0; i < lon; i++){
			System.out.print(vector[i] + " ");
            if(i<lon-1){
                System.out.print(",");
            }
		}
        System.out.print("}");
        System.out.print("\nIngrese la contidad de movimientos: ");
        int movimientos=entrada.nextInt();
		System.out.print("\nMovimientos: "+movimientos+"\n");
		for(int j = 0; j < movimientos; j++){
			System.out.print("Movimiento "+(j+1)+": ");
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
			System.out.print("{");
			for (int i=0; i<vector.length; i++) {
				System.out.print(((i==0)? "":",")+vector[i]);
			}
			System.out.println("}");
		}
	}
}