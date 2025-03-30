import java.util.Arrays;
//find the maximum number in the array of 5 integer//
//bulit in function used in this program are datatypes ,array,loops//
public class demo7 {
    public static void main(String[] args) {
        int[] numbers={10,2,3,30,20};
        int max=numbers[0],min=numbers[0];
        for(int num:numbers){
            if(num>max)max=num;
            if(num<min)min=num;
        }System.out.println("MAXIMUM NUMBER IN THE ARRAY IS \t="+max);
    }
}
