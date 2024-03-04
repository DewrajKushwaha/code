//centigrade to faranhat
import java.util.*;

public class TCS_Q4 {

    public static void main(String[] args) {
        
        
        float c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in Centigrade");
        c=sc.nextInt();
        f=(1.8f*c)+32;
        System.out.println(" The temp in faranhat : " +f);
    }
}