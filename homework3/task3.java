import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 0;
        int res = 0;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                    array[i][j] = x;
            }
        }
        int sum_number = 0;
        for (int i = 0; i < n; i++) {
            number = 0;
            for (int j = 0; j < n; j++) {
                sum_number = 0;
                while (array[i][j] > 0) {
                    sum_number += (array[i][j]%10);
                    array[i][j] = array[i][j]/10;
                }
                if (sum_number % 5 == 0) {
                    number += 1;
                }
                if (number >= 2) {
                    res += 1;
                    break;
                }
                else if (i + 1 == n && j + 1 == n) {
                    System.out.println("False");
                }
            }
            if (res == n) {
                System.out.println("True");
            }
        }
    }
}