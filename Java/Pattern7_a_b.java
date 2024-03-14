/*
 5 4 3 2 1
 _ 4 3 2 1
 _ _ 3 2 1
 _ _ _ 2 1
 _ _ _ _ 1
 */
public class Pattern7_a_b {
    public static void main(String[] args) {
        int i,k,j;
        for ( i = 1; i <=5; i++) {
           /* for(k=i-1;k>0;k--)
            {
                System.out.print(" _");
            }
            for(j=5-i+1;j>=1;j--)
            {
                System.out.print(" "+j);
            }
             */
            for(j=5;j>=1;j--)
            {
                if ((i+j)<=6) {
                    System.out.print(" "+j);
                }
                else
                {
                    System.out.print(" _");
                }
            }
            System.out.println();
        }
    }
}
