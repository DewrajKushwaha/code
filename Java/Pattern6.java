/*
 * ----1
 * ---2 3
 * --4 5 6
 * -7 8 9 10
 * 11 12 13 14 15
 */
public class Pattern6 {
    public static void main(String[] args) {
        int j,i,n=0;
        for (i=1;i<=5;i++) 
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print("_");
            }
            for(j=1;j<=i;j++)
            {
                n=n+1;
                System.out.print(" "+n);
            }   
            System.out.println();     
        }
    }  
}
