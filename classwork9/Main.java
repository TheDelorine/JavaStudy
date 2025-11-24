import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВедите всю информацию подряд без escape(Иначе не примет); ");
        String str = scanner.nextLine();
        System.out.println("Mail адреса:  " + isValidName(str));
        System.out.println("Даты: " + findDates(str));
        System.out.println("Имена:  " + findCapitalizedWords(str));
        System.out.println("Общее количество цифр: " + countDigits(str));
    }

    public static int countDigits(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            String ch = text.charAt(i) + "";
            if(ch.matches("[0-9]")) count++;
        }
        return count;
    }

    public static String findCapitalizedWords(String text){
        String[] x = split1(text);
        String res = "\n";
        int z = 1;
        for(int i = 0; i < x.length; i++){
            if(x[i].matches("[A-Z||А-Я][a-z||а-я]+.*")){
                res += z + ". " + x[i] + "\n" ;
                z++;
            }
        }
        return res;
    }

    public static String isValidName(String name) {
        String[] x = split1(name);
        String res = "\n";
        int k = 1;
        for(int i = 0; i < x.length; i++){
            if(x[i].matches("\\w+@([a-z0-9-_.]+)\\.(com|ru).*")){
                res += k + ". " + x[i] + "\n";
            }
        }
        return res;
    }

    public static String findDates(String text){
        String[] x = split1(text);
        String res = "\n";
        int k = 1;
        for(int i = 0; i < x.length; i++){
            boolean d31 = x[i].matches("(0[1-9]|[1-2][0-9]|3[0-1])\\.(0[13578]|10|12)\\.(\\d{4}\\.?)");
            boolean d28 = x[i].matches("(0[1-9]|1[0-9]|2[0-8])\\.02\\.(\\d{4})\\.?");
            boolean d30 = x[i].matches("(0[1-9]|[1-2][0-9]|30)\\.(0[469]|11)\\.(\\d{4})\\.?");
            if(d31 || d28 || d30){
                res += k + ". " + x[i] + "\n";
            }
        }
        return res;
    }



    public static String[] split1(String x){
        String str = ubrat(x);
        String[] array = new String[kolvo(str)];
        int s = 0;
        String w = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                w += str.charAt(i);
            }else{
                array[s] = w;
                w = "";
                s++;
            }
            if(i == str.length()-1){
                array[s] = w;
            }
        }
        return array;
    }



    public static String ubrat(String str){
        String strnew = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ',' && str.charAt(i) != '"' && str.charAt(i) != ']' && str.charAt(i) != '!' && str.charAt(i) != ':' && str.charAt(i) != ';'){
                strnew += str.charAt(i);
            }
        }
        return strnew;
    }



    public static int kolvo(String str){
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }



}
