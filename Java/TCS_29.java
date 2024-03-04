import java.util.*;
public class TCS_29 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,i,n;
       
        float sum=0,Q[];
        Q=new float[30];
        System.out.println("Enter the number of Array element");
        n=sc.nextInt();
        System.out.println("Enter the "+n+" number :");
        for(i=0;i<n;i++)
        {
            Q[i]=sc.nextInt();
            sum=sum+Q[i];
        }
        System.out.println("The Number is : ");
        for(i=0;i<n;i++)
        {
            System.out.println(Q[i]);
        }
        float avg=sum/n;
        System.out.println("The sum of number :"+sum);
        System.out.println("The avrage of number :"+avg);
    }
}