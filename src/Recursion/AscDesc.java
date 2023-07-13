package Recursion;

public class AscDesc {
    public static int NSum(int n){
        if(n==1){
            return 1;
        }
        return n + NSum(n-1);
    }
    public static void NumAsc(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        NumAsc(n-1);
        System.out.println(n);
    }
    public static void NumDesc(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        NumDesc(n-1);
    }

    public static void main(String args[]){
        System.out.println(NSum(7));
    }
}
