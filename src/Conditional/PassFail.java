package Conditional;
import java.util.Scanner;
public class PassFail {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);

        int Mark = sc.nextInt();
        String status ;

        status = (Mark>33)?"PASS":"FAIL";

        System.out.print(status);
    }
}
