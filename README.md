KADANES ALGORITHEM 

public static void subarray(int numbers[]){
    int max = Integer.MIN_VALUE;
    int cs = 0;

    for(int i =0; i<numbers.length; i++){
        cs = cs += numbers[i];

        if(cs < 0){
            cs =0;
        } max = Math.max(cs,max);
    }System.out.println(max);



}
public static void main(String[] args) {
    
int numbers[] = { -2,-3,4,-1,-2,1,5,-3};
subarray(numbers);


}
