import java.util.*;

public class multiplicationOfMatrix {
    public static void main(String[] args) {
        int mat1[][] = new int[10][10];
        int mat2[][] = new int[10][10];
        int z[][] = new int[10][10];
        int r, c, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of  matrix");
        r = sc.nextInt();
        System.out.println("Enter column of  matrix");
        c = sc.nextInt();
        if (r == c) {

            System.out.println(" Enter first " + r + "X" + c + " element");
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    mat1[i][j] = sc.nextInt();

                }
            }
            System.out.println(" Enter second " + r + "X" + c + " element");
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    mat2[i][j] = sc.nextInt();

                }
            }

            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    z[i][j] = 0;
                    for (int k = 0; k < r; k++) {
                        z[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println(" The Multipllication of matrix is : ");
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    System.out.print(" " + z[i][j]);

                }
                System.out.println();
            }
        } else {
            System.out.println(" The multiplication of matrix is not posible");
        }

    }
}
