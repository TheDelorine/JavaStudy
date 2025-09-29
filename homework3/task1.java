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
		int flag = 0;
		for (int i = 0; i < n; i++) {
			number = 0;
			if (flag == 1) {
				break;
			}
			for (int j = 0; j < n; j++) {
				if (array[j][i] % 3 == 0) {
					number += 1;
				}
				if (number == n) {
					System.out.println("True");
					flag = 1;
					break;
				}
				if (i + 1 == n && j + 1 == n) {
					System.out.println("False");
				}
			}
		}
	}
}