
import java.util.*;

/* Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */




public class fourthpgrm {

public static void main(String args[]){

    System.out .println("Enter the cost of your items :");

    Scanner sc = new Scanner(System.in);

    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
System.out.println("your total cost of item is: ");

double bill=pencil+pen+eraser;

if(bill>40.00){ 

   bill = bill+bill*18/100;

    

    System.out.println(bill);

}








}
    
}
