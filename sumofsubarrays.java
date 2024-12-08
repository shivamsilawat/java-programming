public class sumofsubarrays {
    


    public static void sumOfsubarrayprint(int numbers[]){

        
    int maxsum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; i++){
            
         
           int start = i;

         

            for(int j = i; j<numbers.length; j++){

            int end = j;
            int sumofsubarray = 0;
           
            System.out.print("subarray : " );
           
            for(int k =start; k<=end; k++){    
             System.out.print(numbers[k]+ " ");
             sumofsubarray += numbers[k];  

  }
   System.out.println("=> sum:   "  + sumofsubarray);

   if(sumofsubarray > maxsum){
    maxsum = sumofsubarray;


   
   }
    
    if(minimum > sumofsubarray){
         minimum = sumofsubarray;



     }

  }
      } 
      System.out.println("maxsum is : " +maxsum);  


      System.out.println("minimum value "+minimum);        
        } 
       
    
    
    public static void main(String[] args){

int numbers[] = {2,3,4,5,6,7};


   sumOfsubarrayprint(numbers);
    }
    
}

    
 
