import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите длинну массива 1:");
		int n1 = input.nextInt();
		System.out.println("Введите числа для 1 массива:");
		int[] array1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			int x1 = input.nextInt();
			array1[i] = x1;
		}

		System.out.println("Введите длинну массива 2:");
		int n2 = input.nextInt();
		System.out.println("Введите числа для 2 массива:");
		int[] array2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			int x2 = input.nextInt();
			array2[i] = x2;
		}

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i]) {
				if (i == array1.length - 1) {
					System.out.println("True");
				}
			} else if (array1.length != array2.length) {
				System.out.println("False");
					break;
			} else {
				System.out.println("False");
				break;
			}
		}
	}
}