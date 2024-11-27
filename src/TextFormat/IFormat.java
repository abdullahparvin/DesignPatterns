/**
 * An interface for defining text formatting behavior.
 * Classes implementing this interface must provide an implementation
 * for the {@code format} method, which processes a list of text data.
 */
package TextFormat;

import java.io.IOException;
import java.util.ArrayList;

public interface IFormat {

    /**
     * Formats the given list of text data.
     * The specific formatting behavior is defined by the implementing class.
     *
     * @param data an {@link ArrayList} of strings to be formatted.
     * @throws IOException if an I/O error occurs during formatting.
     */
    void format(ArrayList<String> data) throws IOException;
}
