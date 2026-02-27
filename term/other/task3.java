import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += scanner.nextInt();
			}
			if (sum > res) {
				res = sum;
			}
		}
		System.out.println(res);
	}
}