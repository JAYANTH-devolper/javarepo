//create a car class with properties like brand and speed//
//in built function are used in this program are :-class,methods and objects//
class car{
    String brand;
    int speed;
    void display(){
        System.out.println("BRAND OF CAR: "+brand+"\n"+"SPEED LIMIT OF CAR:"+speed);
    }
}
public class classobj {
    public static void main(String[] args) {
        car sc=new car();
        sc.display();
    }
}
