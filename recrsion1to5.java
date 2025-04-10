//program is all about the printing number from 5 to 1 in a decresing order by using recursive//

public class recrsion1to5 {

    public static void printnumber(int n){
    //base case//  
    if(n==0){
        return;
       }
      System.out.println(n);//operation//
      printnumber(n-1);//recursion call function //
    }
    public static void main(String[] args) {
        int n=5;
        printnumber(n);
        
    }
}
