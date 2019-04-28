import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class InputCreator {
    String filename;

    public InputCreator(String filename) {
        this.filename = filename;
    }

    public void createInput(int count, int countSame) {

        Random random = new Random();

        for (int i = 1; i <= count; i++) { // Number of sets
            for (int k = 0; k < countSame; k++) { // Number of repeating sets
                StringBuilder text = new StringBuilder();
                for (int j = 0; j < i*100 ; j++) { // The number of numbers in the set.
                    text.append(random.nextInt(100000)).append(" ");
                }
                try(FileWriter writer = new FileWriter(filename, true))
                {
                    writer.write(text.toString());
                    writer.append('\n');
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
