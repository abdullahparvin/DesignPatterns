/**
 * A class that implements the {@link IFormat} interface to format text data as HTML.
 * Converts a list of strings into a simple HTML document and writes it to a file.
 */
package TextFormat;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlFormat implements IFormat{

    /**
     * Formats the given list of text data as an HTML document and writes it to a file.
     * <p>
     * The output HTML file begins with the standard {@code <html>} and {@code <head>} tags.
     * Each entry in the list is enclosed within a custom {@code <text>} tag. The resulting
     * HTML document is saved to a file named {@code formattedHTML.txt}.
     * </p>
     *
     * @param data an {@link ArrayList} of strings to be formatted as HTML.
     * @throws IOException if an I/O error occurs during file writing.
     */
    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedHTML.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Start HTML document with DOCTYPE and opening tags.
            writer.write("<html dir=\"ltr\" lang=\"en\"> \n");
            writer.write("<head> \n");

            // Write each string wrapped in a custom <text> tag.
            for (int i = 0; i < data.size(); i++) {
                writer.write("  <text>" + data.get(i) + "</text> \n");
            }

            // Close HTML structure.
            writer.write("</head> \n");
            writer.write("</html>");
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
