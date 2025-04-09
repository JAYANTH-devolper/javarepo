// insertion sort //
public class insertionsort {
    public  static void printarr(int arr[]){
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+ " ");}}

    public static void main(String[] args) {
        int[] arr={4,5,10,2,1,6};
        for(int i=1;i<6;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
            
    printarr(arr);
        }
    }

