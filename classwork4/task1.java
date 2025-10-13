import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count = 0;
        String glasnie = "eyuoai";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < glasnie.length(); j++) {
                if (str.charAt(i) == glasnie.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == str.length()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}