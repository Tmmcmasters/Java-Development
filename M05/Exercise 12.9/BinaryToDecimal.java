import java.util.Scanner;

public class BinaryToDecimal {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimal = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);

            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Not a binary number: " + binaryString);
            }

            decimal = decimal * 2 + (ch - '0');
        }

        return decimal;
    }
//---^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ This code takes a binary string as input and converts it to its decimal equivalent. It iterates over each character in the binary string, and if a character is not '0' or '1', it throws a BinaryFormatException. Finally, it returns the decimal equivalent of the binary string.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number as a string: ");
        String binaryString = input.nextLine();

        try {
            int decimal = bin2Dec(binaryString);
            System.out.println("The decimal equivalent of " + binaryString + " is " + decimal);
        } catch (BinaryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
// -----^^^^^^^^^This is a Java code snippet containing the main method of a program that takes a binary number as input from the user, converts it to decimal using a separate method called bin2Dec, and prints the result. If the input is not a valid binary number (i.e. contains non-binary characters), the program catches a custom exception called BinaryFormatException and prints its error message.
}
