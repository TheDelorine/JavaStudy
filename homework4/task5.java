import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][n/2] = 1;
				array[n/2][j] = 1;
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
}