package PatternPrinting;

import java.util.Scanner;

public class HollowRec {
    public static void main(String args[]){
        int lineL,lineW;
        Scanner sc = new Scanner(System.in);
        lineL = sc.nextInt();
        lineW = sc.nextInt();
        for(int i = 1; i <=lineL;i++){
            for(int j = 1; j <= lineW;j++){
                if (i == 1 || i==lineL || j == 1 || j==lineW){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
