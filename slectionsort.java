//slection sort//
public class slectionsort {
     public  static void printarr(int arr[]){
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+ " ");

    }}
    public static void main(String[] args) {
        int[] arr={8,9,5,1,2};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                 smallest=j;}
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        slectionsort obj=new slectionsort();
      obj.printarr(arr);
    
    
}
}