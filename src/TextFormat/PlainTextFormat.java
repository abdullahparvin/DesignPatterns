/**
 * A class that implements the {@link IFormat} interface to format text data as plain text.
 * Each entry in the provided list is written line by line to a plain text file.
 */
package TextFormat;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PlainTextFormat implements IFormat {

    /**
     * Formats the given list of text data as plain text and writes it to a file.
     * <p>
     * Each entry in the list is written on a new line in the file named {@code formattedPlainText.txt}.
     * No additional formatting is applied to the text.
     * </p>
     *
     * @param data an {@link ArrayList} of strings to be formatted as plain text.
     * @throws IOException if an I/O error occurs during file writing.
     */
    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedPlainText.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write each entry in the list to the file on a new line.
            for (int i = 0; i < data.size(); i++) {
               writer.write(data.get(i) + '\n');
            }
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
