/**
 * A class that implements the {@link IFormat} interface to format text data as Markdown.
 * Each entry in the provided list is styled with random Markdown formatting options
 * and written to a file.
 */
package TextFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MarkdownFormat implements IFormat{

    /**
     * Formats the given list of text data as Markdown and writes it to a file.
     * <p>
     * The first entry in the list is formatted as a Markdown heading.
     * Subsequent entries are styled with random Markdown formatting options, such as bold, italic,
     * or strikethrough, and written line by line to a file named {@code formattedMarkdown.txt}.
     * <p>
     *
     * @param data an {@link ArrayList} of strings to be formatted.
     * @throws IOException if an I/O error occurs during file writing.
     */
    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedMarkdown.txt";

        // Array of Markdown formatting options.
        String[] options = {"**", "***", "_", "~~", "<sub>"};
        Random rng = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Format the first entry as a Markdown heading.
            writer.write("#" + data.get(0));

            // Format subsequent entries with random Markdown styles.
            for (int i = 1; i < data.size(); i++) {
                int number = rng.nextInt(options.length);
                String option = options[number];
                writer.write(option + data.get(i) + option + '\n');
            }
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
