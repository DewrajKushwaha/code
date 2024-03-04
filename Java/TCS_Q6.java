// Swap without third variable
import java.util.Scanner;
public class TCS_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two number for swap");
        a=sc.nextInt();
        b=sc.nextInt();
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("The swap result a is "+a+" b is "+b);

    }
    
}
