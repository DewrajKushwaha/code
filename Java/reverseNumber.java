import java.util.*;
public class reverseNumber {
 
    public static void main(String[] args) {
        int num,rev=0,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        while (num>0) {
            res=num%10;
            rev = rev*10+res;
            num=num/10;

        }
        System.out.println("The Reverse of number is : "+rev);
    }
}
