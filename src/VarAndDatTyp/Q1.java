package VarAndDatTyp;
import java.util.Scanner;

// Question1 : In a program,input 3 numbers:A,BandC.You have to out put the average of these 3 numbers.

public class Q1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number  : ");
        int A = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int B = sc.nextInt();
        System.out.print("Enter the Third number  : ");
        int C = sc.nextInt();
        System.out.print("The Average is : ");
        System.out.print(((float)(A+B+C)/3));

    }
}
