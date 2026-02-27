import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        int s = 1;
        for (int i = 1; i<=n; i++) {
            s*=i;
            result+=s;
            System.out.println(result);
        }
    }
}