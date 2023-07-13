package Functions;

import java.util.Scanner;


public class Qs {

    public static boolean IsPali(int n){
        int sum = 0 , N = n;
        while(N>0){
            sum=sum*10+N%10;
            N=N/10;
        }
        return sum == n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(IsPali(num));
        System.out.println(Math.signum(num));
    }
}
