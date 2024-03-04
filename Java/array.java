import java.util.Arrays;
import java.lang.*;

public class array {
    public static void main(String[] args) {
        int[] arr;
        int arr2[];
        arr = new int[10];
        System.out.println(arr.length);

        double[] arr3 = new double[10];
        System.out.println(arr3[0]);

        boolean[] arr4 = new boolean[10];
        System.out.println(arr4[0]);
        // System.out.println(arr4[10]);

        int[] arr5 = { 3, 2, 4};
        int[][] matrix = {
                { 1, 2, 3 }, { 4, 5, 6 }
        };
        System.out.println(matrix[0][2]);
        
        int[][]matrix2=new int[10][10];
       // System.out.println(matrix2);  // this is return null values
       System.out.println(Arrays.toString(arr5));
       Arrays.sort(arr5);
       System.out.println(Arrays.toString(arr5));
    }

}
