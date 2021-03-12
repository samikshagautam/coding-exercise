package coding.exercise.udemy;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,4,4,5,6,7);
        printSum(numbers);
        //printSum(numbers)
    }
    //method reference
//    public static  int sum(int a , int b){
//        return a+b;
//    }

    private static void printSum(List<Integer> numbers){
        numbers.stream()
               .distinct()
               .sorted()
               .forEach(System.out::println);
               //.map(number -> number*number)
               //.reduce(0,(x,y) -> x+y);
               // .reduce(0, FP02Functional::sum);
                    //  .reduce(0,(x,y) -> x+y);
        //.reduce(0,Integer::sum);

    }
}
