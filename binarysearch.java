
import java.util.*;
public class binarysearch {
      


    public static int search(int numbers[], int key){

        int start =0, end = numbers.length-1;
           
        while(start <= end){

               int mid = (start + end)/2;

               // condition 

               if(numbers[mid] == key){// found
                
                return mid;
               }
               if(numbers[mid] < key){// right
                start = mid+1;

               }
               else{ // left

                end = mid-1;

               }

        }

       

     
        
   
        return -1;
    }

    
    public static void main(String[] args) {
        
    int numbers[] = {1,2,3,4,5,6,7,8,9,10};

    int key ;


    Scanner sc = new Scanner(System.in);


      System.out.println("Enter a you want to search");

    key = sc.nextInt();
    
   int index = search(numbers,key);


  if(index != -1){

    System.out.println("index is for "+key+   " is "   +index);

  }
  else{

    System.out.println("the key is not found " +key);

  }


     
    }
    
} 
