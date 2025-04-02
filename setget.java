// USE GETTERS AND SETTERS  TO ACCESS PRIVATE ATTRIBUTES IN A CLASS//
//IN BUILT FUNCTIONS ARE USED IN THIS PROGRAMS ARE THE :CLASS,OBJECTS,PRIVATE,METHODS//
//THIS PROGRAM REPRESENT THE ENCAPSULATION OF JAVA ONE OF THE OOP CONCEPTS//
class person{
    private String name;
    public void  setteString(String new_name){
         name=new_name;
    }
    public String getName(){
        return name;
    }
}
public class setget {
    
    public static void main(String[] args) {
        person obj=new person();
        obj.setteString("JAYANTH SHETTY");
        System.out.println(obj.getName());
    }
}
