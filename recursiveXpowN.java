public class recursiveXpowN {
    public static int xpown(int x,int n){
        
        if(n==0){
            return 1;
        }else{
           return  x* xpown(x ,n-1);
        }
        
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int result= xpown(x, n);
        System.out.println(result);
    }
    
}
