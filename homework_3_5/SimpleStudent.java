package homework_3_5;

public class SimpleStudent {
    private int age;
    private String name;

    public SimpleStudent( String name,Integer age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
