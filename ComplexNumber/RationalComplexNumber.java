public class RationalComplexNumber {
	private RationalFraction re;
	private RationalFraction im;

	public RationalComplexNumber() {
		this(new RationalFraction(), new RationalFraction());
	}
	public RationalComplexNumber(RationalFraction re, RationalFraction im) {
		this.re = re;
		this.im = im;
	}
	public RationalComplexNumber add(RationalComplexNumber number) {
		return new RationalComplexNumber(this.re.add(number.getReal()), this.im.add(number.getImaginary()));
	}
	public RationalComplexNumber sub(RationalComplexNumber number) {
		return new RationalComplexNumber(this.re.sub(number.getReal()), this.im.sub(number.getImaginary()));

	}
	public RationalComplexNumber mult(RationalComplexNumber number) {
		return new RationalComplexNumber(this.re * number.getReal() - this.im * number.getImaginary(), this.re * number.getImaginary().add(this.im * number.getReal()); 
	}
	public String toString() {
		if (re.value() < 0) {
			return im.toString() + "i" +  re.toString();
		}
		return im.toString() + "i+" +  re.toString();
	}
}