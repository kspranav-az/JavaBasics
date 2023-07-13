package Loops;

import java.util.Scanner;

public class RevNum {
    public static void main(String args[]){
        Scanner Sc =new Scanner(System.in);

        int num = Sc.nextInt();
        int Rev = 0;

        for(int n = num  ;n>0;n/=10){
            Rev = (Rev * 10) + (n%10);
        }

        System.out.println(Rev);
    }
}
