import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.swing.JFileChooser;

public class exercise { 
    public static void main(String[] args) { 
        JFileChooser fileChooser = new JFileChooser(); // Create a file chooser
        int returnValue = fileChooser.showOpenDialog(null); // Show the file chooser
        if (returnValue == JFileChooser.APPROVE_OPTION) { // If the user chose a file
            File selectedFile = fileChooser.getSelectedFile(); // Get the file
            try {  // Try to read the file
                Stream<String> lines = Files.lines(Paths.get(selectedFile.getAbsolutePath())); // Read the file
                lines.flatMap(line -> Arrays.stream(line.split("\\s+"))) // Split the lines
                        .filter(word -> word.length() > 0 && Character.isLetter(word.charAt(0))) // Filter the words
                        .sorted(Comparator.comparing(String::toLowerCase)) // Sort the words
                        .forEach(System.out::println); // Print the words

            } catch (IOException e) {  // If the file cannot be read
                e.printStackTrace(); // Print the exception
            }
        }
    }
}
