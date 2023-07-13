package Loops;

import java.util.Scanner;

public class Fact {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Num;
        int fact = 1;
        Num = sc.nextInt();

        while(Num >= 1){
            fact *= Num;
            Num--;
        };
        System.out.println(fact);
    }
}
