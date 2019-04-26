package task2;

public class Sword {
    private int length; // в сантиметрах
    private int weight; // в граммах
    private String type; // тип меча

    public Sword(int length, int weight, String type) {
        this.length = length;
        this.weight = weight;
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "length=" + length +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
