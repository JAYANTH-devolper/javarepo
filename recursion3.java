public class recursion3{
    public static int printpath(int i ,int j,int n,int m){
        if( i==n||  j==m){
            return 0;
        }if( i==n-1||  j==m-1 ){
            return 1;
        }
        //to move downword//
        int downword=printpath(i+1,j,n,m);
        //to move rightword//
        int rightword=printpath(i,j+1,n,m);

        return downword+rightword;
        }
    public static void main(String[] args) {
        int n=3;int m=3;
int countofpath=printpath(0, 0, n, m);
System.out.println(countofpath);
    }
}




