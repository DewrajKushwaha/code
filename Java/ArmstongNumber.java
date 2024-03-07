
import java.util.*;
public class ArmstongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int temp,num,res,arm=0;
        System.out.println("Enter the number for check armstrong");
        num=sc.nextInt();
        temp=num;
        int ch;
        System.out.println("Choice 1 for logic method \n Or 0 for Predefined method ");
        ch=sc.nextInt();
        switch (ch) {
            case 1:
                
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
                break;
            case 0: if (isArmstrongNumber(num)){
                System.out.println("The is Armstrong number ");
            }
            else{
                System.out.println("This is not armstrong number");
            } break;
            default:
                break;
        }
    }
}
 