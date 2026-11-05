package istiklal.edu.tr;

import java.math.BigInteger;

public class RationalBigInteger extends Number implements Comparable<RationalBigInteger> {
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    public RationalBigInteger() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public RationalBigInteger(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        BigInteger sign = denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : BigInteger.valueOf(-1);
        this.numerator = sign.multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public RationalBigInteger add(RationalBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalBigInteger(n, d);
    }

    public RationalBigInteger subtract(RationalBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalBigInteger(n, d);
    }

    public RationalBigInteger multiply(RationalBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalBigInteger(n, d);
    }

    public RationalBigInteger divide(RationalBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);
        return new RationalBigInteger(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE)) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof RationalBigInteger) {
            return this.subtract((RationalBigInteger) other).getNumerator().equals(BigInteger.ZERO);
        }
        return false;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(RationalBigInteger o) {
        return this.subtract(o).getNumerator().compareTo(BigInteger.ZERO);
    }
}