package Recursion;

public class TowerOfHanoi {
    public static void TOH(int n , String Src , String Hlp , String Des){
        if(n==1){
            System.out.println("Moving " + n + " from " + Src + " to " + Des);
            return;
        }
        TOH(n-1 , Src , Des , Hlp);
        System.out.println("Moving " + n + " from " + Src + " to " + Des);
        TOH(n-1,Hlp,Src,Des);
    }

    public static void main(String args[]){
        int n = 4;
        TOH(n,"S","H","D");
    }
}
