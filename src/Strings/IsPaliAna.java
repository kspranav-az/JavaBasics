package Strings;
import java.util.*;

public class IsPaliAna {
    public static boolean IsIn( int j ,int[] arr){
        for (int k : arr) {
            if (k == j) {
                return true;
            }
        }
        return false;
    }
    public static boolean IsIn(char ch ,String str ,int[] ind,int j){
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ch && (! IsIn(i,ind))){
                ind[j] = i;
                return true;
            }
        }return false;
    }
    public static boolean IsAnagram(String str1,String str2){

        if(str1.length() == str2.length()){
            int[] index = new int[str1.length()];
            Arrays.fill(index,-1);
            for(int i = 0 ; i < str1.length() ; i++){
                if(! IsIn(str1.charAt(i),str2,index,i)){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    public static boolean IsPalindrome(String str1){
        int i = 0,n=str1.length();
        while(i <= (n/2)){
            if(str1.charAt(i) != str1.charAt(n-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        String str = sc.next();
//        System.out.println(IsPalindrome(str));
        System.out.println(IsAnagram("hello","lehlo"));
    }
}
