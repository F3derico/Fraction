package com.academy.tdd.fraction;

class Fraction implements Comparable<Fraction> {

	private int num;
	private int den;

	Fraction(int n, int d) throws ArithmeticException {
		if (d == 0)
			throw new ArithmeticException();
		this.num = n;
		this.den = d;
	}

	int getNum() {
		return num;
	}

	int getDen() {
		return den;
	}

	boolean isProper() {
		return (this.num < this.den);
	}

	Fraction getReciprocal() {
		return new Fraction(this.den, this.num);
	}

	static Fraction multiply(Fraction a, Fraction b) {
		int newN = a.num * b.num;
		int newD = a.den * b.den;
		return new Fraction(newN, newD);
	}

	static Fraction divide(Fraction a, Fraction b) {
		return multiply(a, b.getReciprocal());
	}

	static Fraction sum(Fraction n, Fraction m) {
		int a = n.num;
		int b = n.den;
		int c = m.num;
		int d = m.den;

		int newN = a * d + b * c;
		int newD = b * d;
		return new Fraction(newN, newD);
	}

	static Fraction subtract(Fraction n, Fraction m) {

		return sum(n, m.getNegative());
	}

	private Fraction getNegative() {
		return new Fraction(-num, den);
	}

	private boolean isNegative() {
		return num * den < 0;
	}

	void reduce() {
		int m = Fraction.mcd(this.num, this.den);
		this.num /= m;
		this.den /= m;
	}

	public static int mcd(int p, int q) {
		if (q == 0)
			return p;
		else
			return mcd(q, p % q);
	}

	@Override
	public String toString() {
		return (num + "/" + den);
	}

	public static void print(String s) {
		System.out.println(s);
	}

	public static void test(String test, String result, String testName) {
		if (test.equals(result))
			print(testName + " ok");
		else
			print(testName + " failed: " + test);
	}

	@Override
	public int compareTo(Fraction f) {
		Fraction sub = Fraction.subtract(this, f);
		if (sub.getNum() == 0)
			return 0;
		if (sub.isNegative())
			return -1;
		return 1;
	}

}