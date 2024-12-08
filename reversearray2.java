

public class reversearray2 {

  public static void  reverse(int numbers[]){

 System.out.println();
    int start = 0;
    int last = numbers.length-1;

    while(start<last){
           
        int temp = numbers[last];
       
        numbers[last]=numbers[start];

        numbers[start] = temp;

       
        start++;
        last--;

    
    }

    System.out.println("after reverse");

     for(int i =0; i<numbers.length; i++){

        
        System.out.print(numbers[i]+ " ");
     }
      
}




    public static void main(String[] args) {
        
        int numbers[] = {2,3,4,5,6,7};



        
         reverse(numbers);
         
    }
    
}
