import java.util.Scanner;

public class exerciseFourDotOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double length = scanner.nextDouble();

        double pentagonArea = findPentagonArea(length);


        System.out.println("The area of the pentagon is: " + pentagonArea);
        
    }

    static double findPentagonArea(double length) {
        return (5 * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / 5));
    }



}
