import java.math.BigInteger;
import java.util.Scanner;

public class TestRational {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first rational number: ");
    BigInteger num1 = input.nextBigInteger();
    BigInteger den1 = input.nextBigInteger();

    System.out.print("Enter the second rational number: ");
    BigInteger num2 = input.nextBigInteger();
    BigInteger den2 = input.nextBigInteger();

    Rational r1 = new Rational(num1, den1);
    Rational r2 = new Rational(num2, den2);

    System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
    System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
    System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
    System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    System.out.println(r2 + " is " + r2.doubleValue());
  }
}
