package task3;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    static public boolean isRunning;

    public static void main(String[] args) throws FileNotFoundException {
        isRunning = true;
        File input = new File("text1.txt");
        File output = new File("text2.txt");
        Product product = new Product();
        Producer producer = new Producer(product, input);
        Consumer consumer = new Consumer(product, output);
        producer.start();
        consumer.start();
    }
}
