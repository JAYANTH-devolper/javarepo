import java.util.*;
/*program is all about to print the pattern of right angled traiangle=
*
**
***
****
*****
 
//used built in functions are :-datatypes ,nested loops,input class// 
 */
public class demo5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the number to print the right angle traiangle");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
}
