package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();
        students.put("zgulde", new Student("Zach"));
        students.put("ryanorsinger", new Student("Ryan"));
        students.put("jreich5", new Student("Jeremy"));
        students.put("fmendozaro", new Student("Fernando"));

        students.get("zgulde").addGrade(95);
        students.get("zgulde").addGrade(90);
        students.get("zgulde").addGrade(85);

        students.get("ryanorsinger").addGrade(80);
        students.get("ryanorsinger").addGrade(85);
        students.get("ryanorsinger").addGrade(90);

        students.get("jreich5").addGrade(70);
        students.get("jreich5").addGrade(75);
        students.get("jreich5").addGrade(80);

        students.get("fmendozaro").addGrade(90);
        students.get("fmendozaro").addGrade(92);
        students.get("fmendozaro").addGrade(94);

        String choice;
        do {
            System.out.println("Welcome!\n");
            System.out.println("Here are the GitHub usernames of our students:\n");
            for (String username : students.keySet()) {
                System.out.print("|" + username + "| ");
            }
            System.out.println("\n");

            System.out.println("What student would you like to see more information on?");
            String username = scanner.nextLine();

            Student student = students.get(username);
            if (student == null) {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + username + "\".\n");
            } else {
                System.out.println("\nName: " + student.getName());
                System.out.println("GitHub Username: " + username);
                System.out.println("Grades: " + student.getGradeAverage());
                System.out.println("Current Average: " + student.getGradeAverage() + "\n");
            }

            System.out.println("Would you like to see another student? (y/n)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}

