/**
 * A class that implements the {@link IFormat} interface to format text data as XML.
 * Converts a list of strings into an XML structure and writes it to a file.
 */
package TextFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class XmlFormat implements IFormat {

    /**
     * Formats the given list of text data as XML and writes it to a file.
     * <p>
     * The output file begins with an XML declaration and wraps the content
     * in a root {@code <paragraph>} element. Each entry in the list is wrapped
     * in a {@code <line>} element, forming a well-structured XML document.
     * </p>
     * The resulting XML is saved to a file named {@code formattedXML.txt}.
     *
     * @param data an {@link ArrayList} of strings to be formatted as XML.
     * @throws IOException if an I/O error occurs during file writing.
     */
    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedXML.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write XML declaration.
            writer.write("<?xml version=''1.0'' encoding=''utf-8''?> \n");

            // Begin root element.
            writer.write("<paragraph> \n");

            // Write each line as a child element.
            for (int i = 0; i < data.size(); i++) {
                writer.write("  <line>" + data.get(i) + "</line> \n");
            }

            // End root element.
            writer.write("</paragraph>");
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
