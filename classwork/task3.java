import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите длинну массива:");
		int n = input.nextInt();
		int[] array1 = new int[n];
		for (int i = 0; i < n; i++) {
			int x = input.nextInt();
			array1[i] = x;
		}

		int max_number = 0;
		for (int i = 0; i < array1.length; i++) {
			if (max_number > array1[i]) {
				System.out.println("Обнаружено отрицательное число.");
				break;
			} else {
				if (i + 1 == array1.length) {
					System.out.println("Орицательных нет.");
				}
			}
		}
	}
}