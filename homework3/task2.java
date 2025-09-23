import java.util.Scanner;

public class task2 {
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
		int system = 0;
		for (int i = 0; i < n; i++) {
			if (system == 1) {
				break;
			}
			for (int j = 0; j < n; j++) {
				if (array[i][j] % 2 != 0) {
					System.out.println("False");
					system = 1;
					break;
				}
				if (i + 1 == n && j + 1 == n) {
					System.out.println("True");
				}
			}
		}
	}
}