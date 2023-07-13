package PatternPrinting;

import java.util.Scanner;

public class _01Triangle {
    public static int Oci_01(int a){
        if (a == 0){
            return 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        for(int i = 1 ; i<=n ;i++ ){
            if ((i&1)!=0){
                b = Oci_01(b);
            }
            for(int j = 1 ; j<=i ; j++){
                b = Oci_01(b);
                System.out.print(b);
            }System.out.println();
        }
    }
}
