import java.util.*;
public class TCS_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The Greatest value is : "+(a>b?a:b));
    }
}
