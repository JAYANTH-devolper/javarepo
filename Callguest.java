//find the number of ways in which you can invite n people to your party single or in a pair//
public class Callguest {
    public static int callguest(int n){
        if(n==0 || n==1){
            return 1;
        }
        //alone
        int way1=callguest(n-1);
        //pairs
        int way2=(n-1)*callguest(n-2);

        return way1+way2;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(callguest(n));
    }
}

