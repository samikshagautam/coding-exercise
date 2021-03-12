package coding.exercise.udemy;

import java.util.List;

public class FP01Functional {

    public static void printList(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)//filter
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

//    private static boolean isEven(int number) {
//        return number % 2 == 0;
//    }

    public static void main(String[] args) {
        printEvenNumbersInListFunctional(List.of(2, 3, 4, 5, 6));
    }
}
