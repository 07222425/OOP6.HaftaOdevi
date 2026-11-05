package test;

import istiklal.edu.tr.RationalBigInteger;
import java.math.BigInteger;

public class TestRationalBigInteger {
    public static void main(String[] args) {
        RationalBigInteger r1 = new RationalBigInteger(new BigInteger("4"), new BigInteger("2"));
        RationalBigInteger r2 = new RationalBigInteger(new BigInteger("2"), new BigInteger("3"));

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}