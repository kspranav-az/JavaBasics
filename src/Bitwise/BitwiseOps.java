package Bitwise;

public class BitwiseOps {
    public static void PrintBinary(int n ){
        System.out.println(Integer.toBinaryString(n));
    }
    public static int Geti(int n , int i){
        int BitMask = 1<<i;
        return (n&BitMask)>>i;
    }
    public static int Seti(int n , int i){
        int BitMask = 1<<i;
        return n|BitMask;
    }
    public static int Cleari(int n , int i){
        int BitMask = (~0)^(1<<i);
        return n&BitMask;
    }
    public static int Updatei(int n , int i , int j){
        return Cleari(n,i)|(j<<i);
    }
    public static int ClearLast_is(int n , int i){
        int BitMask = (~0)<<i;
        return n&BitMask;
    }
    public static int ClearRangei(int n,int i, int j){
        int BitMask = ((~0)<<j+1)|((1<<i)-1);
        return n&BitMask;
    }
    public static void main(String[] args ){
//        int n = 64-1;
//        PrintBinary(n);
//        PrintBinary(Geti(n,4));
//        PrintBinary(Seti(n,1));
//        PrintBinary(Cleari(n,1));
//        PrintBinary(Updatei(n,2,0));
//        PrintBinary(ClearLast_is(n,4));
//        PrintBinary(ClearRangei(n,1,3));
        PrintBinary('A');
        PrintBinary('a');
    }
}
