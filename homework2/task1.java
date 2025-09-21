import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		for (int i = 0; i < m; i++) {
			System.out.print("1");
		}
		for (int i = 0; i < n - 2; i++) {
			System.out.print("\n1");
			for (int j = 0; j <= m - 2; j++) {
				if (j == m - 2) {
					System.out.print("1");
				} else {
					System.out.print(" ");
				}
			}
		}
		System.out.print("\n");
		for (int i = 0; i < m; i++) {
			System.out.print("1");
		}
	}
}