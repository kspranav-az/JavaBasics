package Recursion;

public class RemDups {

    public static void RemoveDuplicates(StringBuilder str , int idx , boolean map[] , StringBuilder nstr){
        if(idx == str.length()){
            return;
        }
        if(!((map[str.charAt(idx)- 'a']))){
            nstr.append(str.charAt(idx));
            map[str.charAt(idx) - 'a'] = true;
        }
        RemoveDuplicates(str,idx+1 ,map ,nstr);
    }

    public static void main(String args[]) {
        boolean[] map = new boolean[26];
        StringBuilder str = new StringBuilder("happybirthdaysomeone");
        StringBuilder nstr = new StringBuilder("");
        RemoveDuplicates(str,0,map,nstr);
        System.out.println(nstr);

    }
}
