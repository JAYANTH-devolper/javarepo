//create a dog class that inherits from Animal class//
//in built functions are used in this program are :-class,methods,objects//
//this program comes under the concept of oop in the java //
class Animal{
    String name;
    void eat(){
        System.out.println(name+"is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println(name+"is barking");
    }
}


public class inherit {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.name="RAMU";
        obj.eat();
        obj.bark();
    }
}
    

