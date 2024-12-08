
import java.util.Scanner;

public class duplicateinarray {


 public static boolean duplicate(int numbers[] ){

   

     
    int n = numbers.length;

    for(int i = 0; i<n-1; i++){

        for(int j = i+1; j<n; j++){

           if(numbers[i] == numbers[j]){
          
                return true;

            }
        }

             }



        return  false;
} 

    public static void main(String[] args) {
        
    int numbers[]  = new int[5];
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the element of an array: " +" ");
         
     for(int i =0; i<numbers.length; i++){
                  
         

        
        numbers[i]= sc.nextInt();
     } 
   
       System.out.println("is there are duplicate elemant :");

      System.out.println("result is "+( duplicate(numbers)));

    }
    
}
