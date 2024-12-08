public class lenearsearcharray2 {




    public static boolean search(String list[], String key) {

        for(int i =0; i<list.length; i++){

            if(list[i] == key){

                return true;

            }
        }

      return false;
    }

    public static void main(String[] args) {
        
    String list[] = {"samosa","roti","bred","halwa"};


     String key = "kachori";

    boolean result =search(list,key);
    if(result == false){

        System.out.println("dish not found");
    }else{
    System.out.println("dish available");
    }

      

    }
    
}
