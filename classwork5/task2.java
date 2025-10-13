import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String[] glasnie = {"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int start = 0;
        int end = stepen(n) - 1;
        
        for (int i = start; i <= end; i++) {
            String result = "";
            int t = i;
            
            for (int j = 0; j < n; j++) {
                int number = t % 10;
                t = t / 10;
                result = glasnie[number % glasnie.length] + result;
            }
            
            System.out.println(result);
        }
    }
    
    public static int stepen(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 10;
        }
        return res;
    }
}