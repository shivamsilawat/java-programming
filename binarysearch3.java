public class binarysearch3 {



       public static int search(int nums[], int target){

    int left = 0;
    int end = nums.length;

    while(left<end){
    int mid = (left + end)/2;


    if(nums[mid] == target){

     return mid;

    }else if(target > nums[mid]){
        left = mid+1;

    }else{
        end = mid;

    }
    

     }

      return -1; 
    }
   


    public static void main(String[] args) {
    int nums[] = {2,3,4,5,6,7,8};

      int target =8;


      int result =search(nums,target);

      if(result == -1){
        System.out.println("target not found");

      }else{
        System.out.println("target found");
      }



    }
    
}
