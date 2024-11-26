package TextFormat;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PlainTextFormat implements IFormat {

    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedPlainText.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

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
