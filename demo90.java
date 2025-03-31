import java.util.*;
//program is related about the finding the factorial number by using the recursion method//
//in built function are used in this program are :-input class,datatype,function//
public  class demo90 {
    public static long factorial(int n){
        if(n==0 || n==1){return 1;}else{
        return n*factorial(n-1);}
    }

    
 
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number :(factorial)");
        int n=sc.nextInt();
        System.out.println("factorial of number you have entered :"+n+"= "+factorial(n));

    }
}
