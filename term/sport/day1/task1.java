import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		int chet = 0;
		int nechet = 0;

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 1) {
				nechet++;
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("");
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				chet++;
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("");
		if (chet >= nechet) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}