package Strings;

import java.util.Arrays;

public class ShortestDistance {

    public static String ShortDis(String str){
        int[] cord = {0,0};
        StringBuilder s = new StringBuilder("");
        for(int i = 0 ; i < str.length();i++){
            switch (str.charAt(i)) {
                case 'N' -> cord[1]++;
                case 'S' -> cord[1]--;
                case 'E' -> cord[0]++;
                case 'W' -> cord[0]--;
            }
        }
        System.out.println("Displacement = "+ Math.sqrt((Math.pow(cord[0],2)+Math.pow(cord[1],2))));
        if(cord[0] > 0){
            while(cord[0] > 0){
                s.append("E");
                cord[0]--;
            }
        }else{
            while(cord[0] < 0){
                s.append("W");
                cord[0]++;
            }
        }
        if(cord[1] > 0){
            while(cord[1] > 0){
                s.append("N");
                cord[1]--;
            }
        }else{
            while(cord[1] < 0){
                s.append("S");
                cord[1]++;
            }
        }
        return s.toString();
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(ShortDis(path));

    }
}
