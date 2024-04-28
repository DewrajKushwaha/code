import java.util.*;
/**
 * SortingArray
 */
public class SortingArray {

    public static void main(String[] args) {
        int arr[]=new int[10];
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array is : ");
        n=sc.nextInt();
        System.out.println("Enter the "+n+" element in array ");
        for ( i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        
        //Selection sort
        for(i=0;i<n-1;i++)
        {
            for (int j = i+1; j < n; j++) {
                if (arr[i]>arr[j]) {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(" The sorted array is ");
        for ( i = 0; i <n; i++) {
            System.out.print(" "+arr[i]);
            
        }
    }
}