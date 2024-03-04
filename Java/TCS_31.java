import java.util.*;
public class TCS_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a[][],b[][],i,m,n,p,q,j;
        a=new int[10][10];
        b=new int[10][10];
        int result[][]=new int[10][10];
        System.out.println(" Enter the number of Row and Colomn of First matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter the "+m*n+" element in first matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Enter the number of Row and Colomn of Second matrix");
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("Enter the "+p*q+" element in second matrix");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println(" \n ##########  Enter the choice  ########## ");
        System.out.println(" Enter 1. for the addition of two matrix ");
        System.out.println(" Enter 2. for the subtraction of two matrix ");
        System.out.println(" Enter 3. for the multiple of two matrix ");
        int ch;
        ch=sc.nextInt();
        System.out.println("        The first matrix is : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.println();
        }
        System.out.println(" \n      The second matrix is :");
         for(i=0;i<p;i++)
        {   
            for(j=0;j<q;j++)
            {
                System.out.print("\t"+b[i][j]);
            }
            System.out.println();
        }
        switch (ch) {
            case 1: for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                             result[i][j]=a[i][j]+b[i][j];
                        }

                    }

                break;
        
            case 2: for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                             result[i][j]=a[i][j]-b[i][j];
                        }

                    }
                break;
        
            case 3: for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                            for(int k=0;k<n;k++)
                            {
                                result[i][j]=result[i][j] +a[i][k]*b[k][j];

                            }
                        }

                    }
                break;
        
            default:System.out.println("Inviled Choice");
                break;
        }
        System.out.println(" The Final result is : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" \t\t"+result[i][j]);
            }
            System.out.println();
        }
        
    }
}
