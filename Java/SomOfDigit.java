import java.util.*;
public class SomOfDigit {
    public static void main(String[] args) {
        int n ,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        do {
            sum=0;
            while (n !=0) {
                sum +=n%10;
                n=n/10;
            }  
            n=sum;
            System.out.println("The Sum of Digit is ="+sum); 
        } while (sum>9);

    }
}
