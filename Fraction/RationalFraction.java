import java.util.Objects;

public class RationalFraction extends Number {
    private int numerator;
    private int denominator;

    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        } else if (denominator < 0) {
            throw new IllegalArgumentException("Знак должен быть только в числителе");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
    	return this.numerator;
    }
    public int getDenominator() {
    	return this.denominator;
    }

    @Override
    public int intValue() {
        return numerator/denominator;
    }
    @Override
    public long longValue() {
        return (long)(numerator/denominator);
    }
    @Override
    public float floatValue() {
        return (float)(numerator/denominator);
    }
    @Override
    public double doubleValue() {
        return (double)(numerator/denominator);
    }

    private int evclide(int a, int b) {
		while (b!=0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

    public void reduce() {
		int nod = evclide(numerator, denominator);
		numerator = numerator / nod;
		denominator = denominator / nod;
	}

    public RationalFraction add(RationalFraction number) {
		RationalFraction newRationalFraction = new RationalFraction(number.getNumerator() * denominator + numerator * number.getDenominator(), number.getDenominator() * denominator);
		newRationalFraction.reduce();
		return newRationalFraction;
	}

	public void add2(RationalFraction number) {
		this.numerator = number.getNumerator() * denominator + numerator * number.getDenominator();
		this.denominator *= number.getDenominator();
		reduce();
	}

	public RationalFraction sub(RationalFraction number) {
		RationalFraction newRationalFraction = new RationalFraction(number.getNumerator() * denominator - numerator * number.getDenominator(), number.getDenominator() * denominator);
		newRationalFraction.reduce();
		return newRationalFraction;
	}
	public void sub2(RationalFraction number) {
		this.numerator = number.getNumerator() * denominator - numerator * number.getDenominator();
		this.denominator *= number.getDenominator();
		reduce();
	}

	public RationalFraction mult(RationalFraction number) {
		RationalFraction newRationalFraction = new RationalFraction(numerator * number.getNumerator(), denominator * number.getDenominator());
		newRationalFraction.reduce();
		return newRationalFraction;
	}
	public void mult2(RationalFraction number) {
		this.numerator *= number.getNumerator();
		this.denominator *= number.getDenominator();
		reduce();
	}
	public RationalFraction div(RationalFraction number) {
		RationalFraction newRationalFraction = new RationalFraction(numerator * number.getDenominator(), denominator * number.getNumerator());
		newRationalFraction.reduce();
		if (number.getNumerator() == 0) {
			throw new ArithmeticException("Дробь с делением на ноль");
		}
		return newRationalFraction;
	}
	public void div2(RationalFraction number) {
		if (number.getNumerator() == 0) {
			throw new ArithmeticException("Дробь с делением на ноль");
		}
		this.numerator *= number.getDenominator();
		this.denominator *= number.getNumerator();
		reduce();
	}

	public RationalFraction negate() {
		return new RationalFraction(numerator * (-1), denominator);
	}

	public boolean isProper() {
		int xeNumerator = numerator;
		int xeDenominator = denominator;
		if (numerator < 0) {
			xeNumerator *= -1;
		}
		if (denominator < 0) {
			xeDenominator *= - 1;
		}
		if (xeNumerator < xeDenominator) {
			return true;
		}
		return false;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}


	public boolean equals(RationalFraction number) {
		int res = evclide(this.numerator, this.denominator);
		int res2 = evclide(number.getNumerator(), number.getDenominator());
		if ((numerator/res) == (number.getNumerator()/res2) && (denominator/res) == (number.getDenominator()/res2)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numerator, denominator);
	}
}