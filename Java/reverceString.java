// Program for the reverce a string
import java.util.*;

public class reverceString {
    public static void main(String[] args) {
        int l;
        String s1=" ";
        String s2=" ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        s1=sc.next();
        l=s1.length();
        for(int i=l-1;i>=0;i--)
        {
            s2 +=s1.charAt(i);
        }
        System.out.println("The reverce of string is : "+s2);
    }
}
