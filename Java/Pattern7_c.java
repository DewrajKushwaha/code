/*
 1 _ _ _ _
 1 2 _ _ _
 1 2 3 _ _
 1 2 3 4 _
 1 2 3 4 5
 */
public class Pattern7_c {
    public static void main(String[] args) {
        int i,j,k,c=0;
        for(i=1;i<=5;i++)
        {
          /*    for(j=1;j<=i;j++)
            {
                System.out.print(" "+j);
                c=j;
            }
            for(k=5-c;k>0;k--)    
            {
                System.out.print(" _");
            }
            */
            for(j=1;j<=5;j++)
            {
                if (j<=i) {
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
