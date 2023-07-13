package Loops;

import java.util.Scanner;

public class SumFirstNNatural {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);

        int num,count,sum;

        num = Sc.nextInt();
        sum=0;
        count=0;
        while (count<=num){
            sum+=count;
            count++;
        }

        System.out.println(sum);

    }
}
