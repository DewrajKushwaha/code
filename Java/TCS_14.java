import java.util.*;
public class TCS_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value for shift :");
        a=sc.nextInt();
        b=a<<2;
        System.out.println("The  Left Sifted value is : "+b);
        System.out.println("The  Right Sifted value is : "+(a>>2));

    }
}
