/*
 1 2 3 4 5 5 4 3 2 1
 1 2 3 4 _ _ 4 3 2 1
 1 2 3 _ _ _ _ 3 2 1
 1 2 _ _ _ _ _ _ 2 1
 1 _ _ _ _ _ _ _ _ 1 
 */
public class Pattern7_ab {
    public static void main(String[] args) {
        int i,j,k,c=0;
      
        for(i=1;i<=5;i++)
        {
            for ( j = 1; j <= 5; j++) {
                if (j <= 5 - i+1) {
                    System.out.print( j+ " ");
                } else {
                    System.out.print("_ ");
                }
            }
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
