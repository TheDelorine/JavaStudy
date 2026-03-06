import java.util.Scanner;

public class classwork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int bracket = 0;
        int bracket1 = 0;
        int bracket2 = 0;
        int error = 0;
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                flag = 1;
                bracket++;
            }
            if (str.charAt(i) == ')') {
                if (flag != 1) {
                    error = 1;
                }
                bracket--;
            }
            if (str.charAt(i) == '[') {
                flag = 2;
                bracket1++;
            }
            if (str.charAt(i) == ']') {
                if (flag != 2) {
                    error = 1;
                }
                bracket1--;
            }
            if (str.charAt(i) == '{') {
                flag = 3;
                bracket2++;
            }
            if (str.charAt(i) == '}') {
                if (flag != 3) {
                    error = 1;
                }
                bracket2--;
            }
            if (bracket < 0 || bracket1 < 0 || bracket2 < 0 || error == 1) {
                System.out.println(false);
                break;
            }
        }
        if (bracket == 0 && error == 0 && bracket1 == 0 && bracket2 == 0) {
            System.out.println(true);
        }
    }
}