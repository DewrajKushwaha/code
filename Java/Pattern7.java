/**
1 2 3 4 5 
1 2 3 4 _ 
1 2 3 _ _
1 2 _ _ _
1 _ _ _ _
 */
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
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
    }
}
