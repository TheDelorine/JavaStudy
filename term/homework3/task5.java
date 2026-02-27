import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int number = 0;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				// --
			} else if (n % 2 == 0) {
				number += 1;
			}
			for (int j = 0; j < n; j++) {
				if (number % 2 == 0) {
					array[i][j] = 1;
				}
				number += 1;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}
}