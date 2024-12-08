
import java.util.Scanner;

/*  Question2:Write a program that reads a set of integers,and then prints the sum of the even and odd integers */

public class sumofintegers{

    public static void main(String[] args) {

        // scanner use for user input


Scanner sc = new Scanner(System.in);

int evensum = 0;
int oddsum = 0;
int choice;
int number;


 do{  
    System.out.println("Enter a number :");

    number =sc.nextInt();



if(number % 2 == 0){

    evensum += number;
}
else{

    oddsum += number;
}

System.out.print("Do you want to countinue enter press 1 for yes 0 for no");
  
    choice = sc.nextInt();

    
    } 
    while(choice == 1);

    System.out.println("sum of evennumber : " + evensum);
    System.out.println("sum of odd numbers : " + oddsum);

    }
}