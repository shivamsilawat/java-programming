
import java.util.Scanner;

public class palindromnum {

public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");


int num;
int temp;
int reverse = 0;
int result;


 num = sc.nextInt();
    temp =num;
 
 while(num != 0){

    result = num%10;

    reverse = reverse*10 + result;

      num = num/10;

 }
   if( reverse == temp){

    System.out.println("number is palindrome: ");

  }else{

    System.out.println("number is not palindrome:");
  

 }



    }

}
