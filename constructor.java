//modifying a previous program the car class to include a constructor that sets values//
//in built functions are used in this program are :=constructor and class,methods //
class car{
    String brand;
    int speed;
    car(){
        brand="Honda";
        speed=210;
    }
    void display(){
        System.out.println("BRAND OF CAR: "+brand+"\n"+"SPEED LIMIT OF CAR:"+speed);
    }
}
public class constructor {
    public static void main(String[] args) {
        car sc=new car();
        sc.display();
    }
    
}
