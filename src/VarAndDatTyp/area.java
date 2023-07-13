import java.util.Scanner ;

public class area {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers\n");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;
        int sum = a + b;
        int rad = product + sum;

        float area =  3.14f * rad * rad;
        System.out.print("Number of Circles :");
        int tim = sc.nextInt();

        System.out.println(area*tim);

    }
}
