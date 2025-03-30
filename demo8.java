import java.util.Scanner;
//program is to take 2d 3*3 array input and print //
//in built function are used input class,array,datatypes,loos//
public class demo8 {
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows:");
    int row=sc.nextInt();
    System.out.println("enter the cols:");
    int cols=sc.nextInt();
int[][] arr=new int[row][cols];

    //this loops to take 2array elements input from te user//
    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            System.out.print("elements["+i+"]["+j+"]:");
             arr[i][j]=sc.nextInt();
        }
    }
    //this loop is for to print the 2d array elements 
    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            System.out.print(arr[i][j]+" ");
            
        }System.out.println();
    }
sc.close();
    }
}
