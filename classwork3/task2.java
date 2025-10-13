import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.print(array[n - 1 - i] + " ");
		}
	}
}