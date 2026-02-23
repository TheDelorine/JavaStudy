import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        public int mod(int a, int n, int b) {
            int res = a;
            for (int i = 0; i < n; i++) {
                res *= a;
            }
            System.out.println(res%b);
        }
    }
}