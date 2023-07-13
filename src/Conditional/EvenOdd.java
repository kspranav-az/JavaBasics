package Conditional;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();

        if (Number % 2 == 0) {
            System.out.println(Number + " Is EVEN.");
        }
        else {
            System.out.println(Number + " Is ODD.");
        }
    }
}
