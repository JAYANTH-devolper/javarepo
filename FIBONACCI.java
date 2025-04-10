import java.util.Scanner;

public class FIBONACCI {
    
    public static int  fibo(int a,int b,int n){
if (n==0 ){
    return a;}
if(n==1){return b;}
else{
    int c=a+b;
    System.out.println(c);
    return fibo(b,c,n-1);
}
}
    
    public static void main(String[] args) {
        int n=7;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
int result =fibo(a, b, n);
System.out.println(result);
    }
}
