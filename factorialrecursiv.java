

public class factorialrecursiv {
    
    public static int  printnumber(int n){
      
        //base case//  
        if(n==0){
            return 1;
           }else{
          
        return   n* printnumber(n-1);//recursion call function //
           }}
    public static void main(String[] args) {
        int n=5;
        int ans=printnumber(n);
        System.out.println(ans);
        
    }
}
