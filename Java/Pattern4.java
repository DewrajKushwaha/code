/*
 * 1 2 3 4 5
 * 2 3 4 5
 * 3 4 5
 * 4 5
 * 5 
 */
public class Pattern4 {
    public static void main(String[] args) {
        int j,i;
        for (i=1;i<=5;i++) 
        {
            for(j=i;j<=i;j++)
            {
                System.out.print(" "+j);
            }   
            System.out.println();     
        }
    }  
}
