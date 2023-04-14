# Exercise 9.8

9.8 (THE FAN CLASS) Design a class named Fan to represent a fan. The class contains:

 The Fan class

Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.

A private int data field named speed that specifies the speed of the fan (the default is SLOW).

A private boolean data field named on that specifies whether the fan is on (the default is false).

A private double data field named radius that specifies the radius of the fan (the default is 5).

A string data field named color that specifies the color of the fan (the default is blue).

The accessor and mutator methods for all four data fields.

A no-arg constructor that creates a default fan.

A method named toString() that returns a string description for the fan. If the fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.

Draw the UML diagram for the class then implement the class. Write a test program that creates two Fan objects. Assign maximum speed, radius 10, color yellow, and turn it on to the first object. Assign medium speed, radius 5, color blue, and turn it off to the second object. Display the objects by invoking their toString method.

# Exercise 10.14

10.14 (THE MYDATE CLASS) Design a class named MyDate. The class contains:

The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January.

A no-arg constructor that creates a MyDate object for the current date.

A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds.

A constructor that constructs a MyDate object with the specified year, month, and day.

Three getter methods for the data fields year, month, and day, respectively.

A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.

Draw the UML diagram for the class then implement the class. Write a test program that creates two MyDate objects (using new MyDate() and new MyDate(34355555133101L)) and displays their year, month, and day.

(HINT: The first two constructors will extract the year, month, and day from the elapsed time. For example, if the elapsed time is 561555550000 milliseconds, the year is 1987, the month is 9, and the day is 18. You may use the GregorianCalendar class discussed in Programming Exercise 9.5 to simplify coding.)

# Exercise 11.1

11.1 (THE TRIANGLE CLASS) Design a class named Triangle that extends ­GeometricObject. The class contains:

Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle.

A no-arg constructor that creates a default triangle.

A constructor that creates a triangle with the specified side1, side2, and side3.

The accessor methods for all three data fields.

A method named getArea() that returns the area of this triangle.

A method named getPerimeter() that returns the perimeter of this triangle.

A method named toString() that returns a string description for the triangle.

For the formula to compute the area of a triangle, see Programming Exercise 2.19. The toString() method is implemented as follows:


return "Triangle: side1 = " + side1 + " side2 = " + side2 +
  " side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes. Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. The program should create a Triangle object with these sides and set the color and filled properties using the input. The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.