package task3;

import java.io.*;

public class Producer extends Thread {

    private final Product product;
    private FileInputStream fileInputStream;

    public Producer(Product product, File input) throws FileNotFoundException {
        this.product = product;
        fileInputStream = new FileInputStream(input);
    }

    @Override
    public void run() {
        try {
            while (Main.isRunning) {
                synchronized (product) {
                    while (product.isProdused()) {
                        product.wait();
                    }
                    int symb = fileInputStream.read();
                    product.produce();
                    if (symb != -1) {
                        product.setCh((char) symb);
                        System.out.println("Считал");
                    } else {
                        Main.isRunning = false;
                    }
                    product.notify();
                }
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
