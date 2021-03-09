package educative.linkedlist.antra;

import java.util.*;

public class Assignment3 {

    public static List<Integer> getAList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(10);

        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "10");

        Set<Integer> set = new HashSet<>();
        for (String value : map.values()) {
            set.add(Integer.parseInt(value));
        }

        List<Integer> result = new ArrayList<>();
        for (int number : integerList) {
            if (!set.contains(number)) {
                result.add(number);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getAList());
    }
}
