package PatternPrinting;

import java.util.Scanner;

public class Diamond {
    public static int n;
    public static void line(int l){
        for(int j=1;j<=n-l;j++){
            System.out.print("  ");
        }for(int j=1;j<=2*l-1;j++){
            System.out.print("* ");
        }System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            line(i);
        }for (int i=n-1;i>=1;i--){
            line(i);
        }
    }
}
