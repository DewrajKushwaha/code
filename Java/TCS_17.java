
// sum of odd and even number
import java.util.*;

public class TCS_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, m;
        int size;
        System.out.println(" Enter the max number you want to enter ");
        size = sc.nextInt();
        int arr[]=new int [size];
        System.out.println("\n Enter the element in array : ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sumOdd=0;
        int sumEven=0;
        for( i=0;i<size;i++)
        {
            if(arr[i]%2 ==0)
            {
                sumEven +=arr[i];
            }
            else{
                sumOdd += arr[i];
            }
        }
        System.out.println("The even number is : ");
        for(i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println(" The sum of even is :"+sumEven);
        System.out.println("The odd number is : ");
        for(i=0;i<size;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println(" The sum of odd is :"+sumOdd);
    }

}
