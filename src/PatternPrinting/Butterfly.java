package PatternPrinting;

import java.util.Scanner;


public class Butterfly{
    public static int n;
    public static void line(int l){
        for(int i=1;i<=l;i++){
            System.out.print("* ");
        }for (int i=1 ; i<=2*(n-l);i++){
            System.out.print("  ");
        }for(int i=1;i<=l;i++){
            System.out.print("* ");
        }System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int j=1;j<=n;j++){
            line(j);
        }
        for (int j=n;j>=1;j--){
            line(j);
        }
    }
}

