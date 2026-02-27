import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер(n) массива:");
		int n = scanner.nextInt();
		boolean flag = true;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Введите значение в матрицу под индексом [" + i + "]");
			array[i] = scanner.nextInt();
			if (array[i] < 0) {
				System.out.println("Введено отрицательное число");
				flag = false;
				break;
			}
		}
		if (sumNumber(array[0]) == sumNumber(array[n - 1]) && flag == true) {
			System.out.println("True");
		} else if (flag == true) {
			System.out.println("False");
		}
	}

	public static int sumNumber(int a) {
		int res = 0;
		while (a > 0) {
			res += a % 10;
			a = a / 10;
		}
		return res;
	}
}