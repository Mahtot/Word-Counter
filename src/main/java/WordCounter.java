import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public  void countWord() {
        String filePath = "./Sample.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Count characters (including spaces)
                charCount += line.length();

                // Split the line into words
                String[] words = line.trim().split("\\s+");

                // Checks for empty lines (to avoid counting an empty word)
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
