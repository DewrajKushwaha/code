public class Pattern7_b {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  +");
            }
            for (int j = n - i; j >= 1; j--) {
                if (j != n)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
 
