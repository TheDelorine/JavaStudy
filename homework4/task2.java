import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int flag = 0;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j<n; j++) {
				array[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			if (flag == 1) {
				break;
			}
			int sum_stolb = 0;
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					sum_stolb = sum_numbers(array[j][i]);
				}
				if (j != 0 && sum_stolb == sum_numbers(array[j][i])) {
					count += 1;
				}
				if (j + 1 == n && (count + 1) == n) {
					System.out.println("True");
					flag = 1;
					break;
				}
				if (j + 1 == n && i + 1 == n) {
					System.out.println("False");
				}
			}
		}
	}

	public static int sum_numbers(int a) {
		int sum = 0;
		while (a > 0) {
			sum += a % 10;
			a = a / 10;
		}
		return sum;
	}
}