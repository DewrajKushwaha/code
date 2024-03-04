import java.util.*;
public class TCS_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value for check even or odd");
        a=sc.nextInt();
        b=a%2;
        if(b==0){
            System.out.println("This is even number");
        }
       else{System.out.println("This is odd number");}
    }
}
