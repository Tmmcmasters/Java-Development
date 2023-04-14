import java.util.Scanner;

public class TestTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter three sides of the triangle: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();

    System.out.print("Enter the color of the triangle: ");
    String color = input.next();

    System.out.print("Is the triangle filled? (true/false): ");
    boolean filled = input.nextBoolean();

    Triangle triangle = new Triangle(side1, side2, side3);
    triangle.setColor(color);
    triangle.setFilled(filled);

    System.out.println("The triangle with sides " + triangle.getSide1() + ", " + triangle.getSide2() + ", and " + triangle.getSide3() + " has:");
    System.out.println("Area = " + triangle.getArea());
    System.out.println("Perimeter = " + triangle.getPerimeter());
    System.out.println("Color = " + triangle.getColor());
    System.out.println("Filled = " + triangle.isFilled());
  }
}
