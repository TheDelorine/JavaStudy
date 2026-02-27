import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();

        String[][] array = new String[n][m];
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = input.nextLine();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int index = array[j][i].charAt(array[j][i].length() - 1);
                if (index == 'a' || index == 'y' || index == 'u' || index == 'i' || index == 'o' || index == 'e') {
                    res += 1;
                    break;
                }
            }
            if (res == n && i + 1 == n) {
                System.out.println("True");
            } else if (i - 1 == n) {
                System.out.println("False");
            }
        }
    }
}