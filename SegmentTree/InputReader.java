import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class InputReader {
    private String fileName;

    public InputReader(String fileName) {
        this.fileName = fileName;
    }

    public int[] numArray(int numberOfString) {
        String line;
        String[] numbers;
        int[] intNumbers;
        line = lineReader(numberOfString);
        numbers = line.split(" ");
        intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = parseInt(numbers[i]);
        }
        return intNumbers;
    }

    public boolean hasNext(int numberOfString) {
        String line;
        boolean result = false;
        line = lineReader(numberOfString);
        if (line != null) {
            result = true;
        }
        return result;
    }

    public String lineReader(int numberOfString) {
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            for (int i = 0; i < numberOfString; i++)
                br.readLine();
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
