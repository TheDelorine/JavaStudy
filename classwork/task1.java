import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите длинну массива:");
		int n = input.nextInt();
		int[] array1 = new int[n];
		for (int i = 0; i < n; i++) {
			int x = input.nextInt();
			array1[i] = x;
		}

		int max_number = array1[0];
		for (int i = 0; i < array1.length; i++) {
			if (max_number < array1[i]) {
				max_number = array1[i];
			}
		}
		System.out.println(max_number);
	}
}