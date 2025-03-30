//this program is related about the creating functions and calling functions and the returning the sum values to the main functions //
//built in functions are ued in this are :-functions ,datatypes and objects//
public class demo {

    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
       demo obj=new demo();
       int add=obj.sum(10,20); 
       System.out.println("sum of two numbers  :"+add);
        
    }
}
