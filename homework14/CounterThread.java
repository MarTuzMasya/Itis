package homework14;

public class CounterThread extends Thread{
    private int start;
    private int end;
    private long[] array;

    public CounterThread(int start, int end, long[] array) {
        this.start = start;
        this.end = end;
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            MainApp.sum += array[i];
        }
    }
}
