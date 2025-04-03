//method overloding program//
//oops concept polymorphism//
class method{
    void add(int a,int b){
        int sum=a+b;
        System.out.println("sum of two number= \t"+sum);
    }
    void add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("sum of the three numbers \t"+sum);
    }
}
public class methodoverloding {
    public static void main(String[] args) {
        method obj=new method();
        obj.add(10,20,30);
        obj.add(10,20);
    }
}
