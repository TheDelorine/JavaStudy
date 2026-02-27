,public class RationalFraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }

    public RationalFraction() {
        this(0, 1); // Дробь 0/1, а не 0/0 (деление на 0 недопустимо)
    }
    
    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Сразу сокращаем при создании
    }

    public void reduce() {
        int nod = evclide(numerator, denominator);
        numerator = numerator / nod;
        denominator = denominator / nod;
        // Убедимся, что знак всегда в числителе
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int evclide(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public RationalFraction add(RationalFraction number) {
        int newNumerator = this.numerator * number.getDenominator() + number.getNumerator() * this.denominator;
        int newDenominator = this.denominator * number.getDenominator();
        return new RationalFraction(newNumerator, newDenominator);
    }
    
    public void add2(RationalFraction number) {
        this.numerator = this.numerator * number.getDenominator() + number.getNumerator() * this.denominator;
        this.denominator = this.denominator * number.getDenominator();
        reduce();
    }

    public RationalFraction sub(RationalFraction number) {
        int newNumerator = this.numerator * number.getDenominator() - number.getNumerator() * this.denominator;
        int newDenominator = this.denominator * number.getDenominator();
        return new RationalFraction(newNumerator, newDenominator);
    }
    
    public void sub2(RationalFraction number) {
        this.numerator = this.numerator * number.getDenominator() - number.getNumerator() * this.denominator;
        this.denominator = this.denominator * number.getDenominator();
        reduce();
    }

    public RationalFraction mult(RationalFraction number) {
        int newNumerator = this.numerator * number.getNumerator();
        int newDenominator = this.denominator * number.getDenominator();
        return new RationalFraction(newNumerator, newDenominator);
    }
    
    public void mult2(RationalFraction number) {
        this.numerator = this.numerator * number.getNumerator();
        this.denominator = this.denominator * number.getDenominator();
        reduce();
    }
    
    public RationalFraction div(RationalFraction number) {
        if (number.getNumerator() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int newNumerator = this.numerator * number.getDenominator();
        int newDenominator = this.denominator * number.getNumerator();
        return new RationalFraction(newNumerator, newDenominator);
    }
    
    public void div2(RationalFraction number) {
        if (number.getNumerator() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        this.numerator = this.numerator * number.getDenominator();
        this.denominator = this.denominator * number.getNumerator();
        reduce();
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    public double value() {
        return (double) numerator / denominator; // Нужно явное приведение к double
    }
    
    public boolean equals(RationalFraction number) {
        RationalFraction reducedThis = new RationalFraction(this.numerator, this.denominator);
        RationalFraction reducedOther = new RationalFraction(number.getNumerator(), number.getDenominator());
        reducedThis.reduce();
        reducedOther.reduce();
        return reducedThis.numerator == reducedOther.numerator && 
               reducedThis.denominator == reducedOther.denominator;
    }

    public int numberPart() {
        return numerator / denominator;
    }
}