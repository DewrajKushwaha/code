// Table 
import java.util.*;

public class TCS_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the Number for table");
        n=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
