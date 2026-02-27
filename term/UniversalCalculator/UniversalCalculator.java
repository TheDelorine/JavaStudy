public class UniversalCalculator {
    public static double add(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static double subtract(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static double multiply(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static double divide(Number a, Number b) {
        if (b.doubleValue() == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        } else {
            return a.doubleValue()/b.doubleValue();
        }
    }
}