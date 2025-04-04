//program is all about linear serach//
public class linearsech {
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7};
    int keyelement=5;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==keyelement){
        System.out.println("keyelement found at the location ["+i+"]="+keyelement);
    }else{
        System.out.println("keyelemnt not found");
    }
}    
}}
