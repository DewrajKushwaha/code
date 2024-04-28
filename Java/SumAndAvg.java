import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int i,n;
        int sum=0;
        float avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array is : ");
        n=sc.nextInt();
        System.out.println("Enter the "+n+" element in array ");
        for ( i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            sum +=arr[i];
        }
        System.out.println(" The sum is = "+sum);
        avg=sum/n;
        System.out.println("The Avgrage is = "+avg);
    }
}
