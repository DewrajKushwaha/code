import java.util.*;
public class AdditionOfTowMatrix {
    public static void main(String[] args) {
        int mat1[][]=new int[10][10];
        int mat2[][]=new int[10][10];
        int sum[][]=new int[10][10];
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row of  matrix");
        r=sc.nextInt();
        System.out.println("Enter column of  matrix");
        c=sc.nextInt();
        System.out.println(" Enter first"+r+"X"+c+" element");
        for (i = 0; i <r; i++) {
            for (j = 0; j <c; j++) {
                mat1[i][j]=sc.nextInt();
                
            }
        }
        System.out.println(" Enter second"+r+"X"+c+" element");
        for (i = 0; i <r; i++) {
            for (j = 0; j <c; j++) {
                mat2[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Your First matrix is :");
        for ( i = 0; i <r; i++) {
            for ( j = 0; j <c; j++) {
               System.out.print(" "+mat1[i][j] );
                
            }
            System.out.println();
        }
        System.out.println("Your Second matrix is :");
        for ( i = 0; i <r; i++) {
            for ( j = 0; j <c; j++) {
               System.out.print(" "+mat2[i][j] );
                
            }
            System.out.println();
        }
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        System.out.println("The Sum of  matrix is :");
        for ( i = 0; i <r; i++) {
            for ( j = 0; j <c; j++) {
               System.out.print(" "+sum[i][j] );
                
            }
            System.out.println();
        }

    }
}
