package Conditional;
import java.util.Scanner;

/* Question3:Write a Java program to input week number(1-7)
and print day of week name using switch case.
 */

public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        switch (input) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a Valid  day");
        }

    }
}
