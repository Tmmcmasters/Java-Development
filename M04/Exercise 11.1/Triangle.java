
public class Triangle extends GeometricObject { // Inherit from GeometricObject
    private double side1; // Instance variables
    private double side2; 
    private double side3;
  
    public Triangle() { // Constructor
      this.side1 = 1.0; // Default values
      this.side2 = 1.0;
      this.side3 = 1.0;
    }
  
    public Triangle(double side1, double side2, double side3) { // Constructor
      this.side1 = side1; // Instance variables
      this.side2 = side2;
      this.side3 = side3;
    }
  
    public double getSide1() { // Getter side one
      return this.side1;
    }
  
    public void setSide1(double side1) { // Setter side one
      this.side1 = side1;
    }
  
    public double getSide2() { // Getter side two
      return this.side2;
    }
  
    public void setSide2(double side2) {  // Setter side two
      this.side2 = side2;
    }
  
    public double getSide3() { // Getter side three
      return this.side3;
    }
  
    public void setSide3(double side3) {  // Setter side three
      this.side3 = side3;
    }
  
    public double getArea() { // Getter area
      double s = (this.side1 + this.side2 + this.side3) / 2; // Calculate area
      return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3)); // Return area
    } 
  
    public double getPerimeter() { // Getter perimeter
      return this.side1 + this.side2 + this.side3; // Calculate perimeter
    }
  
    public String toString() { // String representation
      return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3; // String representation
    }
  }