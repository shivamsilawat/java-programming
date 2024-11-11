
import java.util.Scanner;

public class conditional {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of tem");

        double temp = sc.nextDouble();


            String result = temp>100?"you have fever":"you have no fever";

        System.out.println(result);
    }
    
}
