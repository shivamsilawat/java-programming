
import java.util.Scanner;

public class positivenum {

    public static void main(String[] args) {
        
    System.out.println("Enter number a:");
        Scanner sc =new Scanner(System.in);
            int a  = sc.nextInt();
     
           

        String num = a>0?"positive number":"negative number";
    System.out.println(); 

    }
    
}
