import java.util.Scanner; //Importing Scanner

public class TestTriangle { //Creating a TestTriangle Class
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter three sides of the triangle: "); //Prompting the user
    double side1 = input.nextDouble(); //Storing the user input 1 
    double side2 = input.nextDouble(); //Storing the user input 2 
    double side3 = input.nextDouble(); //Storing the user input 3

    System.out.print("Enter the color of the triangle: "); //Prompting the user
    String color = input.next(); //Storing the user input for color

    System.out.print("Is the triangle filled? (true/false): "); //Prompting the user
    boolean filled = input.nextBoolean(); //Storing the user input for filled

    Triangle triangle = new Triangle(side1, side2, side3); //Creating a new triangle
    triangle.setColor(color); 
    triangle.setFilled(filled);

    System.out.println("The triangle with sides " + triangle.getSide1() + ", " + triangle.getSide2() + ", and " + triangle.getSide3() + " has:"); 
    System.out.println("Area = " + triangle.getArea());
    System.out.println("Perimeter = " + triangle.getPerimeter());
    System.out.println("Color = " + triangle.getColor());
    System.out.println("Filled = " + triangle.isFilled());
  }
}
