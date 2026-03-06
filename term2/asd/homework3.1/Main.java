public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 10};
        int[] b = new int[]{3, 4 ,6}; // 1 2 3 4 6 10
        int[] c = mergerArray.merger(a, b);

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}