package homework14;

import java.util.Random;

public class MainApp {
    static int sum;
    static int sum2;

    public static void main(String[] args) throws InterruptedException {
        long[] array = new long[1000000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        CounterThread thread1 = new CounterThread(0, 200000, array);
        CounterThread thread2 = new CounterThread(200001, 400001, array);
        CounterThread thread3 = new CounterThread(400002, 600002, array);
        CounterThread thread4 = new CounterThread(600003, 800003, array);
        CounterThread thread5 = new CounterThread(800004, 999999, array);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println("Sum by many threads " + sum);
        System.out.println("Sum by one thread   " + sum2);
        if (sum <= sum2) {
            System.out.println("True");
            double divide = sum2 / sum;
            System.out.println(divide);
        } else {
            System.out.println("False");
        }

    }
}
