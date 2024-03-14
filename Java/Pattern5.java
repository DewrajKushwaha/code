/*
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */
public class Pattern5 {
    public static void main(String[] args) {
        int j,num=0,i;
        for (i=1;i<=5;i++) 
        {
            if (i%2==0) {
                num=0;
            }
            else
            {
                num=1;
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+num);
                num=(num+1)%2;
            }   
            System.out.println();     
        }
    }  
}
