package task3;

public class Product {

    boolean isReady = false;
    char ch = ' ';

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public boolean isConsumed() {
        return !isReady;
    }

    public boolean isProdused() {
        return isReady;
    }

    public void produce() {
        this.isReady = true;
    }

    public void consume() {
        this.isReady = false;
    }

}

