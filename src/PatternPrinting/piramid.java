package PatternPrinting;

import java.util.Scanner;

public class piramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lines;
        lines = sc.nextInt();

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
              System.out.print(j);
            };
            System.out.println();
        };
    }
}
