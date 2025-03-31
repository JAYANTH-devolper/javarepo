//program is about to check a string is a palidrom are not//
//in built function are used in this program are:-string methods,function //  
public class sample {
    public static boolean isPalindrome(String str){
        String reversed =new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
        
    public static void main(String[]  args){
    
        System.out.println(isPalindrome("mam"));
        System.out.println(isPalindrome("hello"));
        
    
        }
    }
    

