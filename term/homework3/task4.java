import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int number = 0;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			array[i][i] = 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}
}