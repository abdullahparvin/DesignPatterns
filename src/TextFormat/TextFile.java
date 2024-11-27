/**
 * A class that represents a text file and supports dynamic formatting using the {@link IFormat} interface.
 * Implements the strategy design pattern to allow flexible formatting of text content.
 */
package TextFormat;

import java.util.ArrayList;
import java.io.IOException;

public class TextFile {

    /**
     * The content of the text file represented as a list of strings.
     */
    private ArrayList<String> fileContent;

    /**
     * The formatting strategy to be applied to the text file.
     */
    private IFormat format;

    /**
     * Default constructor that initializes an empty text file.
     */
    public TextFile() {
        fileContent = new ArrayList<>();
    }

    /**
     * Sets the formatting strategy for the text file.
     *
     * @param format the {@link IFormat} implementation to be used for formatting the text file.
     */
    public void setFormat(IFormat format) {
        this.format = format;
    }

    /**
     * Constructs a {@code TextFile} with the specified content.
     *
     * @param data an {@link ArrayList} of strings representing the initial content of the text file.
     */
    public TextFile(ArrayList<String> data) {
        fileContent = data;
    }

    /**
     * Applies the current formatting strategy to the text file's content.
     *
     * @throws IOException if an I/O error occurs during the formatting process.
     */
    public void printFormatted() throws IOException {
        format.format(fileContent);
    }
}
