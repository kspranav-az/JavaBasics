package PatternPrinting;

import java.util.Scanner;

public class FLOYDsTriangle {
    public static void main(String[] args){
        int s = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print(s++ + " ");
            }
            System.out.println();
        }
    }
}
