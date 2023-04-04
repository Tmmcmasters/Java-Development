public class exercise5dot5 {
    public static void main(String[] args) {
        System.out.println("Kilograms Pounds | Pounds Kilograms"); // Header
        for (int counter = 1; counter < 200; counter += 2) { // for Loop
            int kilogramsOne = counter; // Calculate the first kilograms in the table. Easy conversion
            double poundsOne = kilogramsOne * 2.2; // Calculate the first pounds in the table. Multiply by 2.2 to get the first pounds. Easy conversion
            int poundsTwo = 20 + (counter / 2) * 5; // Calculate the second pounds in the table. Start at 20 and divide by 2. Multiply by 5 to get the second pounds
            double kilogramsTwo = poundsTwo / 2.2; // Calculate the second kilograms in the table. Divide by 2.2 to get the second kilograms
            System.out.printf("%9d %6.1f | %6d %10.2f\n", kilogramsOne, poundsOne, poundsTwo, kilogramsTwo); // Print the table using formatting
        }
    }
}

