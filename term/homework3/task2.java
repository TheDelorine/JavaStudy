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
		int line = 0;
		int number_len = 0;
		int flag = 0;
		int con = 0;
		for (int i = 0; i < n; i++) {
			if (con == 1) {
				break;
			}
			if (flag == 1) {
				System.out.println("False");
				break;
			}
			for (int j = 0; j < n; j++) {
				number = 0;
				if (flag == 1) {
					break;
				}
				number_len = 0;
				while (array[i][j] > 0) {
					number_len += 1;
					if ((array[i][j]%10)%2 == 0) {
						number += 1;
						array[i][j] = array[i][j]/10;
					} else {
						break;
					}
				}
				if (number_len == number) {
					line += 1;
				}
				if (line != 1) {
					flag = 1;
					break;
				}
				if (j + 1 == n) {
					System.out.println("True");
					con = 1;
				}
			}
		}
	}
}