package coding.exercise.udemy;

import java.util.ArrayList;
import java.util.List;

//Functional Programming
public class FP01Structured {
    public static List<Integer> printAllNumbersinAList(List<Integer> integerList) {
        List<Integer> result = new ArrayList<>();
        for (int list : integerList) {

            if (list % 2 != 0) {
                result.add(list);
            }

        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(printAllNumbersinAList(List.of(2,3,4,5,6,7)));
    }
}
