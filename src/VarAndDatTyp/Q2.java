package VarAndDatTyp;
import java.util.Scanner;

// Question2:In a program,input the side of a square.You have to out put the area of the square.

public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side length of square : ");
        int side = sc.nextInt();
        System.out.print("Area of Square is : ");
        System.out.print(side * side);
    }
}
