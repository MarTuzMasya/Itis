import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void writeLine(String fileName, String text) {
        try(FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text);
            writer.append('\n');
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
