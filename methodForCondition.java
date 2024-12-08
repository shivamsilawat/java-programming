
import java.util.Scanner;




public class methodForCondition {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    
    int num;
    num = sc.nextInt();

    if(isEven(num)){

        System.out.println("The number is even");
    
    }else{

        System.out.println("the number is odd");
    }



    
    }
    
public static boolean isEven(int num){

     
    if(num % 2 == 0){

        return true;
    }else {

        return false;
     }
    

 }



    

 


}



