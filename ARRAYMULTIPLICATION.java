public class ARRAYMULTIPLICATION {
    public static void main(String[] args) {
        
    
    // Example 2D arrays
    int[][] array1 = {
        {1, 2, 3},
        {4, 5, 6}
    };

    int[][] array2 = {
        {7, 8, 9},
        {10, 11, 12}
    };

    // Check if dimensions match
    if (array1.length != array2.length || array1[0].length != array2[0].length) {
        System.out.println("Arrays must be of the same size");
        return;
    }

    int[][] result = new int[array1.length][array1[0].length];

    // Element-wise multiplication
    for (int i = 0; i < array1.length; i++) {
        for (int j = 0; j < array1[0].length; j++) {
            result[i][j] = array1[i][j] * array2[i][j];
        }
    }

    // Print the result
    System.out.println("Result of element-wise multiplication:");
    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
}
}