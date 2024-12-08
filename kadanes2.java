

public class kadanes2 {



        public static void subarray(int numbers[]){
            int max = Integer.MAX_VALUE;
            int cs = 0;
    
            for(int i =0; i<numbers.length; i++){
                cs = cs += numbers[i];
    
                if(cs < -1){
                    cs = 0;
                } max = Math.min(cs,max);
            }System.out.println(max);
    
    
    
        }
        public static void main(String[] args) {
            
        int numbers[] = {-1,-2,-4,-3};
        subarray(numbers);
    
    
        }
    }

    

