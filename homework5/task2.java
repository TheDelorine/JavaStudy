import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputOne = input.nextLine();
        int count = 1;
        for (int i = 0; i < inputOne.length(); i++) {
            if (inputOne.charAt(i) == ' ') {
                count++;
            }
        }
        int number_glasnie = 0;
        int arrayindex = 0;
        int[] array = new int[count];
        String[] slova = new String[count];
        int indexSlova = 0;
        int start = 0;

        for (int i = 0; i < inputOne.length(); i++) {
            if (inputOne.charAt(i) == ' ') {
                String slovo = "";
                for (int j = start; j < i; j++) {
                    slovo += inputOne.charAt(j);
                }
                slova[indexSlova] = slovo;
                indexSlova += 1;
                start = i + 1;
            }
        }
        
        String slovo = "";
        for (int j = start; j < inputOne.length(); j++) {
            slovo += inputOne.charAt(j);
        }
        slova[indexSlova] = slovo;

        for (int i = 0; i < inputOne.length(); i++) {
            if (inputOne.charAt(i) == 'e' || inputOne.charAt(i) == 'y' ||  inputOne.charAt(i) == 'u' ||  inputOne.charAt(i) == 'i' ||  inputOne.charAt(i) == 'o' || inputOne.charAt(i) == 'a') {
                number_glasnie += 1;
            }
            if (inputOne.charAt(i) == ' ' || i == inputOne.length() - 1) {
                array[arrayindex] = number_glasnie;
                arrayindex += 1;
                number_glasnie = 0;
            }
        }
        int min_glasnie = 0;
        int index_max_glasnogo = 0;
        for (int i = 0; i < arrayindex; i++) {
            if (array[i] > min_glasnie) {
                min_glasnie = array[i];
                index_max_glasnogo = i;
            }
        }
        System.out.println(slova[index_max_glasnogo]);
    }
}