public class NumberBox<T extends Number> {
    private T[] array;

    public NumberBox(T[] array) {
        this.array = array;
    }

    public T[] getNumbers() {
        return array;
    }

    public void setNumbers(T[] numbers) {
        this.array = numbers;
    }

    public static void printSquared(NumberBox<? extends Number> array) {
        for (Number item : array.getNumbers()) {
            System.out.println(UniversalCalculator.multiply(item, item));
        }
    }

    public static double sum(NumberBox<? extends  Number> array) {
        Number temp = 0;
        for (Number item : array.getNumbers()) {
            UniversalCalculator.add(temp, item);
        }
        return temp.doubleValue();
    }

    public static void fillWithRandom(NumberBox<Double> array) {
        for (int i = 0; i < array.getNumbers().length; i++) {
            array.getNumbers()[i] = Math.random();
        }
    }

    public static void copy(NumberBox<? super Number> arr1, NumberBox<? super Number> arr2) {
        for (int i = 0; i < arr1.getNumbers().length; i++) {
            arr1.getNumbers()[i] = arr2.getNumbers()[i];
        }
    }
    
    public static NumberBox<Double> addBoxes(NumberBox<? extends  Number> arr1, NumberBox<? extends Number> arr2) {
        if (arr1.getNumbers().length != arr2.getNumbers().length) {
            throw new IllegalArgumentException("Разные размеры");
        }
        Double[] newArray = new Double[arr1.getNumbers().length];
        for (int i = 0; i < arr1.getNumbers().length; i++) {
            newArray[i] = arr1.getNumbers()[i].doubleValue() + arr2.getNumbers()[i].doubleValue();
        }
        NumberBox box1 = new NumberBox<>(newArray);
        return box1;
    }

    public void append(NumberBox<T> other) {
        T[] newArray = (T[]) new Number[array.length + other.getNumbers().length];
        for (int i = 0; i < (array.length + other.getNumbers().length); i++) {
            if (i <= array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = other.getNumbers()[i];
            }
        }
        array = newArray;
    }

}