import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер(n) массива:");
		int n = scanner.nextInt();
		int[][] array = new int[n][n];
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Введите число для " + (i + 1) + " массива под индексом [" + j + "]");
				array[i][j] = scanner.nextInt();
				if (array[i][j] % 3 == 0) {
					res += array[i][j];
				}
			}
		}
		System.out.println(res);
	}
}