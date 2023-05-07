public class TestParralelSum {
    public static void main(String[] args) {
        int size = 9_000_000; // Size of the list
        double[] list = new double[size]; // Create a list

        // Fill the list with random double values
        for (int i = 0; i < size; i++) { // for loop that fill the list
            list[i] = Math.random() * 100; // Generate a random double
        }

        long startTime = System.currentTimeMillis(); // Get the start time
        double sum = ParallelSum.parallelSum(list); // Compute the sum
        long endTime = System.currentTimeMillis(); // Get the end time

        System.out.println("Sum: " + sum);  // Print the sum
        System.out.println("Time taken (ms): " + (endTime - startTime)); // Print the time
    }
}
