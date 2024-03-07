
import java.util.*;
public class ArmstongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int temp,num,res,arm=0;
        System.out.println("Enter the number for check armstrong");
        num=sc.nextInt();
        temp=num;                
            while (num>0) {
                res=num%10;
                arm=arm+(res*res*res);
                num=num/10;
            }
            if (temp == arm) {
                System.out.println("The is Armstrong number ");
            }
            else{
                System.out.println("This is not armstrong number");
            }
              
    }
}
 
