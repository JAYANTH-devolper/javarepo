public class recursion {
    public static void reverseString(String str,int idx){
        if(idx == 0){
          
            
            return;
        }
        System.out.println(str.charAt(idx));
        reverseString(str,idx-1);
    }
    public static void main(String[] args) {
        String str="abcd";
       reverseString(str,str.length()-1); 
    }
}
