// Greatest value
import java.util.*;
public class TCS_10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 number for check Greatest number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(" The value of a = "+a+" is greater ");
        }
        else if(b>a && b>c){
            System.out.println(" The value of b = "+b+" is greater ");
        } 
        else{
           System.out.println(" The value of c = "+c+" is greater ");
        }
    }
}
