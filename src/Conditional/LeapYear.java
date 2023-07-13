package Conditional;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int Year = sc.nextInt();

        if(Year%4==0){

            if(Year%100 != 0){
                System.out.println(" Leap Year");
            }else{

                if(Year%400==0){
                    System.out.println("Leap year");
                } else{
                    System.out.println("Not a leap year");
                }

            }
        }else {
            System.out.println("Not a leap year");
        }
    }
}
