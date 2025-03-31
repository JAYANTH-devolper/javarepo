//this program is all about the sorting the array elements in the acending order by using bubblesort method//
//in built datatypes are used in the programs are:-loops,array,datatypes//
public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,2,3,9,1};
       int n=4;
 for(int i=0;i<=n-1;i++){
    int flag=0;
    for(int j=0;j<=n-1-i;j++){
        if(arr[j]<arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            flag=1;
        }
    }if(flag==0)break;
 }
 for(int i=0;i<=n;i++){
    System.out.print(arr[i]+" ");
 }
    }
}
