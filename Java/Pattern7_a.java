/*
 1 2 3 4 5
 1 2 3 4 _
 1 2 3 _ _
 1 2 _ _ _
 1 _ _ _ _
 */
public class Pattern7_a {
    public static void main(String[] args) {
        int i,j,k,c=0;
        System.out.println();
        for(i=1;i<=5;i++)
        {
            for( j=1;j<=5-i+1;j++)
            {
                System.out.print(" "+j);
                c=j;
            }
           for(k=c;k<5;k++)
           {
               System.out.print(" _");
            }
            /*
             for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i+1) {
                    System.out.print( j+ " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
            */
            System.out.println();
        }
    }
}
