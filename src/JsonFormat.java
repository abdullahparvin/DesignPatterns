import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JsonFormat implements IFormat {

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
