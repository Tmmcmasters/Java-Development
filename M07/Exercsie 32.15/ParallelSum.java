import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelSum { // Class ParallelSum
    public static double parallelSum(double[] list) { // Method parallelSum
        ForkJoinPool pool = new ForkJoinPool(); // Create a pool
        return pool.invoke(new SumTask(list, 0, list.length)); // Compute the sum
    }

    private static class SumTask extends RecursiveTask<Double> { // Class SumTask
        private final double[] list; // List of doubles
        private final int start; // Start
        private final int end; // End
        private static final int THRESHOLD = 1000; // Threshold

        public SumTask(double[] list, int start, int end) { // Constructor
            this.list = list; // Set the list
            this.start = start; // Set the start
            this.end = end; // Set the end
        } 

        @Override
        protected Double compute() { // Method compute
            if (end - start <= THRESHOLD) { // If the end - start is less than the threshold
                double sum = 0; // Initialize the sum
                for (int i = start; i < end; i++) { // For each element
                    sum += list[i]; // Add the element
                }
                return sum;
            } else {
                int mid = (start + end) / 2; // Get the mid
                SumTask leftTask = new SumTask(list, start, mid); // Create a task
                SumTask rightTask = new SumTask(list, mid, end); // Create a task

                leftTask.fork(); // Fork
                rightTask.fork();   // Fork

                return leftTask.join() + rightTask.join(); // Join
            }
        }
    }
}
