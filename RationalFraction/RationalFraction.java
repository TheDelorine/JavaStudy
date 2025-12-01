public class RationalFraction {
	private int numerator;
	private int denominator;

	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}

	public RationalFraction() {
		this(0, 0);
	}
	public RationalFraction(int numerator, int numerator) {
		this.numerator = numerator;
		this.denominator = numerator;
	}

	public void reduce() {
		int nod = evclide(numerator, denominator);
		numerator = numerator / nod;
		denominator = denominator / nod;
	}

	private int evclide(int a, int b) {
		while (b!=0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public RationalFraction add(RationalFraction number) {
		RationalFraction newRationalFraction = new RationalFraction(number.getNumerator() * denominator + numerator * numerator.getDenominator(), number.getDenominator() * denominator);
		return newRationalFraction.reduce();
	}
	public void add2(RationalFraction number) {
		this.x = number.getNumerator() * denominator + numerator * numerator.getDenominator();
		this.y = number.getDenominator() * denominator;
		reduce();
	}

	public RationalFraction sub(RationalFraction number) {
		RationalFraction newRationalFraction = new RationalFraction(number.getNumerator() * denominator - numerator * numerator.getDenominator(), number.getDenominator() * denominator);
		return newRationalFraction.reduce();
	}
	public void sub2(RationalFraction number) {
		this.x = number.getNumerator() * denominator - numerator * numerator.getDenominator();
		this.y = number.getDenominator() * denominator;
		reduce();
	}

	public RationalFraction mult(RationalFraction number) {
		RationalFraction newRationalFraction = new RationalFraction(numerator * number.getNumerator(), denominator * number.getDenominator());
		return newRationalFraction.reduce();
	}
	public void mult2(RationalFraction number) {
		this.numerator = numerator * number.getNumerator();
		this.denominator = denominator * number.getDenominator();
		reduce();
	}
	public RationalFraction div(RationalFraction number) {
		RationalFraction newRationalFraction = new RationalFraction(numerator * number.getDenominator(), denominator * number.getNumerator());
		return newRationalFraction.reduce();
	}
	public void div2(RationalFraction number) {
		this.x = numerator * number.getDenominator();
		this.y = denominator * number.getNumerator();
		reduce();
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	public double value() {
		return numerator / denominator;
	}
	public boolean equals(RationalFraction number) {
		reduce();
		number = number.reduce();
		if (numerator == number.getNumerator() && denominator == number.getDenominator()) {
			return true;
		}
		return false;
	}

	public int numberPart() {
		return numerator / denominator;
	}
}