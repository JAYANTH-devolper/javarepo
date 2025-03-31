
//this program is related about creating an overloaded method that prints an integer ,a double and a string//
//in built functions used in this program are :-datatypes,methods//

public class sample {
    
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }

    
public static void main(String[]  args){

sample obj=new sample();
int addn=obj.add(10,20);
double add_d=obj.add(10.1,10.3);
String add_sString=obj.add("ding","dong");
System.out.println(addn);
System.out.println(add_d);
System.out.println(add_sString);
  
    

    }
}
    

