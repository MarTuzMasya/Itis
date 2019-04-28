import static java.lang.Integer.parseInt;

public class Middeler {

    public void mid(String fileName, String fileNmeForWrite) {
        int count = 0;
        InputReader inputReader = new InputReader(fileName);
        Writer writer = new Writer();
        String line;

        int sum = 0;
        int n = 5;

        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < n; i++) {
                line = inputReader.lineReader(count++);
                String[] number = line.split(" ");
                sum += parseInt(number[0]);
            }
            writer.writeLine(fileNmeForWrite, (sum / n) + "");
            sum = 0;
        }

    }
}
