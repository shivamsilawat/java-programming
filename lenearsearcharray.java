

public class lenearsearcharray {


public static int search(int arr[] , int key){
   

    int start = 0;
    int end = arr.length;

    for(int i = start; i<end;  i++)
   {

    if(arr[i] == key){
         return i;
  
    }
    


   }

   return -1;
   



  
} 



      
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,3,7,9};

         int key = 7;

        

        int index = search(arr,key);

        if(index == -1){

            System.out.println("key not found");

        }
        else{

        System.out.println("index of key "  +key +" is  " +index);
        }

     


    }
    
}
