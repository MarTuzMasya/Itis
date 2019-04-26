package task3;

import java.io.*;

public class Consumer extends Thread {

    private final Product product;
    private FileOutputStream fileOutputStream;

    public Consumer(Product product, File output) throws FileNotFoundException {
        this.product = product;
        fileOutputStream = new FileOutputStream(output);
    }

    @Override
    public void run() {
        while (Main.isRunning) {
            try {
                synchronized (product) {
                    while (product.isConsumed()) {
                        product.wait();
                        if (!Main.isRunning)
                            return;
                    }
                    fileOutputStream.write(product.getCh());
                    System.out.println("Напечатал");
                    product.consume();
                    product.notify();
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
