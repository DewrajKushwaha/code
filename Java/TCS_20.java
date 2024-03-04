public class TCS_20 {
    public static void main(String[] args) {
        int i,j,row=3;
        for(i=1;i<=row;i++)
        {
            for(j=row;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
