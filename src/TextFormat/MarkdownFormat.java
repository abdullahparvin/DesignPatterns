package TextFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MarkdownFormat implements IFormat{
    @Override
    public void format(ArrayList<String> data) throws IOException {

        String fileName = "formattedMarkdown.txt";

        String[] options = {"**", "***", "_", "~~", "<sub>"};
        Random rng = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("#" + data.get(0));
            for (int i = 1; i < data.size(); i++) {
                int number = rng.nextInt(options.length);
                String option = options[number];
                writer.write(option + data.get(i) + option + '\n');
            }
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
