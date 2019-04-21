package homework_3_5;

import java.util.List;

import static homework_3_5.SuperBestAwesomeFramework.*;

public class Main {
    public static void main(String[] args) {
        List<SimpleStudent> list =
                getMany(SimpleStudent.class, 3, "Marsel", 27);
        System.out.println(list);
    }
}
