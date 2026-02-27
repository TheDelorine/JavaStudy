import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int str = scanner.nextInt();
        int stl = scanner.nextInt();
        int[][] mass = new int[str][stl];
        System.out.println("Введи числa");
        for (int i=0; i<str; i++) {
            for (int j=0; j<stl; j++) {
                int x = scanner.nextInt();
                mass[i][j] = x;
            }
        }
        for (int i=0; i<str;i++){
            n = 0;
            for (int j=0; j<stl; j++) {
                if (mass[j][i]%3==0) {
                    n++;
                }
                if (n==3) {
                    System.out.println("True");
                    break;
                } 
                if ((i-1==str) && (j-1==stl)) {
                    System.out.println("False");
                }
            }
        }
    }
}