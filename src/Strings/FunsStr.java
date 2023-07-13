package Strings;

public class FunsStr {

    public static String LargestStr(String s1 , String s2){
        if (s1.compareTo(s2) > 0){
            return s1;
        }else {
            return s2;
        }
    }

    public static String SubStr(String s , int si , int ei){
        StringBuilder str = new StringBuilder("");
        for(int i = si ; i < ei ; i++){
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    public static String ToTitle(String str){
        StringBuilder s = new StringBuilder("");
        s.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1 ; i < str.length() ; i++ ){
            if(str.charAt(i)==' ' && i < str.length()-1){
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            }else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }

    public static String compress(String str){
        StringBuilder s = new StringBuilder("");

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            Integer count = 1;

            while(i < str.length()-1 && str.charAt(i+1) == ch){
                count++;
                i++;
            }
            if(count > 1){
                s.append(ch).append(count);
            }else{
                s.append(ch);
            }
        }
        return s.toString();
    }

    public static void main(String args[]){
        String s1 = "apple is red. " , s2 = " bbbaaahllll";
        System.out.println(LargestStr(s1,s2));
        System.out.println(SubStr(s1,2,5));
        System.out.println(ToTitle(s1));
        System.out.println(compress(s2));
    }
}
