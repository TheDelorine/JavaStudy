import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.nextLine();
        int count = 0;
        int countTwo = 0;
        String[][] array = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = input.nextLine();
            }
        }
        String glasnie = "eyuoai";
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (array[j][i].charAt(0) == 'e' || array[j][i].charAt(0) == 'y' || array[j][i].charAt(0) == 'u' || array[j][i].charAt(0) == 'o' || array[j][i].charAt(0) == 'a' || array[j][i].charAt(0) == 'i') {
                    count += 1;
                }
                if (j + 1 == n && count <= 2) {
                    countTwo += 1;
                }
                if (i + 1 == n && j + 1 == n && countTwo != n) {
                    System.out.println("False");
                }
            }
            if (countTwo == n) {
                System.out.println("True");
            }
        }
    }
}