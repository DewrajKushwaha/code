public class Pattern7_d {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            /*
            for(j=5-i;j>0;j--)
            {
                
                System.out.print(" _");
            }
            for(k=i;k>=1;k--)
            {
             System.out.print(" "+k);   
            }
            System.out.println();    */

            for(j=1;j<=5;j++)
            {
                if (j<=5-i) {
                    System.out.print(" _");
                }
                else{
                    System.out.print(" "+(5-j+1));
                }
            }
            System.out.println();
        }
    }
}
