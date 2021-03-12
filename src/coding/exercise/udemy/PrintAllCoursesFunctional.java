package coding.exercise.udemy;

import java.util.Comparator;
import java.util.List;

public class PrintAllCoursesFunctional {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "SpringBoot", "Docker", "Lambda", "AWS");
        printAllCourses(courses);
    }

    public static void printAllCourses(List<String> courses){
        courses.stream() //convert to stream
               // .filter(course -> course.contains("Spring")) // contains "Spring"
                //.filter(course -> course.length() >= 4) // course length is
                //.map(course -> course + " " +course.length())
               // .sorted(Comparator.reverseOrder())
                .sorted(Comparator.comparing(str -> str.length())) //defining our own comparator

                .forEach(System.out::println);
    }
}
