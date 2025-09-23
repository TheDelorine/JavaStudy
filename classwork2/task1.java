import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int number = 0;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < number; j++) {
				array[i][j] = 1;
				array[n - 1 - i][j] = 1;
				array[i][n - 1 - j] = 1;
				array[n - 1 - i][n - 1 - j] = 1;
			}
			number += 1;
			if (number == n / 2) {
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			array[i][0] = 1;
			array[n - 1 - i][n - 1] = 1;
			array[i][i] = 1;
			array[n - 1 - i][i] = 1;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}
}