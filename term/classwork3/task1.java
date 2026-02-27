import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[][] array = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = input.nextInt();
			}
		}
		int[][] arrayCopy = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arrayCopy[i][j] = array[i][j] * 2;
				System.out.print(arrayCopy[i][j] + " ");
			}
			System.out.println("");
		}
	}
}