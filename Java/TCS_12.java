import java.util.*;
public class TCS_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the year for check leap year");
        a=sc.nextInt();
        b=a%4;
        if(b==0){
            System.out.println("This is leap year");
        }
       else{System.out.println("This is not leap year");}
    }
}
