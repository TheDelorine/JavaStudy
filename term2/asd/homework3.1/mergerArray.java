public class mergerArray {
    public static int[] merger(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];
        int indexArrayA = 0;
        int indexArrayB = 0;
        int indexNewArray = 0;
        while (indexArrayB < b.length && indexArrayA < a.length)  {
            if (a[indexArrayA] <= b[indexArrayB]) {
                newArray[indexNewArray] = a[indexArrayA];
                indexArrayA++;
            } else {
                newArray[indexNewArray] = b[indexArrayB];
                indexArrayB++;
            }
            indexNewArray++;
        }
        if (indexArrayA >= a.length) {
            for (int i = indexArrayB; i < b.length; i++) {
                newArray[indexNewArray] = b[i];
                indexNewArray++;
            }
        }
        if (indexArrayB >= b.length) {
            for (int i = indexArrayA; i < a.length; i++) {
                newArray[indexNewArray] = a[i];
                indexNewArray++;
            }
        }
        return newArray;
    }
}