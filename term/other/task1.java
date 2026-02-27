import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int chet = 0;
		int nechet = 0;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (count_number(x) % 2 == 0) {
				chet += 1;
			} else {
				nechet += 1;
			}
		}
		if (chet == nechet) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
	}

	public static int count_number(int a) {
		int sum = 0;
		while (a > 0) {
			sum += 1;
			a = a / 10;
		}
		return sum;
	}
}