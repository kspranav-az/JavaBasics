import java.util.Scanner;

public class conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));

        int numint = sc.nextInt();
        System.out.println(numint);
        float numflo = (float)(numint);
        System.out.println(numflo);
        char numch = (char)(numflo);
        System.out.println(numch);
    }
}
