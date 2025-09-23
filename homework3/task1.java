import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите длинну массива (n&n):");
		int n = input.nextInt();
		int number = 0;
		int[][] array = new int[n][n];
		System.out.println("Введите числа массива:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int x = input.nextInt();
				array[i][j] = x;
			}
		}
		for (int i = 0; i < n; i++) {
			number = 0;
			for (int j = 0; j < n; j++) {
				if (array[j][i] % 3 == 0) {
					number += 1;
				}
				if (number == 3) {
					System.out.println("True");
					break;
				}
				if (i - 1 == n && j - 1 == n) {
					System.out.println("False");
				}
			}
		}
	}
}