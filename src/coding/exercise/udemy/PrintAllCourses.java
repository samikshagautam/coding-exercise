package coding.exercise.udemy;

import java.util.ArrayList;
import java.util.List;

public class PrintAllCourses {
    private static void printAllTheMethods(List<String> courses){
        for(String course : courses){
            if(course.length() >= 4){
                System.out.println(course);
            }
        }
    }

    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("Spring");
        courses.add("Spring Boot");
        courses.add("Microservices");
        courses.add("API");
        courses.add("AWS");
        courses.add("Docker");
        printAllTheMethods(courses);

    }
}
