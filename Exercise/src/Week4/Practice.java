package Week4;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;
import java.util.StringTokenizer;

public class Practice {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String person1 = keyboard.nextLine();
        String person2 = keyboard.nextLine();

        StringTokenizer TokenPerson1 = new StringTokenizer(person1, " .");

        String person1_Name = TokenPerson1.nextToken();

        int person1_Year = Integer.parseInt(TokenPerson1.nextToken());

        int person1_Month = Integer.parseInt(TokenPerson1.nextToken());

        int person1_Day = Integer.parseInt(TokenPerson1.nextToken());

        Student first_student = new Student(person1_Name, person1_Year, person1_Month, person1_Day);
        Student second_student = new Student(person2, person1_Year);

        if (!first_student.checkDate()) {
            System.out.println("invalid input");
            return;
        }
        if (!second_student.checkDate()) {
            System.out.println("invalid input");
            return;
        }
        System.out.printf("%s %d/%d/%d age :%d\n", first_student.getName(), first_student.getYear(), first_student.getMonth(), first_student.getDay(), first_student.calAge());
        System.out.printf("%s %d/%d/%d age :%d\n", second_student.getName(), second_student.getYear(), second_student.getMonth(), second_student.getDay(), second_student.calAge());

        if (first_student.isOlder(second_student)) {
            System.out.printf("%s is older than %s\n", first_student.getName(), second_student.getName());
        } else
            System.out.printf("%s is older than %s\n", second_student.getName(), first_student.getName());
    }
}

