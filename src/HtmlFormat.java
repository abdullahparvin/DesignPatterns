import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlFormat implements IFormat{

    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedHTML.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("<html dir=\"ltr\" lang=\"en\"> \n");
            writer.write("<head> \n");
            for (int i = 0; i < data.size(); i++) {
                writer.write("  <text>" + data.get(i) + "</text> \n");
            }
            writer.write("</head> \n");
            writer.write("</html>");
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
