import java.util.Scanner;

public class exercise7dot1 {
    public static void main(String[] args) { // Main Method
        
        System.out.println("Enter the number of students: "); // Prompt for number of students
        Scanner studentsInput = new Scanner(System.in); // Create Scanner
        int students = studentsInput.nextInt(); // Read number of students

        int [] arrayOfScores = getScores(students); // Get scores from user

        printScores(arrayOfScores); // Print scores from user

    }

    public static int[] getScores(int numberOfStudents) {
        
        System.out.println("Enter " + numberOfStudents + " score(s) (*EX: 24 52 43): "); // Prompt for number of scores
        Scanner scoresInput = new Scanner(System.in); // Create Scanner
        String scores = scoresInput.nextLine(); // Read number of scores

        String [] stringScoresArray = scores.split(" "); // Split string into array of scores
        int [] integarArrayOfScores = new int[numberOfStudents]; // Create array of scores
        
       //convert the string scores into an array of integers Ex: "24 52 43" -> [24, 52, 43]
        for (int i = 0; i < stringScoresArray.length; i++) {
            integarArrayOfScores[i] = Integer.parseInt(stringScoresArray[i]);
        }
        
        return integarArrayOfScores; // Return array of scores
    }

    public static void printScores(int [] arrayOfScores) {
        
        //Print the scores
        for (int counter = 0; counter < arrayOfScores.length; counter++) {
            System.out.println("Student " + counter + " score is " + arrayOfScores[counter] + " and grade is " + getGrade(arrayOfScores[counter], arrayOfScores)); //Print scores using the getGrade method
        }
    }

    public static String getGrade(int score, int [] arrayOfScores)  {
        
        int highestGrade = getBestGrade(arrayOfScores); // Find the highest score in the array of scores

        // Finds the grade based on the score and the highest score in the array of scores
        if (score >= highestGrade - 10) {
            return "A";
        } else if (score >= highestGrade - 20) {
            return "B";
        } else if (score >= highestGrade - 30) {
            return "C";
        } else if (score >= highestGrade - 40) {
            return "D";
        } else {
            return "F";
        }
       
    }

    public static int getBestGrade ( int [] arrayOfScores) {
        
        //Find the highest integar inn the array of scores
        int highestScore = arrayOfScores[0];
        for (int counter = 0; counter < arrayOfScores.length; counter++) {
            if (arrayOfScores[counter] > highestScore) {
                highestScore = arrayOfScores[counter];
            }
        }

        return highestScore;
    }

    
}
