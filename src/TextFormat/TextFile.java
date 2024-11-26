package TextFormat;

import java.util.ArrayList;
import java.io.IOException;

public class TextFile {

    private ArrayList<String> fileContent;
    private IFormat format;

    public TextFile() {
        fileContent = new ArrayList<>();
    }

    public void setFormat(IFormat format) {
        this.format = format;
    }

    public TextFile(ArrayList<String> data) {
        fileContent = data;
    }

    public void printFormatted() throws IOException {
        format.format(fileContent);
    }


}
