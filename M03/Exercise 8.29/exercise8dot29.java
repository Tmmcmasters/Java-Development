import java.util.Scanner;


public class exercise8dot29 {
    public static void main(String[] args) {

        System.out.println("Enter list1: "); // Prompt for list1
        try (Scanner input1 = new Scanner(System.in)) {
            int[][] m1 = new int[3][3]; // Create array
            
            for (int i = 0; i < m1.length; i++) { // Loop through rows 
                for (int j = 0; j < m1[i].length; j++) {
                    m1[i][j] = input1.nextInt();
                }
            }

            System.out.println("Enter list2: "); // Prompt for list2
            Scanner input2 = new Scanner(System.in);

            int[][] m2 = new int[3][3]; // Create array m2

            for (int i = 0; i < m2.length; i++) { // Loop through rows
                for (int j = 0; j < m2[i].length; j++) {
                    m2[i][j] = input2.nextInt();
                }
            }

            if (equals(m1, m2)) { // Check if the two arrays are identical
                System.out.println("The two arrays are identical");
            } else {
                System.out.println("The two arrays are not identical");
            }
        }
        
    }

    public static boolean equals(int [][] m1, int [][] m2) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
        
    }
}
