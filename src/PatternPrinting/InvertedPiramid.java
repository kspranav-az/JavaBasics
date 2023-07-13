package PatternPrinting;

import java.util.Scanner;

public class InvertedPiramid {
    public static void main(String arg[]){
        int lines;
        Scanner sc = new Scanner(System.in);
        lines = sc.nextInt();
        for(int i = 1 ; i<=lines ; i++){
            for(int j = 1 ; j <= lines-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        };
    }
}
