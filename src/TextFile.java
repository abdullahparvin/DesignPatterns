import java.util.ArrayList;
import java.util.Random;

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

    public void printFormatted() {
        format.format(fileContent);
    }

}
