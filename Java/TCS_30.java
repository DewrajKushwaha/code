import java.util.*;
public class TCS_30 {
    public static void main(String[] args) {
        int i,num,max,Q[];
        Scanner sc=new Scanner(System.in);
        Q=new int[30];
        System.out.println("Enter the total number :");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" number ");
        for( i=0;i<n;i++)
        {
            Q[i]=sc.nextInt();
        }
        max=Q[0];
        for(i=0;i<n;i++)
        {

            if (max<Q[i]) {
                max=Q[i];
            }
        }
        System.out.println("The Max Number is : "+max);
        
    }
}
