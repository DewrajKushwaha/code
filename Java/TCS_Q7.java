// Reverse a number
import java.util.*;

public class TCS_Q7 {
    public static void main(String[]args){
        int n,a,r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Reverse");
        n=sc.nextInt();
        while (n>=1) {
            a=n%10;
            r=r*10+a;
            n=n/10;
        }
        System.out.println("The Reverse number is "+r);
    }
}
