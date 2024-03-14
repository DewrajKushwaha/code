
/*
 * 5 4 3 2 1
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 */
public class Pattern3 {
    
    public static void main(String[] args) {
        int j,i;
        for (i=1;i<=5;i++) 
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" "+j);
            }   
            System.out.println();     
        }
    }  
}
