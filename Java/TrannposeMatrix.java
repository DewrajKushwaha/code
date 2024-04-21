import java.util.*;
public class TrannposeMatrix {
    public static void main(String[] args) {
        int mat1[][]=new int[10][10];
        int r1,r2,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row of  matrix");
        r1=sc.nextInt();
        System.out.println("Enter column of matrix");
        r2=sc.nextInt();
        System.out.println(" Enter "+r1+"X"+r2+" element");
        for (i = 0; i <r1; i++) {
            for (j = 0; j <r2; j++) {
                mat1[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Your Orignal matrix is :");
        for ( i = 0; i <r1; i++) {
            for ( j = 0; j <r2; j++) {
               System.out.print(" "+mat1[i][j] );
                
            }
            System.out.println();
        }
        System.out.println(" The Transpose matrix is : ");
        for ( i = 0; i <r2; i++) {
            for ( j = 0; j <r1; j++) {
               System.out.print(" "+mat1[j][i] );
                
            }
            System.out.println();
        }

    }
}
