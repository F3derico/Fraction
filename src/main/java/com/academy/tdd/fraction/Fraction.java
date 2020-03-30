package com.academy.tdd.fraction;

class Fraction {

	Fraction(int n, int d) throws ArithmeticException {
	}
	
	int getNum() {
		return 0;
	}
	int getDen() {
		return 0;
	}

	boolean isProper() {
		return false;
	}

	Fraction getReciprocal() {
		return null;
	}

	static Fraction multiply(Fraction a, Fraction b) {
		return null;
	}

	static Fraction multiply(Fraction b) {
		return null;
	}

	static Fraction divide(Fraction b) {
		return null;
	}

	static Fraction sum(Fraction n) {
		return null;
	}

	void reduce() {
	}

	public static int mcd(int p, int q) {
		if (q == 0)
			return p;
		else
			return mcd(q, p % q);
	}

	@Override
	public String toString() {
		return null;
	}

}