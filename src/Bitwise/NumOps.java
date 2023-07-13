package Bitwise;

import java.util.Scanner;

public class NumOps {
    public static void PrintBinary(int n ){
        System.out.println(Integer.toBinaryString(n));
    }
    public static boolean IsPow2(int n){
        return (n&(n-1)) == 0;
    }
    public static boolean IsEven(int n){
        return (n&1) == 0;
    }
    public static int CountSeti(int n){
        int count = 0;
        while(n>0){
            if(! IsEven(n)){
                count++;
            }
            n>>=1;
        }return count;
    }
    public static int FastExpPow(int n , int x){
        int ans = 1;
        while (x>0){
            if(! IsEven(x)){
                ans *= n;
            }
            n*=n;
            x>>=1;
        }
        return ans;
    }
    public static char Lower(char ch){
        return (char)(ch|' ');
    }
    public static char SwapCase(char ch){
        return (char)(BitwiseOps.Geti(ch,5) == 0 ? BitwiseOps.Updatei(ch,5,1) :BitwiseOps.Updatei(ch,5,0));
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        char n =53;
        char n2 = 4;
        PrintBinary(n2);
        PrintBinary(n);
        System.out.println(IsEven(n));
        System.out.println(IsPow2(n));
        System.out.println(CountSeti(n));
        System.out.println(FastExpPow(n,5));
        System.out.println(Lower('t'));
    }
}
