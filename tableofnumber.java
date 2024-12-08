
//Question4:Write a program to print the multiplication table of a number N,entered by the user
import java.util.Scanner;

public class tableofnumber {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter a number you want to print a table");

      int num = sc.nextInt();
          
       for(int i=1; i<=10; i++){

        System.out.println("table : "+num + " * " +i+ " = " + i*num);

          
       } 
          

    }
}
