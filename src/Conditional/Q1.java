package Conditional;
import java.util.Scanner;

/* Question1:Write a Java program to get a number from
the user and print whether it is positive or negative.
 */

public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number >=0){
            System.out.println("Number is Positive.");

        }else {
            System.out.println("Number is Negative.");
        }
    }
}
