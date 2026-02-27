import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		int[] arrayCopy = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrayCopy[i] = array[i];
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i] > array[j]) {
					arrayCopy[i] = array[j];
					arrayCopy[j] = array[i];
				}
			}
		}

		for (int i = 0; i<n; i++) {
			System.out.print(arrayCopy[i] + " ");
		}
	}
}