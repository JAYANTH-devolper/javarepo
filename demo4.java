import java.util.*;
//program is allabout the printing the number from the 1 to 10 by using the all three loops //
//used in built function are:- loops,datatypes,input class,functions//
public class demo4 {
    int forrlup(int n){
        System.out.println("the number from the for loops");
        for(int i=1;i<=n;i++){
            System.out.println(i);}
            return 0;
        }
     int whilelup(int n){
        System.out.println("the number from the while loops");
        int i=1;
        while (i<=n) {
            System.out.println(i);
            i++;
            
        }return 0;
     } 
     int dowhilelup(int n){
        System.out.println("the number from the do loops");
        int i=1;
        do{
System.out.println(i);
i++;
        }while(i<=n);
        return 0;
     }  

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the number ");
        int n=sc.nextInt();
        demo4 obj=new demo4();
        obj.forrlup(n);
        obj.whilelup(n);
        obj.dowhilelup(n);
    }
}
