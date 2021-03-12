package coding.exercise.udemy;

import java.util.List;

public class FP02Structured {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,4,5);
         int sum = addList(numbers);
        System.out.println(sum);

    }

    public static int addList(List<Integer> numbers){
      int sum = 0;
        for(int num : numbers){
           sum = sum+ num;

        }
        return sum;

    }
}
