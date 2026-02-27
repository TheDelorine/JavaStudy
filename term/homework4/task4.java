import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] array = new int[n][n];
		int flag = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j<n; j++) {
				array[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			if (flag == 1) {
				break;
			}
			int count_posl = 0;
			for (int j = 0; j < n; j++) {
				int len = 0;
				int count_len = 0;
				while (array[i][j] > 0) {
					len += 1;
					if (array[i][j]%10 < ((array[i][j]/10) % 10)) {
						count_len += 1;
					}
					array[i][j] /= 10;
				}
				if (i + 1 == n && array[i][j] / 10 == 0) {
					System.out.println("False");
					break;
				}
				if (len - 1 == count_len) {
					count_posl += 1;
				}
				if (count_posl == 2) {
					break;
				}
				if (count_posl < 3 && j + 1 == n) {
					System.out.println("True");
					flag = 1;
				}
			}
		}
	}
}