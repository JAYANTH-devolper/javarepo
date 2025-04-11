public class towerofhoni {
    public static void TOWEROFHONI(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+"from "+src+"to "+dest);
            return;
        }TOWEROFHONI(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+"from "+src+"to "+dest);
        TOWEROFHONI(n-1, src, dest, helper);
        
    }
    public static void main(String[] args) {
        int n =3;
        TOWEROFHONI(n,"S","H","D");
    }
}
