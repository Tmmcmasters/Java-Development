import java.util.Scanner; //Import the Scanner class

public class exerciseFourDotOne {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the length from the center to a vertex: ");
            double length = scanner.nextDouble();

            double pentagonArea = findPentagonArea(length); //calls the method to calculate the area


            System.out.println("The area of the pentagon is: " + pentagonArea);
        }
        
    }

    //Method that calculates the area of a pentagon
    static double findPentagonArea(double length) {

        double side = 2 * (length) * Math.sin(Math.PI / 5); //Calculates the side of the pentagon

        return Math.round((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5)) * 100.0) / 100.0; //Calcualtes the area using the side and rounds it
    }



}
