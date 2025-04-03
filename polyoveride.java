//override a method in a subclass//
//oops concept=polymorphisim//

class Animal{
   void sound(){
        System.out.println("just a sound.....");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("bark");
    }
}
public class polyoveride {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sound();
    }
}
