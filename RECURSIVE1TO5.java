
//program is all about printing the number from 1 to 5 in a increasing order by using recursive method//
public class RECURSIVE1TO5 {
    
    public static void printnumber(int n){
        //base case//  
        if(n==6){
            return;
           }
          System.out.println(n);//operation//
          printnumber(n+1);//recursivly call function //
        }
    
    public static void main(String[] args) {
        int n=1;
        printnumber(n);
    }
}
