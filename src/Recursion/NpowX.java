package Recursion;

public class NpowX {
    public static int Pow(int n , int x){
        return (x==0)?1:(n * Pow(n,x-1));
    }
    public static int PowOpt(int n , int x){
        int pow = Pow(n,x/2);
        pow*=pow;
        return x==0?1:(((x&1)==0)?pow:n*pow);
    }
    public static void main(String args[]){
        System.out.println(Pow(5,8));
        System.out.println(PowOpt(5,8));
    }
}
