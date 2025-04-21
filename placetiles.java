//place tiles of size 1*m in a floor of size n*m//
public class placetiles {
    public static int placestiles(int n,int m){
        if(n==m){
            return 2;
        }if(n<m){
            return 1;
        }
        //vertical
        int verticle= placestiles(n-m, m);
        //horizontal
       int horizen= placestiles(n-1, m);

       return horizen+verticle;

    }
    public static void main(String[] args) {
        int n=4;int m=2;
        System.out.println(placestiles(n, m));
    }
}
