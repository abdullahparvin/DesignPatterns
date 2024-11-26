import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        data.add("We will implement this by using the strategy design pattern. This will make the application " +
                        "more versatile and allow it to adapt to different formatting requirements.");
        data.add("Addition of new formatting styles will be easy and won’t require changes to the core " +
                        "editing functionalities." );
        data.add("Users will be able to switch between formatting styles seamlessly " +
                "and view their content in the selected format before publishing or saving it.");

        TextFile file = new TextFile(data);
        int option = 0;
        switch (option) {
            case 0:
                file.setFormat(new PlainTextFormat());
                break;
            case 1:
                file.setFormat(new HtmlFormat());
                break;
            case 2:
                file.setFormat(new MarkdownFormat());
                break;
            default:
                file.setFormat(new PlainTextFormat());
        }

        file.printFormatted();

    }
}