import java.util.*;
//program is all about to check wheather the number is odd or even //
//used in built functions are :-datatypes ,input class,conditions statements and operators //
public class demo3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number pleae to check itys odd or even ");
        int number =sc.nextInt();
        if(number %2==0){
            System.out.println("you entered number is"+number+"even");
        }else{
            System.out.println("you entered number is"+number+"odd");
        }
    }
    
}
