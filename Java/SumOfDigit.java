import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        int n ,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while (n>0) {
            sum +=n%10;
            n=n/10;
        }
        System.out.println("The Sum of Digit is ="+sum);

    }
}
