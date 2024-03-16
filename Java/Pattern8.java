public class Pattern8 {

    public static void main(String[] args) {
        int i,j;
        int n=7;
      
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print("_ ");
            }
            for(j=i;j<i+i;j++)
            {
                if (j>9) {
                    int m=j%10;
                    System.out.print(m+" ");
                }
                else{

                    System.out.print(j+" ");
                }
            }
            for(j=i*2-2;j>=i;j--)
            {
                if (j>9) {
                    int m=j%10;
                    System.out.print(m+" ");
                }
                else{

                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}