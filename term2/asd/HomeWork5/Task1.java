public class Task1 {
    public static void main(String[] args) {
        String s = "мама";
        String t = "амам";
        System.out.println(cyclicalShift(s, t));
    }

    public static boolean cyclicalShift(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String result = t;
        for (int i = 0; i < s.length(); i++) {
            result = result.charAt(s.length() - 1) + result;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != result.charAt(j)) {
                    break;
                }
                return true;
            }
        }
        return false;
    }
}