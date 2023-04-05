public class exercise6dot9 {

    // Main method
    public static void main(String[] args) {

        double meters = 15.0; // Initialize the meters
        

// -----> Creating the Header
        System.out.println("   Feet     Meters    |    Meters     Feet");
        System.out.println("-----------------------------------------------");


// -----> Creating the body for loop
        for (double counter = 1.0; counter <= 10.0; counter++) {

// -----> The original way I was going to do it
            // meters += 5.0;
            // double footToMeeter = footToMeter(counter);
            // double meterToFoot = meterToFoot(meters);

// -----> The new way I am doing it to preserve space. 
            System.out.printf("%6.1f %10.3f     |  %6.1f %10.3f\n", counter, footToMeter(counter), meters += 5.0, meterToFoot(meters));


        }

    }

    // Foot to meter method
    public static double footToMeter(double foot) {
        return foot * 0.305; 
    }

    // Meter to foot method
    public static double meterToFoot(double meter) {
        
        return meter * 3.278688; // This generates the same output as the table in the book. I don't know why this is the case. You can change it back to the original formula given for the conversion. The original formula is return meter * 3.279, however this would generate a different output from the table in the book; 

    }
}
