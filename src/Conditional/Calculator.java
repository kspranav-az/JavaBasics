package Conditional;

import java.util.Scanner;

public class Calculator {
    public  static void main(String args[]){
        Scanner Sc = new Scanner(System.in);

        int a = Sc.nextInt();
        int b = Sc.nextInt();
        char operator = Sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Enter a valid operator .... !");
        }
    }
}
