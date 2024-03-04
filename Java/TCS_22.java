import java.util.*;
public class TCS_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1,i;
        System.out.println("Enter the number to find factorial");
        int num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact *=i;
        }
        System.out.println(" The factroil value is : "+fact);
    }
    
}
