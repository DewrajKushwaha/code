import java.util.Scanner;

public class add_two_num {
    public static void main (String [] args){
        int n1,n2,sum;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        n1=scanner.nextInt();
        System.out.println("Enter second number");
        n2=scanner.nextInt();
        sum=n1+n2;
        System.out.println("Sum is : " + sum);

    }
    
}
