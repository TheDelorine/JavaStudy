import java.util.Scanner;

public class task5 {
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
		int number = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0 && array1[i] > 0) {
				number += 1;
				if (number == array1.length) {
					System.out.println("Подходит условиям.");
					break;
				}
			} else {
				if (i + 1 == array1.length) {
					System.out.println("Не подходит условиям.");
				}
			}
		}
	}
}