import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class XmlFormat implements IFormat {

    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedXML.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("<?xml version=''1.0'' encoding=''utf-8''?> \n");
            writer.write("<paragraph> \n");
            for (int i = 0; i < data.size(); i++) {
                writer.write("  <line>" + data.get(i) + "</line> \n");
            }
            writer.write("</paragraph>");
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
