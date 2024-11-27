/**
 * A demonstration class for the text formatting system.
 * Implements the strategy design pattern to dynamically switch between different text formatting styles.
 * Formats a given list of text data using a user-selected formatting style and outputs the result.
 */
package TextFormat;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    /**
     * The entry point of the application.
     * Demonstrates the usage of the strategy design pattern by:
     * <ul>
     *     <li>Creating a list of sample text data.</li>
     *     <li>Configuring a {@link TextFile} object with a dynamically selected formatting strategy.</li>
     *     <li>Printing the formatted output.</li>
     * </ul>
     *
     * @param args command-line arguments (not used in this program).
     * @throws IOException if an I/O error occurs during formatting.
     */
    public static void main(String[] args) throws IOException {

        // Sample text data to be formatted.
        ArrayList<String> data = new ArrayList<>();
        data.add("We will implement this by using the strategy design pattern. This will make the application " +
                        "more versatile and allow it to adapt to different formatting requirements.");
        data.add("Addition of new formatting styles will be easy and won’t require changes to the core " +
                        "editing functionalities." );
        data.add("Users will be able to switch between formatting styles seamlessly " +
                "and view their content in the selected format before publishing or saving it.");

        // Create a TextFile object with the sample data.
        TextFile file = new TextFile(data);

        // Select a formatting style dynamically.
        int option = 4; // Change this to select different formats.
        switch (option) {
            case 0:
                file.setFormat(new PlainTextFormat());
                break;
            case 1:
                file.setFormat(new HtmlFormat());
                break;
            case 2:
                file.setFormat(new MarkdownFormat());
                break;
            case 3:
                file.setFormat(new JsonFormat());
                break;
            case 4:
                file.setFormat(new XmlFormat());
                break;
            default:
                file.setFormat(new PlainTextFormat());
        }

        // Format and print the output.
        file.printFormatted();

    }
}