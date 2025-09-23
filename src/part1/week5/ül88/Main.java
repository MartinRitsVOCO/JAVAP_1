package part1.week5.ül88;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        ArrayList<Student> students = new ArrayList<Student>();
        String lastInput = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } else if (lastInput == null) {
                lastInput = input;
                System.out.println("Enter student number: ");
            } else  {
                students.add(new Student(lastInput, input));
                lastInput = null;
                System.out.println("Enter student name: ");
            }
        }

        students.forEach(System.out::println);

        System.out.println();
        System.out.println("Enter search term: ");
        String searchInput = scanner.nextLine();
        if (searchInput.isEmpty()) {
            return;
        } else {
            students.stream().filter(student -> student.getName().contains(searchInput)).forEach(System.out::println);
        }
    }
}
