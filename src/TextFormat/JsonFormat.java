/**
 * A class that implements the {@link IFormat} interface to format text data as JSON-like objects.
 * Each entry in the provided list is converted into a JSON-like structure and written to a file.
 */
package TextFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JsonFormat implements IFormat {

    /**
     * Formats the given list of text data as JSON-like objects and writes them to a file.
     * Each entry in the list is formatted as:
     * <pre>
     * {
     *   ''Text'': ''entry''
     * }
     * </pre>
     * The output is saved to a file named {@code formattedJSON.txt}.
     *
     * @param data an {@link ArrayList} of strings to be formatted.
     * @throws IOException if an I/O error occurs during file writing.
     */
    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedJSON.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (int i = 0; i < data.size(); i++) {
                writer.write("{ \n");
                writer.write("''Text'': " + "''" + data.get(i) + "'' \n");
                writer.write("} \n");
            }
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
