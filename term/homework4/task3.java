import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int flag = 0;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j<n; j++) {
				array[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			int count = 0;
			if (flag == 1) {
				break;
			}
			for (int j = 0; j < n; j++) {
				if (prostoe(array[i][j]) && prostoe(sum_numbers(array[i][j]))) {
					count+=1;
				}
				if (count == n) {
					System.out.println("True");
					flag = 1;
					break;
				}
				if (j + 1 == n && i + 1 == n) {
					System.out.println("False");
				}
			}
		}
	}

	public static int sum_numbers(int a) {
		int sum = 0;
		while (a > 0) {
			sum += a % 10;
			a = a / 10;
		}
		return sum;
	}

	public static boolean prostoe(int n) {
		if (n <= 1) return false;
    	if (n == 2) return true;
    	if (n % 2 == 0) return false;
    
    	for (int i = 3; i * i <= n; i += 2) {
        	if (n % i == 0) {
            	return false;
        	}
    	}
    	return true;
	}
}