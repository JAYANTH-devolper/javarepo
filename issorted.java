//checking if an a array is sorted or not (Stricly increasing) by using recursion//
public class issorted {
    public static boolean arraycheck(int[] arr,int idx){
        if(idx == arr.length-1){
          return true;
            }
        
        if(arr[idx]<arr[idx+1]){
        
            return arraycheck(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(arraycheck(arr, 0));
    }
}
