package Recursion;

public class TilingProblem {
    public static int Tiling(int n){
        if(n ==0 || n == 1){
            return n;
        }
        return Tiling(n-1) + Tiling(n-2);
    }

    public static void main(String args[]){
        System.out.println(Tiling(6));
    }
}
