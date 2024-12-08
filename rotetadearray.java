
  import java.util.*;

public class rotetadearray {


public static int rotetade(int nums[] ,int target){

int l = 0;// left start of an array
int r = nums.length - 1;// r= right end of an array

while(l<r){

    int mid = (l+r)/2;

    if(nums[mid] == nums[target]){

         return nums[target];

    } else {
          if(l>= nums[target] && nums[target] <= r){

          }
    }



}
  return -1;
}





    public static void main(String[] args) {
     int nums[] = {4,5,6,7,0,1,2,3};
     int target;

     for(int i = 0; i<nums.length; i++){

        System.out.print( nums[i] +  " " );
     }

     System.out.println();

    //System.out.println("target found " + nums[mid]);
      
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the target of an array you want to check");




      target = sc.nextInt(); 


      rotetade(nums,target);

     //0 System.out.println("target found"+  nums[mid]);
    }
    
}
