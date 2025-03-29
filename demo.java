import java.util.*;
public class demo {
     int sum(int a,int b){
int add=a+b;
System.out.println("sum of two number="+add);
return 0;
    }
     int dif(int a,int b){
        int sub=a-b;
        System.out.println("subtraction of the two number="+sub);
        return 0;
    }
     int prdct(int a,int b){
        int mul=a*b;
        System.out.println("multiplication of two number is="+mul);
        return 0;
    }
    public static void main(String[] args) {
        //program that calculates the sum ,differnce and product of two number//
        //used bulit in functions are :-data type ,functions,arthematic operators ,input class//
Scanner sc= new Scanner (System.in);
System.out.println("enter the number ");

int a=sc.nextInt();
System.out.println("enter the number ");
int b=sc.nextInt();
demo obj=new demo();
obj.sum(a, b);
obj.dif(a,b);
obj.prdct(a, b);


    }
    
}
