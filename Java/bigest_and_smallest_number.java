
//find the biggest and smallest number present in a matrix. The condition is if the user give the -ve value then popup the error massage

import java.util.*;

/**
 * bigest_and_smallest_number
 */
/**
 * MyExp
 */
class MyExp extends Exception {
    MyExp(String s) {
        super(s);
    }
}

public class bigest_and_smallest_number {

    public static void main(String[] args) {
        int r, c, i, j;
        int max = 0;
        int min = 0;
        int mat[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix");
        r = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Enter the " + r + " X " + c + " matrix");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {

                try {
                    if (mat[i][j] < 0) {
                        i--;
                        j--;
                        throw new MyExp(" Please enter the positive number");
                    } else {
                        mat[i][j] = sc.nextInt();
                        if (max <= mat[i][j]) {
                            max = mat[i][j];
                        }
                        if (i == 0 && j == 0) {
                            min = mat[0][0];
                        }
                        if (min >= mat[i][j]) {
                            min = mat[i][j];
                        }

                    }
                } catch (MyExp e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("The smallest element in matrix is =" + min);
        System.out.println("The biggest element in matrix is =" + max);
    }

}
