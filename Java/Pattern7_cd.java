/*
 1 _ _ _ _ _ _ _ _ 1
 1 2 _ _ _ _ _ _ 2 1
 1 2 3 _ _ _ _ 3 2 1
 1 2 3 4 _ _ 4 3 2 1
 1 2 3 4 5 5 4 3 2 1
 */
public class Pattern7_cd {
  public static void main(String[] args) {
    
    int i,j;
    for(i=1;i<=5;i++)
    {
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
