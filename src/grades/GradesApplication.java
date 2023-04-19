package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();
        students.put("coolguy", new Student("Doug"));
        students.put("monkeyLover", new Student("Frenchguy"));
        students.put("bugeater", new Student("Bro"));
        students.put("frogEnjoyer", new Student("Fernando"));

        students.get("coolguy").addGrade(95);
        students.get("coolguy").addGrade(90);
        students.get("coolguy").addGrade(95);

        students.get("monkeyLover").addGrade(90);
        students.get("monkeyLover").addGrade(37);
        students.get("monkeyLover").addGrade(99);

        students.get("bugeater").addGrade(35);
        students.get("bugeater").addGrade(65);
        students.get("bugeater").addGrade(80);

        students.get("frogEnjoyer").addGrade(90);
        students.get("frogEnjoyer").addGrade(92);
        students.get("frogEnjoyer").addGrade(94);

        String choice;
        do {
            System.out.println("Hi Friend!\n");
            System.out.println("Here are the GitHub usernames of our students:\n");
            for (String username : students.keySet()) {
                System.out.print("|" + username + "| ");
            }
            System.out.println("\n");

            System.out.println("What student would you like to see more information about?");
            String username = scanner.nextLine();

            Student student = students.get(username);
            if (student == null) {
                System.out.println("\nSorry man, no student was found with the GitHub username of \"" + username + "\".\n");
            } else {
                System.out.println("\nName: " + student.getName());
                System.out.println("GitHub Username: " + username);
                System.out.println("Current Average: " + student.getGradeAverage() + "\n");
            }

            System.out.println("Would you like to see another student? (y/n)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}

