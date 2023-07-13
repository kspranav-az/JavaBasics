package VarAndDatTyp;
import java.util.Scanner;

/* Question3:Enter cost of 3 items from the user (usingfloatdatatype)
-a pencil,a pen and an eraser. You have to output the total cost of the
items back to the user as their bill.(Add on : You can also try adding 18% gst
 tax to the items in the bill as an advanced problem)
 */

public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float Total,tax ;

        System.out.print("Enter Cost of Pencil : ");
        float Pencil = sc.nextFloat();
        System.out.print("Enter Cost of Pen    : ");
        float Pen = sc.nextFloat();
        System.out.print("Enter cost of Eraser : ");
        float Eraser = sc.nextFloat();

        Total = Pencil+Pen+Eraser;
        tax = Total * 0.18f;

        System.out.print("Total Amount : ");
        System.out.println(Total);
        System.out.print("After applying 18% gst tax \ngst = ");
        System.out.println(tax);
        System.out.print("Grand Total  : ");
        System.out.print(Total + tax);
    }
}
