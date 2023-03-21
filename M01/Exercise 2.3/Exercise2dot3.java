import java.util.Scanner; //Importing Scanner class

public class Exercise2dot3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Creating a Scanner object
        System.out.println("Enter a value for feet: "); //Prompting the user to enter a value for feet
        double userInputFeet = myObj.nextDouble(); //variable storing the user input
        
        convertFeetToMeters(userInputFeet); //calling the convertFeetToMeters method
    }
    
    public static void convertFeetToMeters(double feet) { //Declaring method name that really is convertFeetToMeters
        double meters = feet * 0.305; //variable storing the conversion of feet to meters
        System.out.println(meters); //outputs the conversion of feet to meters
    }
}
