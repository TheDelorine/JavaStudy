import java.util.Scanner;

public class task4 {
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
		int number_minus = 0;
		for (int i = 0; i < array1.length; i++) {
			if (max_number > array1[i]) {
				number_minus += 1;
				if (number_minus == 2) {
					System.out.println("Обнаружено не менее двух отрицательных чисел.");
					break;
				}
			} else {
				if (i + 1 == array1.length) {
					System.out.println("Орицательных менее 2.");
				}
			}
		}
	}
}