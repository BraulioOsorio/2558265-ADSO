import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número N: ");
        int N = scanner.nextInt();
        
        int[][] cuadradoLatino = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            cuadradoLatino[0][i] = i + 1;
        }
        
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cuadradoLatino[i][j] = cuadradoLatino[i - 1][(j + 1) % N];
            }
        }
        
        System.out.println("Cuadrado latino:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(cuadradoLatino[i][j] + " ");
            }
            System.out.println();
        }
    }
}
