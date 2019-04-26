package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(getMap(o -> ((String) o).length() == 3));
    }

    public static List<String> getMap(Predicate predicate) throws FileNotFoundException {

        Map<String, Integer> map = new TreeMap<>();
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String word = sc.next();
            if (predicate.test(word)) {

                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }

            }
        }
        Map<String, Integer> sortedMap = new TreeMap<>();
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(o -> sortedMap.put(o.getKey(), o.getValue()));
        return Arrays.asList(map.entrySet().toArray(new String[0]));
    }
}
