package Arrays;

import java.util.Scanner;

public class InpMarks {
    public static void main(String[] args){
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<=n-1;i++){
            marks[i]=sc.nextInt();
        }
        for (int i=0;i<=n-1;i++){
            System.out.println(marks[i]);
        }
    }
}
