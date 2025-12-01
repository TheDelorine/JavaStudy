public class ComplexNumber {
	private double real;
	private double imaginary;

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public ComplexNumber() {
		this(0, 0);
	}
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public ComplexNumber add(ComplexNumber number) {
		return new ComplexNumber(this.real + number.getReal(), this.imaginary + number.getImaginary());
	}
	public void add2(ComplexNumber number) {
		this.real = this.real + number.getReal();
		this.imaginary = this.imaginary + number.getImaginary();
	}

	public CompexNumber sub(ComplexNumber number) {
		return new ComplexNumber(this.real - number.getReal(), this.imaginary - number.getImaginary())
	}

	public void sub2(ComplexNumber number) {
		this.real = this.real - number.getReal();
		this.imaginary = this.imaginary - number.getImaginary();
	}
	public ComplexNumber multNumber(double number) {
		return new ComplexNumber(this.real * number, this.imaginary * number);
	}
	public void multNumber2(double number) {
		this.real = this.real * number;
		this.imaginary = this.imaginary * number;
	}

	public ComplexNumber mult(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public void mult2(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        this.real = newReal;
        this.imaginary = newImaginary;
    }
}